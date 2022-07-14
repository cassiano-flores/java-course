package enumeration.entities;

//class OrderItem for Exercise49
public class OrderItem {

    //attributes
    private Integer quantity;
    private Double price;

    //associations
    private Product product;
    
    public Double subTotal(){

        return quantity * price;
    }

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    //toString with some "gets" from Product class
    @Override
    public String toString() {
        return getProduct().getName() + ", $" + String.format("%.2f", product.getPrice()) + ", Quantity: "
               + quantity + ", Subtotal: $" + String.format("%.2f", subTotal());
    }

    //toString with StringBuilder
/*
    public String toString() {

        StringBuilder sb = new StringBuilder();   
        
        sb.append(product.getName() + ", $" + String.format("%.2f", product.getPrice()) + ", Quantity: " + quantity + ", Subtotal: $" + String.format("%.2f", subTotal()));
        
        return sb.toString();
    }
    */
}