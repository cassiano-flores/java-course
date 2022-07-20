package inheritance_polymorphism.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

//class UsedProduct extend from Product for Exercise52
public class UsedProduct extends Product {

    private Date manufactureDate;  //when the used product was made

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public String priceTag() {

        setName(getName() + " (used)");
        return super.priceTag() + " (Manufacture date: " + sdf.format(manufactureDate) + ")";
    }       //@Override priceTag() just change the name, so all we have to do is getName and setName

    public UsedProduct() {
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
}