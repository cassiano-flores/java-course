package object_oriented_programming.entities;

//class converter for the Exercise36 (learning static)
public class CurrencyConverter {

    public static final double IOF = 6.0;

    public static double converter(double price, double bought){

        return (bought + (bought * (IOF/100))) * price;
    }
}
