package inheritance_polymorphism.entities;

import inheritance_polymorphism.entities.enums.Color;

//class Circle extend from Shape for Exercise53
public class Circle extends Shape {
    
    private Double radius;

    //Shape is an abstract class, so must have this @Override area()
    @Override
    public Double area() {

        return Math.PI * radius * radius;   //Math.PI represents the PI constant
    }

    public Circle() {
    }

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}