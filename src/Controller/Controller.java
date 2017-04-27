/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Intergration.*;
import Data.*;
import Model.*;

/**
 *
 * @author Peter
 */
public class Controller {
    
    Garage garage;
    VehicleDataBase vehicledatabase;
    Inspection  currentInspection;
    
    public Controller(){
        this.garage = new Garage();
    }
    
    public void startInspection(){
        garage.newCustomer();
    }
    
    public void closeDoor(){
        garage.closeDoor();
    }
    
    public int searchInspectionCost (String regNum){
        
        this.currentInspection = new Inspection(regNum, vehicledatabase.getInspectionList(regNum));
        int inspectionCost = currentInspection.getInspectionCost();
        
        return inspectionCost;
    }
    
}
