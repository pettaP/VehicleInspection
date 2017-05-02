/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Intergration.*;
import Data.*;
import Controller.*;
/**
 *
 * @author Peter
 */
public class Inspection {
    
    String                  regNum;
    SpecefiedInspection[]   inspectionList;
    int                     costOfInspection;
    
    /**
     * The constructor creates a new Inspection and set the attributes of this to the current registartion number, 
     * the specified inspection list, and the totalt cost of the specefied inspections
     * @param regNum the registartion number of the vehicle to be inspected
     * @param inspectionList the list recevied from the class VehicleDataBase containing the inspections for the vehicle
     */
    public Inspection (String regNum, SpecefiedInspection[] inspectionList){
        this.regNum = regNum;
        this.inspectionList = inspectionList;
        this.costOfInspection = calculateCost(inspectionList);
    }
    
    /**
     * This method takes sends the inspection list to a method in the class SpeciedfiedInspection where the cost for the inspection is calculated and sent back
     * @param inspectionList contanins the specefied inspections
     * @return the total cost for all inspections of the vehicle
     */
    private int calculateCost(SpecefiedInspection[] inspectionList){
        int cost = 0;
        for (SpecefiedInspection inspectionList1 : inspectionList) {
            cost = cost + inspectionList1.getCostOfComponentToInspect();
        }
        
        return cost;
    }
    /**
     * Gets the total inspection cost of the vehicle 
     * @return the total cost for all inspections on the vehicle
     */
    public int getInspectionCost (){
        return this.costOfInspection;
    }
}
