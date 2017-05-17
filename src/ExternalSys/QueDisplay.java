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
    public static final QueDisplay  QUE_DISPLAY = new QueDisplay();
    int currentQueNumber;
    
    /**
     * The constructor set the default value of the display to zero
     * Constructor declared as private. Singleton
     */
    private QueDisplay(){
        this.currentQueNumber = 0;
    }
    
    /**
     *Method for returning this instance and activating the constructor
     * @return this instance of QueNumberDisplay
     */
    public static QueDisplay getDisplay(){
        return QUE_DISPLAY;
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
