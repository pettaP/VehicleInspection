/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import  Main.*;
import  Controller.*;

/**
 *
 * @author Peter
 */
public class View {
    
    Controller  contrl;
    int         inspectioncost;
    
    public View(Controller contrl){
        this.contrl = contrl;
    }
    
    public void runProgram (){
        
        contrl.startInspection();
        
        contrl.closeDoor();
        
        inspectioncost = contrl.searchInspectionCost("abc123");
        System.out.print ("The inspection cost is: " + inspectioncost);
        
        contrl.payCard(1234, "1234567890", "Tomas Andersson", 213, 311);
        
        //String nextSpecefiedInstruction = contrl.getNextSpecefiedInspection(isCurrentInspectionPassed, currentInspectionResults)
        
        contrl.printInspectionResults();
    }
    
}
