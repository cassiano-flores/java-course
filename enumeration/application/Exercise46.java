package enumeration.application;

import java.util.Date;

import enumeration.entities.Order;
import enumeration.entities.enums.OrderStatus;

//learning enum, different status of an Order
public class Exercise46 {
    
    public static void main(String[] args) {
        
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        //transform String to enum, write a identical String to recognize the enum
        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
