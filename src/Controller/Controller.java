/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Intergration.DataBaseAccesException;
import Intergration.VehicleDataBaseHandeler;
import Intergration.*;
import Model.*;
import Observer.InspectionObserver;
import View.InspectionStatsView;

/**
 *
 * @author Peter
 */
public class Controller {
    
    Garage                  garage;
    VehicleDataBaseHandeler vehicledatabase;
    Inspection              currentInspection;
    String                  customerRegNum;
    CreditCard              customerCreditCard;
    int                     inspectionCost;
    CashRegister            cashRegister;
    Printer                 printer;
    InspectionObserver      insObs;
    boolean                 finalInspectionResult;
    
    /**
     * This creates an instance of controller and also starts up the classes Garage and CashRegister and sets them as attributes in the class
     */
    public Controller(VehicleDataBaseHandeler newVehicleDataBase, Printer newPrinter, InspectionObserver insObs){
        this.garage = new Garage();
        this.printer = newPrinter;
        this.cashRegister = new CashRegister(printer);
        this.vehicledatabase = newVehicleDataBase;
        this.insObs = insObs;
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
     * @throws Intergration.DataBaseAccesException 
     */
    public int searchInspectionCost (String regNum)throws DataBaseAccesException{
        this.customerRegNum = regNum;
        
        this.currentInspection = new Inspection(regNum, vehicledatabase.getInspectionList(regNum), insObs);
        this.inspectionCost = this.currentInspection.getInspectionCost();
        
        System.out.println ("\n" + "Displaying inspection cost for vehicle");
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
    
    /**
     * This method checks if the current inspection list has a nother element. Tis is for the while loop in view when inspection items are sent to the inspector
     * @return true if there is another element in the array. Otherwise reurns false
     */
    public boolean arrayHasNext(){
        return currentInspection.arrayHasNext();
    }
    
    /**
     * This method uses the specefied inspection list an iterrates through it return each component that needs to be inspected on the vehicle
     * @param isCurrentInspectionPassed a string pass/fail telling the program if component passed inspection
     * @param currentInspectionResults a string of comments about the inspected component
     * @return a string specifing the next component to be inspected
     */
    public String getNextSpecefiedInspection(String isCurrentInspectionPassed, String currentInspectionResults){
        System.out.println ("\n" + "Fetching the components that are to be inspected and storing the result of the inspection");
        return currentInspection.getNextSpecefiedInspection(isCurrentInspectionPassed, currentInspectionResults);
    }
  
    /**
     * This method gathers the information stored about each inspected component on the vehicle and sends the to the printer
     * to be printedt out and handed to the customer.
     * It also activates the method checksatae in the inspection class which notifies the observing class
     */
    public void printInspectionResults (){
        printer.printResults(currentInspection.getSpecefiedInspectionList());
        currentInspection.checkState();
    }
    /**
     * Method is used for chaning the logger betwee printing to a file or printing to the console
     * @param log an instance of the interface log
     */
    public void setLog(Log log){
        vehicledatabase.setLog(log);
    }
    
    /**
     * Used for retreving the current logger used for printing the exceptions 
     * @return the current logger used
     */
    public Log getLogger(){
        return vehicledatabase.getLogger();
    }
    
}
