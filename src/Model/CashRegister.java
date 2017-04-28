/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Intergration.*;
/**
 *
 * @author Peter
 */
public class CashRegister {
    
    private int  balance;
    public int   recivedPayment;
    Printer      printer;
    Receipt      customerReceipt;
            
    public CashRegister(){
        this.balance = 1000;
        this.printer = new Printer();
        this.customerReceipt = new Receipt();
    }
    
    public void addPaymentByCard(PaymentByCard paymentByCard){
        if (paymentByCard.isPaymentAuthorized()== true){
            this.recivedPayment = this.recivedPayment + paymentByCard.getInspectionCost();
            this.balance = this.balance + paymentByCard.getInspectionCost();
            printer.printCustomerReceipt(customerReceipt.makeReceipt(paymentByCard));
        }
        else
            printer.printCustomerReceipt(customerReceipt.makeReceipt(paymentByCard));
        
    }
}
