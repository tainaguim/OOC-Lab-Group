/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.util.List;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author Helder Camara and Taina Goncalves
 */

public class RentACar implements RentACarInterface {
    
    List<CarInterface> rentACar;
    String name;

    public RentACar(List<CarInterface> cars, String name) {
        this.rentACar = cars;
        this.name = name;
    }

    @Override
    public List<CarInterface> getCars() {

        return this.rentACar;
    }

    @Override
    public void setCars(List<CarInterface> cars) {
        this.rentACar = cars;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
//this method checks the car's availability
    @Override
    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {
        for (CarInterface car : rentACar) {
            if (car.getMake().equals(make)) {
                if (car.isAvailable(month, day)) {
                    return true;
                }
            }
        }
        return false;
    }
//looping trough the available cars to pass the information to the user
    @Override
    public int getCarAvailable(Month month, int day, Make make, int lengthOfRent) {
        for (CarInterface car : rentACar) {
            if (car.getMake().equals(make)) {
                return car.getId();
            }
        }
        return 0;

    }
//when a car is being booked, the program will execute this piece of code and take one car from the list
    @Override
    public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
        int bookACar = getCarAvailable(month, day, make, lengthOfRent);

        if (bookACar <= 0) {
            System.out.println("Please pick another car");
        } else {
            for (int i = 0; i < lengthOfRent; i++) {
                rentACar.get(bookACar - 1).book(month, day + i);
            }
        }
        return false;
    }
//get how many cars are avaible
    @Override
    public int getNumberOfCars() {
        return rentACar.size();
    }

}