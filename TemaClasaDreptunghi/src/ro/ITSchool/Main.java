package ro.ITSchool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Dreptunghi rectangle = new Dreptunghi(7, 4);


        System.out.println("Area: "+ rectangle.getArea(7, 4));
        System.out.println("Perimetre: "+ rectangle.getPerimeters(7, 4));

    }
}

