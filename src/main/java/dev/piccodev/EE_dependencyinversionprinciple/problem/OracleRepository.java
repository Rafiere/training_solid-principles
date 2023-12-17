package dev.piccodev.EE_dependencyinversionprinciple.problem;

import dev.piccodev.AA_singleresponsibilityprinciple.problem.Order;
import dev.piccodev.EE_dependencyinversionprinciple.solution.DatabaseRepository;

public class OracleRepository implements DatabaseRepository {

    public boolean save(Order order){
        OracleConnection connection = new OracleConnection("url");

        try {
            connection.save(order);
        } catch(Exception e){
            System.out.println("An exception occurred while saving the order.");
            System.out.println(e.getMessage());
            return false;
        }

        return true;
    }
}
