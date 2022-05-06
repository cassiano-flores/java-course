package object_oriented_programming.entities;
public class Triangle {

    public double a;
    public double b;
    public double c;

    public double area(){

        double p, area;

        p = (a + b + c) / 2;                             
        area = Math.sqrt(p*(p - a)*(p - b)*(p - c));

        return area;
    }
}
