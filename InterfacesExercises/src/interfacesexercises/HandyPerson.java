/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesexercises;

/**
 *
 * @author LuisGuillermo
 */
public class HandyPerson extends Human implements IPlumber, IElectrician {
    
    public HandyPerson(String name) {
        super(name);
    }

    @Override
    public String unplugDrain() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String changeBulb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "HandyPerson{"+super.toString() + '}';
}
}
