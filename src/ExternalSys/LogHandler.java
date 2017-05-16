/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExternalSys;

import Intergration.InvalidRegNumException;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author Peter
 */
public class LogHandler {
    private static final String Log_File_Name = "inspections-log.txt";
    private PrintWriter logFile;
    
    public LogHandler()throws IOException{
        logFile = new PrintWriter(new FileWriter(Log_File_Name), true);
    }
    
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
}
