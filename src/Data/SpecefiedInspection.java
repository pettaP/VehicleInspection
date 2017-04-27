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
    
    public SpecefiedInspection(String component, int cost){
        this.componentToInspect = component;
        this.costOfComponentToInspect = cost;
    }
    
    public String getComponentToInspect(){
        return this.componentToInspect;
    }
     
    public int getCostOfComponentToInspect(){
        return this.costOfComponentToInspect; 
    }
}
