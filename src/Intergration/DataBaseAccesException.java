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
public class DataBaseAccesException extends Exception {
    
    /**
     * interface method used for retreving the error message of the exception
     * @param e an exception 
     */
    public DataBaseAccesException(Exception e){
        super(e.getMessage());
    }
    
    
}
