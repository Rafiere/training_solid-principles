package dev.piccodev.CC_liskovsubstitutionprinciple.problem;

public class OrderStockValidator {

    public boolean isValid(Order order){

        return order.getItems()
                .stream()
                .allMatch(Item::inStock);
    }
}
