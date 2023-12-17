package dev.piccodev.BB_openclosedprinciple.solution;

import dev.piccodev.AA_singleresponsibilityprinciple.problem.Order;
import dev.piccodev.BB_openclosedprinciple.problem.OrderProcessor;

public class OrderProcessorWithValidation extends OrderProcessor {

    public void process(Order order){

        if(!order.hasItems()){
            throw new IllegalArgumentException("Invalid order");
        }

        /* We are adding the new functionalities in a class that extends the
        * original class, in this way, our class is closed to modifications, but
        * open for extensions. */
        super.process(order);

        if(!order.isValid()){

            throw new IllegalArgumentException("Invalid order");
        }
    }
}
