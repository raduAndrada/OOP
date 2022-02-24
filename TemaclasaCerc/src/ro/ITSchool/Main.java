package ro.ITSchool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introdu raza cercului: ");
        Cerc calcul = new Cerc();

        calcul.setRaza(scan.nextDouble());
        calcul.getFormulaAria();

        System.out.println("Aria cercului este: " + calcul.getFormulaAria());

    }
}
