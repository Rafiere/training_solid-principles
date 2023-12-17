package dev.piccodev.BB_openclosedprinciple.problem;


import dev.piccodev.AA_singleresponsibilityprinciple.problem.Order;
import dev.piccodev.EE_dependencyinversionprinciple.problem.PostgresRepository;
import dev.piccodev.EE_dependencyinversionprinciple.problem.SendEmailConfirmation;

public class OrderProcessor {

    /* This class contains an OCP violation. The class needs a change and we are
    * changing directly in the class. */

    public void process(Order order){

        if(order.hasItems()){

            throw new RuntimeException("The order must have items!");
        }

        PostgresRepository pgRepo = new PostgresRepository();
        SendEmailConfirmation sendEmail = new SendEmailConfirmation();

        //Business rule:
        System.out.println("This is a business rule that must be executed before saving the order.");
        order.setCustomerName("Teste");
        order.setCustomerEmail("teste@teste.com");
        order.setId(47);

        pgRepo.save(order);

        sendEmail.sendConfirmationEmail(order);

        if(!order.isValid()){
            throw new RuntimeException("The order is not valid!");
        }
    }
}
