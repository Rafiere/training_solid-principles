package dev.piccodev.AA_singleresponsibilityprinciple.solution;

import dev.piccodev.AA_singleresponsibilityprinciple.problem.Order;

public class OrderProcessor {

    /* Instead of all implementations stay here, we sent each implementation to
    * a different class. */

    public void process(Order order){

            PostgresRepository repository = new PostgresRepository("postgres://localhost:5432/postgres");
            repository.save(order);

            SendConfirmaitonMail mail = new SendConfirmaitonMail();
            mail.sendConfirmationMail(order);
    }
}