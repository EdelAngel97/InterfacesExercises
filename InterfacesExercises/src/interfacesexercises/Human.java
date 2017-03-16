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
public class Human {
    
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name + '}';
}
}
