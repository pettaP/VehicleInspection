/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intergration;
import  ExternalSys.GarageDoor;
import  ExternalSys.QueDisplay;

/**
 *
 * @author Peter
 */
public class Garage {
    
    GarageDoor  garageDoor;
    QueDisplay  queDisplay;
    
    public void Garage (){
        this.garageDoor = new GarageDoor();
        this.queDisplay = new QueDisplay();
    }
    
    public void newCustomer (){
        queDisplay.nextCustomer();
        garageDoor.openDoor();
    }
    
    public void closeDoor(){
        garageDoor.closeDoor();
    }
}
