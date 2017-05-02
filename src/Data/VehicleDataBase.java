/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author Peter
 */
public class VehicleDataBase {
    
    SpecefiedInspection[]   vehicledatabase;
    String                  regNum;
    
    /**
     * The cinstructor creates an instance of a "dummy" SpeciefiedInspection list. 
     * This list contains objects of SpecefiedInspection with item be inspected and their cost
     * it also sets the attribut regNum to "abc123" to be matched with the parameter sent to the method in the class
     */
    public VehicleDataBase(){
        
        SpecefiedInspection[]   vehicledatabase = {    (new SpecefiedInspection("Breaks", 30)), 
                                                       (new SpecefiedInspection("Steering", 50)), 
                                                       (new SpecefiedInspection(null, 0))};
        this.regNum = "abc123";
    }
    
    /**
     * This method checks the regnumber in the parameter and returns a list of speciefied inspections if the parameter is the same as the attribute in the class
     * @param regNum - the registration number of the vehicle that is about to be inspected
     * @return a list of specefied inspections and the cost of the pecefied inspection
     */
    public SpecefiedInspection[] getInspectionList(String regNum){
        
        if (regNum.equalsIgnoreCase(this.regNum)){
            return  this.vehicledatabase;
        }
        else
            return null; 
    }
    
}
