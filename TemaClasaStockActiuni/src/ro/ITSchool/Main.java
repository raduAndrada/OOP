package ro.ITSchool;

public class Main {

    public static void main(String[] args) {


        Stock bursa = new Stock();

        bursa.setStock("Etherium");
        bursa.setSimbol("ETH");
        bursa.setCurrentPrice(2919.20);
        bursa.setClosingPrice(2621.17);

        bursa.getChangePercent(bursa.getCurrentPrice());



    }
}
