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
public class QueDisplay {
    
    int currentQueNumber;
    
    /**
     * The constructor set the default value of the display to zero
     */
    public void QueDispaly(){
        this.currentQueNumber = 0;
    }
    
    /**
     * This method displays the next number on the display
     */
    public void nextCustomer(){
        this.currentQueNumber++;
    }
    
    /**
     * This method return the current que number being displayed 
     * @return 
     */
    public int getCurrentQueNumber(){
        return this.currentQueNumber;
    }
    
}
