/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controller.Controller;
import Intergration.VehicleDataBase;
import Intergration.Printer;
import View.*;

/**
 *
 * @author Peter
 */
public class Inspect_Vehicle {
    
    /**
     * Setup for the program. Calling constructors in the program
     * @param Args 
     */
    public static void main (String[] Args){
       
       VehicleDataBase  vdb = new VehicleDataBase();
       Printer          printer = new Printer();
       Controller       contrl = new Controller(vdb, printer);
       View             view = new View(contrl);
       
       view.runProgram();
   }
    
}
