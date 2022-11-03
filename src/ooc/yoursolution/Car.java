/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.util.Map;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author Helder Camara and Taina Goncalves
 */
        
    public class Car implements CarInterface {
    
    int id;
    Make make;
    double rate;
    Map<Month, boolean[]> availability;
    
    public Car(int id, Make make, int rate){
        this.id = id;
        this.make = make;
        this.rate = rate;
        this.availability = createAvailability();   
    }
    

    @Override
    public Map<Month, boolean[]> createAvailability() {
       return availability;
    }

    @Override
    public Make getMake() {
        return make;
    }

    @Override
    public void setMake(Make make) {
       this.make = make;
    }

    @Override
    public double getRate() {
        return rate;
    }

    @Override
    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public Map<Month, boolean[]> getAvailability() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAvailability(Map<Month, boolean[]> availability) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean isAvailable(Month month, int day) {
        
return false;
       
    }

    @Override
    public boolean book(Month month, int day) {
        return false;
    }
    
}

   
