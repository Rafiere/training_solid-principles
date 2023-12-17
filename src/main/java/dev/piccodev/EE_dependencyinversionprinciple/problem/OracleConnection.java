package dev.piccodev.EE_dependencyinversionprinciple.problem;

import dev.piccodev.AA_singleresponsibilityprinciple.problem.Order;

public class OracleConnection {

    public OracleConnection(String url){
        System.out.println("Connecting to the database...");
    }

    public void save(Order order){
        System.out.println("Saving the order in the Oracle database...");
    }
}
