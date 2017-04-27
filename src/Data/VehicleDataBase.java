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
    
    public VehicleDataBase(){
        
        SpecefiedInspection[]   vehicledatabase = {    (new SpecefiedInspection("Breaks", 30)), 
                                                       (new SpecefiedInspection("Steering", 50)), 
                                                       (new SpecefiedInspection(null, 0))};
        this.regNum = "abc123";
    }
    
    public SpecefiedInspection[] getInspectionList(String regNum){
        
        if (regNum.equalsIgnoreCase(this.regNum)){
            return  this.vehicledatabase;
        }
        else
            return null; 
    }
    
}
