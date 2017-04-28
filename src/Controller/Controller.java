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
    
    public Controller(){
        this.garage = new Garage();
        this.cashRegister = new CashRegister();
    }
    
    public void startInspection(){
        garage.newCustomer();
    }
    
    public void closeDoor(){
        garage.closeDoor();
    }
    
    public int searchInspectionCost (String regNum){
        this.regNum = regNum;
        this.currentInspection = new Inspection(regNum, vehicledatabase.getInspectionList(regNum));
        this.inspectionCost = currentInspection.getInspectionCost();
        
        return inspectionCost;
    }
    
    public void payCard(int pin, String cardNumber, String cardHolder, int expiryDate,int cvc){
        this.customerCreditCard = new CreditCard(pin, cardNumber, cardHolder, expiryDate, cvc);
        PaymentByCard currentTransaction = new PaymentByCard(this.customerCreditCard, this.inspectionCost);
        
    }
    
}
