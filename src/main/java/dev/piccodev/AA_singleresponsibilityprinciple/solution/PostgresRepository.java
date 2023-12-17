package dev.piccodev.AA_singleresponsibilityprinciple.solution;

import dev.piccodev.AA_singleresponsibilityprinciple.problem.Order;

public class PostgresRepository {

    public PostgresRepository(String url){
        System.out.println("Connecting to the database...");
    }

    public void save(Order order){
        System.out.println("Saving the order...");
    }
}
