package dev.piccodev.EE_dependencyinversionprinciple.solution;

import dev.piccodev.AA_singleresponsibilityprinciple.problem.Order;
import dev.piccodev.EE_dependencyinversionprinciple.problem.OracleRepository;
import dev.piccodev.EE_dependencyinversionprinciple.problem.PostgresRepository;

public class Main {

    public static void main(String[] args) {

        //We will pass the implementation of the repository and the email sender
        //to the OrderProcessor class constructor, instead of creating them inside the class
        //This way, we can easily change the implementation of the repository and the email sender
        //without having to change the OrderProcessor class.

        PostgresRepository pgRepo = new PostgresRepository();
        OracleRepository oracleRepo = new OracleRepository();
        SendConfirmationEmailImpl sendConfirmationEmail = new SendConfirmationEmailImpl();

        Order order = new Order();

        OrderProcessor orderProcessor = new OrderProcessor(pgRepo, sendConfirmationEmail);

        orderProcessor.process(order);
    }
}
