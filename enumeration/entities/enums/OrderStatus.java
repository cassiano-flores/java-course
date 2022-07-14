package enumeration.entities.enums;

public enum OrderStatus {

    //all this status are related constants, so they have the same "type"
    //transform this enum to String when is printed on the screen (will print exactly what is written)

    PENDING_PAYMENT,
    PROCESSING,
    SHIPPED,
    DELIVERED;
}