/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Intergration.Garage;

/**
 *
 * @author Peter
 */
public class Controller {
    
    Garage garage;
    
    public Controller(){
        this.garage = new Garage();
    }
    
    public void startInspection(){
        garage.newCustomer();
    }
    
    public void closeDoor(){
        garage.closeDoor();
    }
    
}
