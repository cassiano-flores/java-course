package inheritance_polymorphism.entities;

//class ImportedProduct extend from Product for Exercise52
public class ImportedProduct extends Product {

    private Double customsFee;

    //totalPrice is the existent price (getPrice) plus the customsFee
    public Double totalPrice(){

        return getPrice() + customsFee;
    }

    @Override
    public String priceTag() {

        setPrice(totalPrice());
        return super.priceTag() + " (Customs fee: $ " + String.format("%.2f", customsFee) + ")";
    }      //@Override priceTag() just change the price for the totalPrice,
           //so all we have to do is setPrice to totalPrice

    public ImportedProduct() {
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
}