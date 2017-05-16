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
    
    public DataBaseAccesException(Exception e){
        super(e.getMessage());
    }
    
    
}
