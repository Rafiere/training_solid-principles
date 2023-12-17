package dev.piccodev.EE_dependencyinversionprinciple.solution;

import dev.piccodev.AA_singleresponsibilityprinciple.problem.Order;

public class SendConfirmationEmailImpl implements SendEmailRepository {

    @Override
    public void sendConfirmationEmail(Order order) {

        System.out.println("Sending email confirmation...");

        System.out.println(order.getCustomerEmail() + ", thanks for buying our new product!");
    }
}
