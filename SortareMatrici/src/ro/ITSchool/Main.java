package ro.ITSchool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Introdu numarul de coloane: ");
        int coloane = scan.nextInt();

        System.out.println("Introdu numarul de linii: ");
        int linii = scan.nextInt();

        int[][] matrice = new int[linii][coloane];


        for (int i = 0; i < linii; i++) {
            for (int j = 0; j < coloane; j++) {
                System.out.println("Enter the array elements");
                matrice[i][j] = scan.nextInt();


            }

        }
        System.out.print("The array is: \n");
        for (int i = 0; i < linii; i++) {
            for (int j = 0; j < coloane; j++) {
                System.out.print(matrice[i][j] + " ");

            }
            System.out.println();
        }

    }
}
