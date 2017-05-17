/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import  Controller.*;
import ExternalSys.ConsoleLogger;
import ExternalSys.LogHandler;
import Intergration.DataBaseAccesException;
import java.io.IOException;
import java.util.Scanner;

/**
 *Hardcoded code to run the program and make all the calls 
 * @author Peter
 */
public class View {
    
    Controller  contrl;
    int         inspectioncost;
    boolean     search = true;
    
    public View(Controller contrl) throws IOException{
        this.contrl = contrl;
    }
    
    public void runProgram(){
        Scanner     sc = new Scanner (System.in);
        
        
        
            contrl.startInspection();

            contrl.closeDoor();

            while(search){
            try{
                System.out.println ("\nEnter current registration number: ");
                String  regNum = sc.nextLine();
                inspectioncost = contrl.searchInspectionCost(regNum);
                search = false;
                }
                catch(DataBaseAccesException e){
                    System.out.println (e.getMessage());
                    System.out.println ("\nWould you like to change logger?");
                    System.out.println ("Yes/No");
                    String answer = sc.nextLine();
                    if (answer.equalsIgnoreCase("yes")){
                        if( contrl.getLogger() instanceof LogHandler)
                            contrl.setLog(ConsoleLogger.getConsoleLogger());
                        else
                            contrl.setLog(LogHandler.getLogHandler());
                    }
                }
            }


            System.out.print ("\nThe inspection cost is: " + inspectioncost + "\n");

            contrl.payCard(1234, "1234567890", "Tomas Andersson", 213, 311);

            System.out.println ("\n" + "press enter to start receive inspection item");
            String line1 = sc.nextLine();
            System.out.println ("Press enter to start");
            String line2 = sc.nextLine();

            while (contrl.arrayHasNext()){

                String nextSpecefiedInspection = contrl.getNextSpecefiedInspection(line1, line2);
                System.out.println ("\n" + nextSpecefiedInspection);
                System.out.println ("\n"+"Is inspection passed? pass/fail: ");
                line1 = sc.nextLine();
                System.out.println ("Comment to current inspection: ");
                line2 = sc.nextLine();
            }

            System.out.println  (contrl.getNextSpecefiedInspection(line1, line2));

            System.out.println ();
            contrl.printInspectionResults();
            
        }    
       
    
    
}
