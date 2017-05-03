/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intergration;

import Intergration.SpecefiedInspection;

/**
 *
 * @author Peter
 */
public class VehicleDataBase {
    
    SpecefiedInspection[]   currentInspectionList;
    String                  regNum;
    
    /**
     * The cinstructor creates an instance of a "dummy" SpeciefiedInspection list. 
     * This list contains objects of SpecefiedInspection with item be inspected and their cost
     * it also sets the attribut regNum to "abc123" to be matched with the parameter sent to the method in the class
     */
    public VehicleDataBase(){
        
        SpecefiedInspection[]   temp                  = {   (new SpecefiedInspection("Breaks", 30, "Comment", "fail")), 
                                                            (new SpecefiedInspection("Steering", 50, "Comment", "pass" )), 
                                                            (new SpecefiedInspection("Window", 40, "Comment", "fail"))};
        this.currentInspectionList = temp;
        this.regNum = "abc123";
    }
    
    /**
     * This method checks the regnumber in the parameter and returns a list of speciefied inspections if the parameter is the same as the attribute in the class
     * Creates a new list of the items that needs to be inspected. The components which are amrked as fail or false for isInspectionPassed
     * @param customerRegNum - the registration number of the vehicle that is about to be inspected
     * @return a list of specefied inspections and the cost of the specefied inspection
     */
    public SpecefiedInspection[] getInspectionList(String customerRegNum){
        int counter = 0;
        
        for (SpecefiedInspection currentInspectionList1 : currentInspectionList) {
            if (currentInspectionList1.isInspectionPassed() == false) {
                counter++;
            }
        }
        int currentIndex = 0;
        SpecefiedInspection[]   currentSpecefiedInspectionList = new SpecefiedInspection[counter];
        
        if (customerRegNum.equalsIgnoreCase(this.regNum)){
            for (SpecefiedInspection currentInspectionList1 : currentInspectionList){
                if (currentInspectionList1.isInspectionPassed() == false){
                    currentSpecefiedInspectionList[currentIndex] = currentInspectionList1;
                    currentIndex++;
                }
            }
        }
        System.out.println ("\n" + "Creating and returning a specefied inspection list based on the registration number and which current inspections there are to be made");
        return currentSpecefiedInspectionList; 
    }
    
}
