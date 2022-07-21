package exception_handling.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exception_handling.model.entities.Reservation;
import exception_handling.model.exceptions.DomainException;

//learning exception handling, with try catch and personalized exceptions
public class Exercise55 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //try to execute all this code, if there is an error in some moment the right catch will handle
        try {
            //-----first step, enter the data for a hotel reservation
            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();

            System.out.print("Check-in date (DD/MM/YYYY): ");
            Date checkIn = sdf.parse(sc.next());  //dont need a throws declaration at main because after we have a catch

            System.out.print("Check-out date (DD/MM/YYYY): ");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut); //instance the reservation
            System.out.println("\nReservation: " + reservation);  //print


            //-----second step, update your reservation days
            System.out.println("\nEnter data to update the reservation: ");
            System.out.print("Check-in date (DD/MM/YYYY): ");
            checkIn = sdf.parse(sc.next());

            System.out.print("Check-out date (DD/MM/YYYY): ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);  //this method test an error before do it,
                                                         //and if there is an error, the catch will resolve that
            System.out.println("\nReservation: " + reservation);  //print
        }
        catch (ParseException e) {  //ParseException for date formats
            System.out.println("Invalid date format");
        }
        catch (DomainException e){  //DomainException is a personalized class with different messages
            System.out.println("Error in reservation: " + e.getMessage());
        }
        catch (RuntimeException e) {  //any other RuntimeException (dont need to handle) in this "try", this catch will resolve
            System.out.println("Unexpected error");
        }

        sc.close();
     }
}