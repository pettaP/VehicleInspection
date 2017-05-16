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
    
    public void printStats(){
        System.out.println ("---------------------------------------------------");
        System.out.println ("---------------INSPECTION STATISTICS---------------");
        System.out.println ("Total number of inspections: " + totalIns);
        System.out.println ("Number of passed inspections: " + passedIns);
        System.out.println ("Number of failed inspections: " + failedIns);
        System.out.println ("---------------------------------------------------");        
    }

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
