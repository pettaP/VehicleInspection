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
    
    public PaymentByCard(CreditCard customerCreditCard, int inspetionCost){
        PaymentApproval currentPaymentApp = new PaymentApproval(this);
        this.isPaymentAuthorized = currentPaymentApp.getAuth();
    }
    
    public CreditCard getCreditCard(){
        return this.customerCreditCard;
    }
    
    public int getInspectionCost(){
        return this.inspectionCost;
    }
    
    public boolean isPaymentAuthorized(){
        return this.isPaymentAuthorized;
    }
}
