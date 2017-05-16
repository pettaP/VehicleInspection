/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intergration;

/**
 *
 * @author Peter
 */
public class InvalidRegNumException extends Exception {
    
    private String invalidRegNum;
    
    public InvalidRegNumException(String invalidRegNum){
        super("Unable to find inspections for reg number: " + invalidRegNum + "\nPlease try again");
        this.invalidRegNum = invalidRegNum;
    }
    
    public String getInvalidRegNum(){
        return this.invalidRegNum;
    }
}
