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
    
    public void QueDispaly(){
        this.currentQueNumber = 0;
    }
    
    public void nextCustomer(){
        this.currentQueNumber++;
    }
    
}
