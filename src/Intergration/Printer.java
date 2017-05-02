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
    
    /**
     * Takes an boject of Receipt and uses the getters of the object to fill out a receipt that is printed to the customer
     * @param currentReceiptToPrint obejct of Receipt with all payment information stored
     */
    public void printCustomerReceipt(Receipt currentReceiptToPrint){
       System.out.println ("Amount due: " + currentReceiptToPrint.getAmountDue());
       System.out.println ("Amonut received: " + currentReceiptToPrint.getAmountPaid());
       System.out.println ("Taxes included in price: " + currentReceiptToPrint.getVat());
       System.out.println (currentReceiptToPrint.getComment());
    }
    
}
