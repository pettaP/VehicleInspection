/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import  Data.*;
import  Intergration.*;
import  Model.*;
import  Controller.*;
import  View.*;
/**
 *
 * @author Peter
 */
public class StartUp {
    
   public static void Main (String[] Args){
       
       VehicleDataBase  vdb = new VehicleDataBase();
       Controller       contrl = new Controller();
       View             view = new View();
       Printer          printer = new Printer();
   }
}


