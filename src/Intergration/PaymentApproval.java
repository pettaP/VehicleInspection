/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intergration;
import Model.*;
/**
 *
 * @author Peter
 */
public class PaymentApproval {
    
    /**
     * The attributes dafaultBalance and dummyCardNumber are created to have something to compare to since the real bank doesnt exist
     */
    int         defaultBalance = 1000;
    String      dummyCardNumber = "1234567890";
    CreditCard  creditCardToBeApproved;
    int         costToBeChargedToCreditCard;
    
    /**
     * Takes an object off CreditCard and cost of inspection to create an object paymenApproval to used to get authorzation of the payment with the credit card
     * @param currentCreditCard the customers credit card
     * @param currentInspectionCost the total cost of all inspections to be preformed on vehicle
     */
    public PaymentApproval(CreditCard currentCreditCard, int currentInspectionCost){
        this.creditCardToBeApproved = currentCreditCard;
        this.costToBeChargedToCreditCard = currentInspectionCost;
    }
    
    /**
     * Checks if the cardnumber of customers creditcard is true and if there is enough balance on customers account for payment of inspection cost
     * @return a boolean value true/false if payment is possible 
     */
    public boolean getAuth(){
        boolean auth = (creditCardToBeApproved.getCardNumber().equals(this.dummyCardNumber)) && (costToBeChargedToCreditCard < defaultBalance);
        System.out.println ("\n" + "Returning if credit card is approved for the current transaction based on inspection cost and credit card information. " + "CreditCard approved: " + auth);
        return auth;
    }
}
