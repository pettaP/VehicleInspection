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
public class CreditCard {
    
    int     pin;
    String  cardNumber;
    String  cardHolder;
    int     expiryDate;
    int     cvc;
    
    /**
     * creates a object credit card with information nesserary for payment and authorization
     * @param pin pin code of the card
     * @param cardNumber card numer of the credit card
     * @param cardHolder name of the person that owns the cradit card used for payment
     * @param expiryDate expiry date of the cradit card
     * @param cvc cvc code of the credit card
     */
    public CreditCard(int pin, String cardNumber, String cardHolder, int expiryDate,int cvc){
        this.pin = pin;
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expiryDate = expiryDate;
        this.cvc = cvc;
    }
    
    /**
     * returns pincode
     * @return pincode of credit card
     */
    public int getPin(){
        return this.pin;
    }
    
    /**
     * returns number of credit card
     * @return credit card number
     */
    public String getCardNumber(){
        return this.cardNumber;
    }
    
    /**
     * returns namne of card holder
     * @return name of card holder
     */
    public String getCardHolder(){
        return this.cardHolder;
    }
    
    /**
     * returns the epiry date of the credit card
     * @return expiry date of credit card
     */
    public int getExpiryDate(){
        return this.expiryDate;
    }
    
    /**
     * returns the cvc code of the credit card
     * @return the cvc code of credit card
     */
    public int getCvc(){
        return this.cvc;
    }
}
