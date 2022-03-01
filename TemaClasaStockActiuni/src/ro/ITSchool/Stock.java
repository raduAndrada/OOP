package ro.ITSchool;

public class Stock {


    private String simbol;
    private String stock;
    private double closingPrice;
    private double currentPrice;
    private double changePercent;

    //-------------------------------------//

    public String getSimbol() {
        return simbol;
    }

    public void setSimbol(String simbol) {
        this.simbol = simbol;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public double getClosingPrice() {
        return closingPrice;
    }

    public void setClosingPrice(double closingPrice) {
        this.closingPrice = closingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void setChangePercent(double changePercent) {
        this.changePercent = changePercent;
    }

    public double getChangePercent() {
        return changePercent;
    }

    //------------------------------------------------------//

    public double getChangePercent(double currentPrice) {



        if (closingPrice - currentPrice > 0) {
            changePercent = ((closingPrice - currentPrice) / currentPrice) * 100;
            System.out.println(getSimbol() + " closing percent is: " + changePercent + " incrase");

        } else {
            changePercent = ((currentPrice - closingPrice) / currentPrice) * 100;
            System.out.println(getSimbol() + " closing percent is: " + changePercent + " decrase");
        }


        return getChangePercent();
    }

}
