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
    
    /**
     * constructor creates instances of Garagedoor and Quedisplay
     */
    public void Garage (){
        this.garageDoor = new GarageDoor();
        this.queDisplay = new QueDisplay();
    }
    
    /**
     * When this method is called is changes the number on the que display and opens the garage door
     */
    public void newCustomer (){
        queDisplay.nextCustomer();
        garageDoor.openDoor();
    }
    
    /**
     * When this method is called the garagedoor is closed 
     */
    public void closeDoor(){
        garageDoor.closeDoor();
    }
}
