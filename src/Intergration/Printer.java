/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intergration;
import  Model.*;

/**
 *
 * @author Peter
 */
public class Printer {
    
    public Printer(){
        
    }
    
    public void printCustomerReceipt(Receipt currentReceiptToPrint){
       System.out.println ("Amount due: " + currentReceiptToPrint.getAmountDue());
       System.out.println ("Amonut received: " + currentReceiptToPrint.getAmountPaid());
       System.out.println ("Taxes included in price: " + currentReceiptToPrint.getVat());
       System.out.println (currentReceiptToPrint.getComment());
    }
    
}
