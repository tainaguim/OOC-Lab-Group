/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author Helder Camara and Taina Goncalves
 */

public class BookingSystem implements BookingSystemInterface {

    @Override
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {

        // A new object of type RentACaarInterface was created in order to store all the cars list read from the file given.
        RentACarInterface rentacar = new RentACar();

        in.readLine();// this code will read the first line and wont save it anywhere as we dont need it
        String text = in.readLine(); // this code will store the second line value inside of a variable that ccan be used further
        String[] carSplit; // Object fro splitting the values 

        // This loop-condition was created for the reading of each line inside the file
        do {

            carSplit = text.split(":"); //storing the text splitted by ":" in a variable String[] 

            CarAtt car = new CarAtt(carSplit[0], Integer.parseInt(carSplit[1]), Integer.parseInt(carSplit[2])); // creating a new object of CarAtt car to store the splitted text
            rentacar.getCars();
            text = in.readLine(); // read next line in the file

        } while (text != null);

        return rentacar;
    }

}

