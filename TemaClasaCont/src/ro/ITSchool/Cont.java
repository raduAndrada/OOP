package ro.ITSchool;

import java.util.Date;
import java.util.Scanner;

public class Cont {

    private int idCont;
    private double soldCont;
    private double soldContAfter;
    private double annualInterestRate;
    private double monthInterest;
    private double sumaDepusa;
    private Date dateCreated;


    public Cont (int idCont, Date dateCreated){
        this.idCont = idCont;
        this.dateCreated = new Date();
    }

    public void deposit(double sumaDepusa) {
        this.soldCont = soldCont + sumaDepusa;
        System.out.println("Deposit of " + sumaDepusa + " made. New balance is " + this.soldCont);
    }


    public void interest(double annualInterestRate) {
        this.monthInterest = annualInterestRate / 12 * soldCont;
        System.out.println("Monthly interest value is: "+ monthInterest);

        this.soldCont = soldCont + monthInterest;
        System.out.println("New sold after one month including monthly interest is: " + this.soldCont);

    }


    public void withdraw(double withdrawAmount) {
        this.soldCont = soldCont - withdrawAmount;
        System.out.println("You withdraw " + withdrawAmount + " , your new balance is: " + this.soldCont);
    }


    public void setIdCont(int idCont) {
        this.idCont = idCont;
    }

    public int setIdCont() {
        return idCont;
    }

    public void setSoldCont(double soldCont) {

        this.soldCont = soldCont;
    }

    public double getSoldCont() {

        return soldCont;
    }

    public void setSoldContAfter(double soldContAfter) {                 // suma retrasa
        this.soldContAfter = soldContAfter;
    }

    public double getSoldContAfter(double soldContAfter) {
        return soldContAfter;
    }

    public void setSumaDepusa(double sumaDepusa) {
        this.sumaDepusa = sumaDepusa;
    }

    public double getSumaDepusa() {
        return sumaDepusa;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return sumaDepusa;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }


    public double retragereSuma(double soldContAfter) {
        return soldCont;
    }

    public void setMonthInterest(double monthInterest) {
        this.monthInterest = monthInterest;
    }

    public double getMonthInterest(double monthInterest) {
        return monthInterest;
    }


}
