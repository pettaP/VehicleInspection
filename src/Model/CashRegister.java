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
    
    /**
     * The constuctor creates the object CashRegister and sets the starting balance of cash to 1000
     * It creates an instance of the object Printer used for printing the receipt
     * It creates an instance of the object Receipt where information about the transaction is stored. This is later sent to the printer
     */
    public CashRegister(Printer newPrinter){
        this.balance = 1000;
        this.printer = newPrinter;
        this.customerReceipt = new Receipt();
    }
    
    /**
     * Checks if the customers credit card is authorized for payment and if so, updates the attributes of the cashregister and prints the receipt 
     * If not authorized it doesn't update the attributes of cashregister
     * It also creates a receipt with information and sends this to the printer
     * @param paymentByCard 
     */
    public void addPaymentByCard(PaymentByCard paymentByCard){
        System.out.println ("\n" + "Card is approved and the payment is registerd in CashRegister and balance is updated");
        if (paymentByCard.isPaymentAuthorized()== true){
            this.recivedPayment = this.recivedPayment + paymentByCard.getInspectionCost();
            this.balance = this.balance + paymentByCard.getInspectionCost();
            printer.printCustomerReceipt(customerReceipt.makeReceipt(paymentByCard));
        }
        else
            printer.printCustomerReceipt(customerReceipt.makeReceipt(paymentByCard));
        
    }
}
