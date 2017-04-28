/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Intergration.*;
import Data.*;
import Model.*;

/**
 *
 * @author Peter
 */
public class Controller {
    
    Garage          garage;
    VehicleDataBase vehicledatabase;
    Inspection      currentInspection;
    String          regNum;
    CreditCard      customerCreditCard;
    int             inspectionCost;
    CashRegister    cashRegister;
    
    /**
     * This creates an instance of controller and also starts up the classes Garage and CashRegister and sets them as attributes in the class
     */
    public Controller(){
        this.garage = new Garage();
        this.cashRegister = new CashRegister();
    }
    
    /**
     * This method  is called to open the garage door and display a new number on the que display
     */
    public void startInspection(){
        garage.newCustomer();
    }
    
    /**
     * This method closes the garage door 
     */
    public void closeDoor(){
        garage.closeDoor();
    }
    
    /**
     * This method is used for returning the cost of the inspection according to the vehicle
     * @param regNum registartion number of the vehicle to be inspected 
     * @return the cost of the inspection 
     */
    public int searchInspectionCost (String regNum){
        this.regNum = regNum;
        this.currentInspection = new Inspection(regNum, vehicledatabase.getInspectionList(regNum));
        this.inspectionCost = currentInspection.getInspectionCost();
        
        return inspectionCost;
    }
    
    /**
     * 
     * @param pin
     * @param cardNumber
     * @param cardHolder
     * @param expiryDate
     * @param cvc 
     */
    public void payCard(int pin, String cardNumber, String cardHolder, int expiryDate,int cvc){
        this.customerCreditCard = new CreditCard(pin, cardNumber, cardHolder, expiryDate, cvc);
        PaymentByCard currentTransaction = new PaymentByCard(this.customerCreditCard, this.inspectionCost);
        cashRegister.addPaymentByCard(currentTransaction);
    }
    
}
