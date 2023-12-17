package dev.piccodev.CC_liskovsubstitutionprinciple.problem;

/* We are extend, like the OCP wants, but we are breaking the
* client throwing an exception. */
public class PackagingValidator extends OrderStockValidator {

    /* This principle says the super class can be swapped with
    * subclass without break the client. */

    @Override
    public boolean isValid(Order order){

        for (Item item : order.getItems()) {
            if (!item.inStock()) {
                return false;
            }

            if (!item.isPackaged()) {
                throw new RuntimeException("Item was not packaged!");
            }
        }

        return true;
    }
}
