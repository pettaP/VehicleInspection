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
     * constructor creates instances of Singleton Garagedoor and Quedisplay
     */
    public Garage (){
        this.garageDoor = GarageDoor.getGarageDoor();
        this.queDisplay = QueDisplay.getDisplay();
    }
    
    /**
     * When this method is called is changes the number on the que display and opens the garage door
     */
    public void newCustomer (){
        queDisplay.nextCustomer();
        garageDoor.openDoor();
        System.out.println ("\n" + "Opening garage door and changing number on quenumber display");
    }
    
    /**
     * When this method is called the garagedoor is closed 
     */
    public void closeDoor(){
        garageDoor.closeDoor();
        System.out.println ("\n" + "Closing the garage door");
    }
    
    /**
     * Code for testing methods
     * @return true if door is open and que numer is 1
     */
    public boolean isDoorOpenAndDisplayOne(){
        return (garageDoor.isDoorOpen() == true) && (queDisplay.getCurrentQueNumber() == 1);
    }
}
