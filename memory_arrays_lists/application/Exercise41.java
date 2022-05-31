package memory_arrays_lists.application;

import java.util.Scanner;

import memory_arrays_lists.entities.Rent;

//a hotel have 10 rooms, the user informs how many rooms will be rented, and then register the students
//exercising arrays
public class Exercise41 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Rent[] room = new Rent[10];
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        int chooseRoom = 0;

        while (n < 1 || n > 10){    //write control

            if (n < 1){
            System.out.println("What? I dont undestand");
            n = sc.nextInt();
            }
            else{
                System.out.println("We have just 10 rooms");
                n = sc.nextInt();
            }
        }

        for (int i=1; i <= n; i++){    //student registrar 

            sc.nextLine();
            System.out.print("\nRent #" + i);

            System.out.print("\nName: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            chooseRoom = sc.nextInt();

            while (0 > chooseRoom || chooseRoom > 9){    //write control again

                System.out.println("We dont have this option");
                chooseRoom = sc.nextInt();
            }

            Boolean opt = true;
            while (opt == true){

                if (room[chooseRoom] == null){
                    System.out.println("\nRoom registred!");
                    opt = false;
                }
                else{
                 System.out.println("\nRoom is already ocupated, please choose another");
                 chooseRoom = sc.nextInt();
                }
            }

            room[chooseRoom] = new Rent(name, email, chooseRoom);   //instantiating the students, putting each data in an index 
        }

        System.out.println("\nBusy rooms: ");    //final print
        for (int i=0; i < room.length; i++){

            if (room[i] != null){
                System.out.println(i + ": " + room[i]);
            }
        }

        sc.close();
    }
}