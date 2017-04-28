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
    
    boolean isDoorOpen;
    
    public void GargeDoor(){
        this.isDoorOpen = false;
    }
    
    public void openDoor(){
        this.isDoorOpen = true;
    }
    
    public void closeDoor(){
        this.isDoorOpen = false;
    }
}
