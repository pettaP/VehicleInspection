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
    
    public CreditCard(int pin, String cardNumber, String cardHolder, int expiryDate,int cvc){
        this.pin = pin;
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expiryDate = expiryDate;
        this.cvc = cvc;
    }
    
    public int getPin(){
        return this.pin;
    }
    
    public String getCardNumber(){
        return this.cardNumber;
    }
    
    public String getCardHolder(){
        return this.cardHolder;
    }
    
    public int getExpiryDate(){
        return this.expiryDate;
    }
    
    public int getCvc(){
        return this.cvc;
    }
}
