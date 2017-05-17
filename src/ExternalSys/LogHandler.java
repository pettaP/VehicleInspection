/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExternalSys;

import Intergration.InvalidRegNumException;
import Intergration.Log;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *This class is a Singleton
 * @author Peter
 */
public class LogHandler implements Log {
    private static final LogHandler LOG_HANDLER = new LogHandler();
    private static final String Log_File_Name = "inspections-log.txt";
    private PrintWriter logFile;
    
    /**
     * The constructor. Createsa new instance of logfile to print the error codes to
     */
    
    private LogHandler(){
        try{
            logFile = new PrintWriter(new FileWriter(Log_File_Name), true);
        }
        catch(IOException e){}
    }
    /**
     *Comes from the interface Log. This method creates a message describing the exception and the registration number which caused it
     * It also print this message plus the stacktrace to the log file
     * @param exc the exception created when invalid registartion naumber was entered
     */
    @Override
    public void logException(InvalidRegNumException exc){
        StringBuilder sb = new StringBuilder();
        sb.append ("Invalid registration number, ");
        sb.append ( exc.getInvalidRegNum()); 
        sb.append (", was entered at ");
        sb.append (createTime());
        logFile.println (sb);
        exc.printStackTrace(logFile); 
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
     * Returns itself
     * @return this instance of ConsoleLogger
     */
    public static LogHandler getLogHandler(){
        return LOG_HANDLER;
    }
}
