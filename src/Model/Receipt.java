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
    
    public int getAmountDue(){
        return this.amountDue;
    }
    
    public int getAmountPaid(){
        return this.amountPaid;
    }
            
    public double getVat(){
        return this.vat;
    }
    
    public String getComment(){
        return this.comment;
    }
    
}
