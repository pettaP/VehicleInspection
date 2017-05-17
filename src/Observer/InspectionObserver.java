/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author Peter
 */
public interface InspectionObserver {
    
    /**
     * Interface method. Alters the stats of the total performed inspections in the program
     * @param finalIns booleans value representing if the current vhecile inspection is passed 
     */
    void stateHasChanged(boolean finalIns);
}
