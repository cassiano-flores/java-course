package object_oriented_programming.entities;

//class Product for Exercise37
public class Product {
    
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {    //constructor

        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {                           //getters and setters
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    //public void setQuantity(int quantity) {       //not make sense a setQuantity in this business
    //    this.quantity = quantity;
    //}

    public double totalValueInStock(){          //methods
        
        return price * quantity;
    }

    public void addProducts(int quantity){

        this.quantity = this.quantity + quantity;
    }

    public void removeProducts(int quantity){

        this.quantity = this.quantity - quantity;
    }

    public String toString(){              //toString (convert the results in a String)

        return name 
                + ", $ " 
                + String.format("%.2f", price) 
                + ", " 
                + quantity
                + " units, Total: $ " 
                + String.format("%.2f", totalValueInStock());
    }
}
