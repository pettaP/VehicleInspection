/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Peter
 */
public class Receipt {
    
    int     amountDue;
    int     amountPaid;
    double  vat;
    String  comment;
    
    public Receipt(){
        
    }
    
    /**
     * Checks if the authorization is approved and preforms logic and sets information for the receipt to be printed out by the printer
     * If the authrization isn't approved it sets the paid amount to zero and prints a comment
     * @param paymentByCard
     * @return an object of receipt
     */
    public Receipt makeReceipt(PaymentByCard paymentByCard){
        this.amountDue = paymentByCard.getInspectionCost();
        if (paymentByCard.isPaymentAuthorized() == true){
            this.amountPaid = paymentByCard.getInspectionCost();
            this.vat = this.amountDue * 0.25;
            this.comment = "Thank you, welcome back";
        }
        else{
            this.amountPaid = 0;
            this.vat = 0;
            this.comment = "Card payment was declined";
        }
        
        return this;
    }
    
    /**
     * Returns the amount to be paind by customer
     * @return amount to be paid by customer
     */
    public int getAmountDue(){
        return this.amountDue;
    }
    
    /**
     * Returns the amunt to be charged to the customers credit card
     * @return the amount charged to customer credit card
     */
    public int getAmountPaid(){
        return this.amountPaid;
    }
    
    /**
     * Returns the calculated taxes for the payment
     * @return the amount of taxes
     */
    public double getVat(){
        return this.vat;
    }
    
    /**
     * Returns the comment depending on if the credit card approvemnt was approved or declined
     * @return a string with specefied comment
     */
    public String getComment(){
        return this.comment;
    }
    
}
