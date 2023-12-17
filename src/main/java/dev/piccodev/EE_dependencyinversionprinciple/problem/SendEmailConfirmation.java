package dev.piccodev.EE_dependencyinversionprinciple.problem;

import dev.piccodev.AA_singleresponsibilityprinciple.problem.Order;
import dev.piccodev.AA_singleresponsibilityprinciple.problem.SmtpGmail;
import dev.piccodev.EE_dependencyinversionprinciple.solution.SendEmailRepository;

public class SendEmailConfirmation implements SendEmailRepository {

    public void sendConfirmationEmail(Order order){
        System.out.println("Sending email confirmation...");

        SmtpGmail smtpGmail = new SmtpGmail("user", "password");
        smtpGmail.sendEmail(order.getCustomerEmail(), "Thanks!", "Thank you for buying our new product!");
    }
}
