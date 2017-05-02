/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author Peter
 */
public class SpecefiedInspection {
    
    String  componentToInspect;
    int     costOfComponentToInspect;
    
    /**
     * Creates an object of SpecefiedInspection containing the current component to be inspected and its cost
     * @param component component on vehicle to be inspected
     * @param cost the cost of inspection the current component
     */
    public SpecefiedInspection(String component, int cost){
        this.componentToInspect = component;
        this.costOfComponentToInspect = cost;
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
}
