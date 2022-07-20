package inheritance_polymorphism.entities;

import inheritance_polymorphism.entities.enums.Color;

//class Rectangle extend from Shape for Exercise53
public class Rectangle extends Shape {
    
    private Double width;
    private Double height;

    //Shape is an abstract class, so must have this @Override area()
    @Override
    public Double area() {

        return width * height;
    }

    public Rectangle() {
    }

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}