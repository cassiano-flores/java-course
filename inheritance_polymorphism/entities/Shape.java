package inheritance_polymorphism.entities;

import inheritance_polymorphism.entities.enums.Color;

//abstract class Shape for Exercise53  (this is the superclass (BASE class) 
//                                  so I have to create this one first than all the others subclasses)
public abstract class Shape {
    
    private Color color;

    public abstract Double area();  //abstract method, without body

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}