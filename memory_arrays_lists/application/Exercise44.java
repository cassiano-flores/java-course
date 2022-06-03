package memory_arrays_lists.application;

import java.util.Scanner;

//inform a matrix of m lines and n columns, then write a number to discover the adjacent numbers
public class Exercise44 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n, m, x;

        System.out.print("How many lines: ");
        m = sc.nextInt();

        System.out.print("How many columns: ");
        n = sc.nextInt();

        int[][] mat = new int[m][n];   //create a matrix

        System.out.println("\nNow, write the numbers belonging to the matrix: ");

        for (int i=0; i < mat.length; i++ ){               //writing the numbers in the matrix
            for (int j=0; j < mat[i].length; j++){

                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("\nWrite a number to discover the respective adjacent numbers: ");
        x = sc.nextInt();

        for (int i=0; i < mat.length; i++ ){          //reading the numbers in the matrix
            for (int j=0; j < mat[i].length; j++){

                if (x == mat[i][j]){     //testing if the digitate number is equal to number in a certain position

                    System.out.println("\nPosition " + i + "," + j + " of " + x + ":");
                    if (i-1 >= 0){
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (j-1 >= 0){
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (i+2 <= m){
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                    if (j+2 <= n){
                        System.out.println("Right: " + mat[i][j+1]);
                    }                                                   //if doesnt check, dont write
                }
            }
        }

        sc.close();
    }
}