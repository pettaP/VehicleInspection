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
    
    public Inspection (String regNum, SpecefiedInspection[] inspectionList){
        this.regNum = regNum;
        this.inspectionList = inspectionList;
        this.costOfInspection = calculateCost(inspectionList);
    }
    
    private int calculateCost(SpecefiedInspection[] inspectionList){
        int cost = 0;
        for (SpecefiedInspection inspectionList1 : inspectionList) {
            cost = cost + inspectionList1.getCostOfComponentToInspect();
        }
        
        return cost;
    }
    
    public int getInspectionCost (String regNum){
        return this.costOfInspection;
    }
}
