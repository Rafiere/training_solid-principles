package dev.piccodev.AA_singleresponsibilityprinciple.solution;

import dev.piccodev.AA_singleresponsibilityprinciple.problem.Order;

/* We're breaking the responsibles in different classes. */

public class SendConfirmaitonMail {

    public void sendConfirmationMail(Order order){

        System.out.println("Sending the confirmation email...");
    }
}
