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
public interface Log {
 
    /**
     * interface method. Writes the exception occurred to either the log file or to the console depending on which class that is currently implementing it
     * @param exc an exception
     */
    public void logException(InvalidRegNumException exc);
}
