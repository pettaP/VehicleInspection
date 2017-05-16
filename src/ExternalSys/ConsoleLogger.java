/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExternalSys;

import Intergration.InvalidRegNumException;
import Intergration.Log;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author Peter
 */
public class ConsoleLogger implements Log {
    private static final ConsoleLogger CONSOLE_LOGGER = new ConsoleLogger();
    
    @Override
    public void logException(InvalidRegNumException exc){
        StringBuilder sb = new StringBuilder();
        sb.append ("Invalid registration number, ");
        sb.append ( exc.getInvalidRegNum()); 
        sb.append (", was entered at ");
        sb.append (createTime()+ "\n");
        System.out.println(sb.toString());
        
    }
    
    private String createTime(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        return now.format(formatter);
    }
    
    private ConsoleLogger(){
    }
    
    public static ConsoleLogger getConsoleLogger(){
        return CONSOLE_LOGGER;
    }
}
