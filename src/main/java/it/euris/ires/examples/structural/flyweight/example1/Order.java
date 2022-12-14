package it.euris.ires.examples.structural.flyweight.example1;

public class Order {

    private final int orderNumber;
    private final Item item;

    public Order(int orderNumber, Item item) {
        this.orderNumber = orderNumber;
        this.item = item;
    }

    void processOrder() {
        System.out.println("Ordering " + item + "for order number " + orderNumber);
    }
}
