package ro.ITSchool;

import java.util.Scanner;

public class Cerc {
    Scanner scan = new Scanner(System.in);

    private double raza ;
    private double formulaAria;

    public void setRaza(double raza) {
        this.raza = raza;
    }

    public double getFormulaAria() {
        formulaAria = (3.14 * (raza * raza));
        return formulaAria;

    }
}



