package dev.piccodev.CC_liskovsubstitutionprinciple.solution;

import dev.piccodev.CC_liskovsubstitutionprinciple.problem.Item;
import dev.piccodev.CC_liskovsubstitutionprinciple.problem.Order;
import dev.piccodev.CC_liskovsubstitutionprinciple.problem.OrderStockValidator;

public class PackagingValidator extends OrderStockValidator {

    /* We are returning "false" instead of throw an exception, and, in
    * this way we aren't breaking the client. */

    @Override
    public boolean isValid(Order order){

        for (Item item : order.getItems()) {
            if (!item.inStock()) {
                return false;
            }

            if (!item.isPackaged()) {
                return false;
            }
        }

        return true;
    }
}