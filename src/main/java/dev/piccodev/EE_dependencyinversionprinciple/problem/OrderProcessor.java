package dev.piccodev.EE_dependencyinversionprinciple.problem;

import dev.piccodev.AA_singleresponsibilityprinciple.problem.Order;

public class OrderProcessor {

    public void process(Order order){
        System.out.println("Processing the order...");

        OracleRepository oracleRepository = new OracleRepository();
        oracleRepository.save(order);

        SendEmailConfirmation sendEmailConfirmation = new SendEmailConfirmation();
        sendEmailConfirmation.sendConfirmationEmail(order);
    }
}
