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
public class PaymentByCard {
    
    CreditCard  customerCreditCard;
    int         inspectionCost;
    boolean     isPaymentAuthorized;
    
   /**
    * Creator creates an object PaymentByCard that can be sent to CashRegster with payment information.
    * It also checks if the card provided by customer is authorized for the cost of the inspection
    * @param customerCreditCard
    * @param currentInspectionCost 
    */
    public PaymentByCard(CreditCard customerCreditCard, int currentInspectionCost){
        this.customerCreditCard = customerCreditCard;
        this.inspectionCost = currentInspectionCost;
        PaymentApproval currentPaymentApp = new PaymentApproval(this.customerCreditCard, this.inspectionCost);
        this.isPaymentAuthorized = currentPaymentApp.getAuth();
    }
    
    /**
     * Returns the boject CreditCard
     * @return the object CreditCard
     */
    public CreditCard getCreditCard(){
        return this.customerCreditCard;
    }
    
    /**
     * Returns the cost of the inspection stored in this object
     * @return total cost of inspection
     */
    public int getInspectionCost(){
        return this.inspectionCost;
    }
    
    /**
     * Returns the boolean value if the card is authorized for payment
     * @return boolean value, true/fasle
     */
    public boolean isPaymentAuthorized(){
        return this.isPaymentAuthorized;
    }
}
