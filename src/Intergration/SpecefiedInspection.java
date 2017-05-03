/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intergration;

/**
 *
 * @author Peter
 */
public class SpecefiedInspection {
    
    String  componentToInspect;
    int     costOfComponentToInspect;
    String  inspectionResult;
    boolean passInspection;
    
    /**
     * Creates an object of SpecefiedInspection containing the current component to be inspected and its cost
     * @param component component on vehicle to be inspected
     * @param cost the cost of inspection the current component
     */
    public SpecefiedInspection(String component, int cost, String inspectionResult, String isPassed){
        this.componentToInspect = component;
        this.costOfComponentToInspect = cost;
        this.inspectionResult = inspectionResult;
        if (isPassed.equalsIgnoreCase("pass"))
            passInspection = true;
        else
            passInspection = false;
    }
    
    /**
     * Returns the curent component to be inspected
     * @return the current component
     */
    public String getComponentToInspect(){
        return this.componentToInspect;
    }
    
    /**
     * Returns the cost for inspection the current component
     * @return cost of inspection current component
     */
    public int getCostOfComponentToInspect(){
        return this.costOfComponentToInspect; 
    }
    
    /**
     * stores inspection result as a comment
     * @param newInspectionResult a string
     */
    public void setInspectionResult (String newInspectionResult){
        this.inspectionResult = newInspectionResult;
    }
    
    /**
     * returnes inspection comment of current component
     * @return String of comment
     */
    public String getInspectionComment (){
        return this.inspectionResult;
    }
    
    /**
     * Checks if the current component has passed inspection
     * @return 
     */
    public boolean isInspectionPassed(){
        return this.passInspection;
    }
    
    /**
     * Sets the status of inspected component. Pass or fail
     * @param isPassed a string which is checked and boolean set accordingly 
     */
    public void setInspectionPassed (String isPassed){
        if (isPassed.equalsIgnoreCase("pass"))
            this.passInspection = true;
        if (isPassed.equalsIgnoreCase("fail"))
            this.passInspection = false;
    }
}
