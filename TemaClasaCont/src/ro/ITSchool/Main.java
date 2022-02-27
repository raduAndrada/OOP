package ro.ITSchool;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Cont banca = new Cont(1678, new Date());
        System.out.println(new Date());

        banca.deposit(16000);
        banca.interest(0.12);
        banca.withdraw(700);
        banca.deposit(600);


    }
}
