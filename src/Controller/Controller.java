/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Intergration.VehicleDataBase;
import Intergration.*;
import Model.*;

/**
 *
 * @author Peter
 */
public class Controller {
    
    Garage          garage;
    VehicleDataBase vehicledatabase;
    Inspection      currentInspection;
    String          customerRegNum;
    CreditCard      customerCreditCard;
    int             inspectionCost;
    CashRegister    cashRegister;
    Printer         printer;
    
    /**
     * This creates an instance of controller and also starts up the classes Garage and CashRegister and sets them as attributes in the class
     */
    public Controller(VehicleDataBase newVehicleDataBase, Printer newPrinter){
        this.garage = new Garage();
        this.printer = newPrinter;
        this.cashRegister = new CashRegister(printer);
        this.vehicledatabase = newVehicleDataBase;
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
        this.customerRegNum = regNum;
        this.currentInspection = new Inspection(regNum, vehicledatabase.getInspectionList(regNum));
        this.inspectionCost = this.currentInspection.getInspectionCost();
        
        return inspectionCost;
    }
    
    /**
     * This method takes the cardinformation from the customer and preforms the payment for the inspection
     * @param pin the pinnumber for the credit card
     * @param cardNumber the cardnumber of the customers credit card
     * @param cardHolder the namne of the person that owns the cradit card used fpr payment
     * @param expiryDate the expirydate for the card
     * @param cvc the cvc code of the card
     */
    public void payCard(int pin, String cardNumber, String cardHolder, int expiryDate,int cvc){
        this.customerCreditCard = new CreditCard(pin, cardNumber, cardHolder, expiryDate, cvc);
        PaymentByCard currentTransaction = new PaymentByCard(this.customerCreditCard, this.inspectionCost);
        cashRegister.addPaymentByCard(currentTransaction);
    }
    
    public boolean arrayHasNext(){
        return currentInspection.arrayHasNext();
    }
    
    public String getNextSpecefiedInspection(String isCurrentInspectionPassed, String currentInspectionResults){
        return currentInspection.getNextSpecefiedInspection(isCurrentInspectionPassed, currentInspectionResults);
    }
    
    public void printInspectionResults (){
        printer.printResults(currentInspection.getSpecefiedInspectionList());
    }
    
}
