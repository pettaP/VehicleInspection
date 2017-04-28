/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intergration;
import model.*;
/**
 *
 * @author Peter
 */
public class PaymentApproval {
    
    int         defaultBalance = 1000;
    String      dummyCardNumber = "1234567890";
    CreditCard  creditCardToBeApproved;
    int         costToBeChargedToCreditCard;
    
    public PaymentApproval(PaymentByCard currentTrans){
        this.creditCardToBeApproved = currentTrans.getCreditCard();
        this.costToBeChargedToCreditCard = currentTrans.getInspectionCost();
    }
    
    public boolean getAuth(){
        return (creditCardToBeApproved.getCardNumber.equals(this.dummyCardNumber)) && (costToBeChargedToCreditCard < defaultBalance);
    }
}
