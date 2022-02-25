package ro.ITSchool;

public class Dreptunghi {

    private double lenght;
    private double width;
    private double area;
    private double perimeters;

    public Dreptunghi(double lenght, double width) {

    }
    public void setArea(){
        this.area = area;
    }

    public double getArea(double lenght, double width) {

        area = width * lenght;

        return area;
    }

    public double getPerimeters(double lenght, double width) {
        perimeters = 2 * (width + lenght);

        return perimeters;
    }
}
