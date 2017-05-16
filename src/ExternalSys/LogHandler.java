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
 *
 * @author Peter
 */
public class LogHandler implements Log {
    private static final LogHandler LOG_HANDLER = new LogHandler();
    private static final String Log_File_Name = "inspections-log.txt";
    private PrintWriter logFile;
    
    private LogHandler(){
        try{
            logFile = new PrintWriter(new FileWriter(Log_File_Name), true);
        }
        catch(IOException e){}
    }
    
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
    
    private String createTime(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        return now.format(formatter);
    }
    
    public static LogHandler getLogHandler(){
        return LOG_HANDLER;
    }
}
