/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Observer.*;

/**
 *
 * @author Peter
 */
public class InspectionStatsView implements InspectionObserver{
    
    int totalIns;
    int passedIns;
    int failedIns;
    
    /**
     * This method prints out a message to the console dislaying the current stats for the inspections performed in the program
     */
    public void printStats(){
        System.out.println ("---------------------------------------------------");
        System.out.println ("---------------INSPECTION STATISTICS---------------");
        System.out.println ("Total number of inspections: " + totalIns);
        System.out.println ("Number of passed inspections: " + passedIns);
        System.out.println ("Number of failed inspections: " + failedIns);
        System.out.println ("---------------------------------------------------");        
    }
    
    /**
     * Method from the interface.
     * Recives a boolean value which alters the stats of the inspections performed depending on pass/fail - true/false
     * @param finalRes boolean value if the current inspection has passed all its indivdual inspections
     */
    @Override
    public void stateHasChanged(boolean finalRes) {
       totalIns++;
        if(finalRes == true)
           passedIns++;
       else if(finalRes == false)
           failedIns++;
        printStats();
    }
}
