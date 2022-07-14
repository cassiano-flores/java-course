package enumeration.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enumeration.entities.enums.OrderStatus;

//final class Order to Exercise49
public class Order {

    //attributes
    private Date moment;
    private OrderStatus status;

    //associations
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public void addItem(OrderItem item){

        items.add(item);
    }

    public void removeItem(OrderItem item){

        items.remove(item);
    }

    //sum all subTotals
    public Double total(){

        double sum = 0;

        for (int i=0; i<items.size(); i++){

            sum = sum + items.get(i).subTotal();
        }
        return sum;
    }

    public Order() {
    }

    //constructor without List
    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    //toString with StringBuilder
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " + sdf.format(moment));            //append function works like a sysout
        sb.append("\nOrder status: " + status);
        sb.append("\nClient: " + client);
        sb.append("\nOrder items: ");
        
        for (int i=0; i<items.size(); i++){

            sb.append("\n" + items.get(i));   //print every OrderItem (items.toString())
        }

        sb.append("\nTotal price: $" + String.format("%.2f", total()));

        return sb.toString();
    }
}