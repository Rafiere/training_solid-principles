package dev.piccodev.AA_singleresponsibilityprinciple.problem;

public class PostgresConnection {

    public PostgresConnection(String url){
        System.out.println("Connecting to the database...");
    }

    public void save(Order order){
        System.out.println("Saving the order...");
    }
}
