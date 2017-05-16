/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExternalSys;

/**
 *
 * @author Peter
 */
public class GarageDoor {
    
    private static final GarageDoor GARAGE_DOOR = new GarageDoor();
    boolean isDoorOpen;
    
    /**
     * The constuctor creates garageDoor and set the boolean value representing the door to false (closed) by default
     */
    private GarageDoor(){
        this.isDoorOpen = false;
    }
    
    public static GarageDoor getGarageDoor(){
        return GARAGE_DOOR;
    }
    /**
     * When openDoor is called the value of the garage door is set to true (open)
     */
    public void openDoor(){
        this.isDoorOpen = true;
    }
    
    /**
     * This method set the boolean value to flase (closed)
     */
    public void closeDoor(){
        this.isDoorOpen = false;
    }
    
    public boolean isDoorOpen(){
        return this.isDoorOpen;
    }
}
