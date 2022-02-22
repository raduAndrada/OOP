package ro.ITSchool;

import java.lang.reflect.Array;
import java.util.*;


public class Main {

    public static void main(String[] args) {


        int[] array = {16, 9, 94, 1940916, 270};

        System.out.println("Normal order: ");


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
        System.out.println("Reversed order: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");


        }


    }
}

