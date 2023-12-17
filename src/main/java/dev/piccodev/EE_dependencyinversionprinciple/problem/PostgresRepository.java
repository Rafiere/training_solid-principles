package dev.piccodev.EE_dependencyinversionprinciple.problem;

import dev.piccodev.AA_singleresponsibilityprinciple.problem.Order;
import dev.piccodev.AA_singleresponsibilityprinciple.problem.PostgresConnection;
import dev.piccodev.EE_dependencyinversionprinciple.solution.DatabaseRepository;

public class PostgresRepository implements DatabaseRepository {

    public boolean save(Order order){
        PostgresConnection connection = new PostgresConnection("url");

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
