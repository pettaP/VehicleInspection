
package ExternalSys;

import Intergration.InvalidRegNumException;
import Intergration.Log;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *This class is used via the interface Log to print out the chaught ecxeption onto the console
 * This class is a Singleton
 * @author Peter
 */
public class ConsoleLogger implements Log {
    private static final ConsoleLogger CONSOLE_LOGGER = new ConsoleLogger();
    
    /**
     * Comes from the interface Log. This method creates a message describing the exception and the registration number which caused it
     * @param exc the exception created when invalid registartion naumber was entered
     */
    @Override
    public void logException(InvalidRegNumException exc){
        StringBuilder sb = new StringBuilder();
        sb.append ("Invalid registration number, ");
        sb.append ( exc.getInvalidRegNum()); 
        sb.append (", was entered at ");
        sb.append (createTime()+ "\n");
        System.out.println(sb.toString());
        
    }
    /**
     * Creates a time for when the exception was created
     * @return the current time and date
     */
    private String createTime(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        return now.format(formatter);
    }
    
    /**
     * Constructor for consolelogger. Singleton
     */
    private ConsoleLogger(){
    }
    
    /**
     * Returns itself
     * @return this instance of ConsoleLogger
     */
    public static ConsoleLogger getConsoleLogger(){
        return CONSOLE_LOGGER;
    }
}
