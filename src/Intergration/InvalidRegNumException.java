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
    
    /**
     * creates a message describing the cause of the exception using the method inhereted from the superclass Exception
     * @param invalidRegNum the registartion number entered which caused the exception to occurr
     */
    public InvalidRegNumException(String invalidRegNum){
        super("Unable to find inspections for reg number: " + invalidRegNum + "\nPlease try again");
        this.invalidRegNum = invalidRegNum;
    }
    
    /**
     * used for reurning the registartion number which caused the exception
     * @return the registartion number which caused the exception
     */
    public String getInvalidRegNum(){
        return this.invalidRegNum;
    }
}
