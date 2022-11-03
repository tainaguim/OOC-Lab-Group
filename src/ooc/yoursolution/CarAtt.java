/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

/**
 *
 * @author Helder Camara and Taina Goncalves
 */

public class CarAtt {

    public final int carPrice;
    public final int carQt;
    private final String carMake;

    public CarAtt(String carMake, int carPrice, int carQt) {
        this.carMake = carMake;
        this.carPrice = carPrice;
        this.carQt = carQt;
    }

    
    //getters
    public String getCarMake() {
        return carMake;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public int getCarQt() {
        return carQt;
    }

    @Override
    public String toString() {
        return "CarAtt{" + "carMake=" + carMake + ", carPrice=" + carPrice + ", carQt=" + carQt + '}';
    }

}