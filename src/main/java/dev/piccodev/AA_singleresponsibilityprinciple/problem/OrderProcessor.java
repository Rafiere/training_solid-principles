package dev.piccodev.AA_singleresponsibilityprinciple.problem;

public class OrderProcessor {

    /* This class contains a SRP violation. */

    /* It contains the database, business rule and email implementation. */

    public Order process(Order order){

        boolean isSaved = save(order);

        if(order.isValid() && isSaved){
            sendConfirmationEmail(order);
        }

        return order;
    }

    private boolean save(Order order){

        PostgresConnection dbConnection = new PostgresConnection("database.url");

        try {

            dbConnection.save(order);

        } catch(Exception e){
            System.out.println("An exception occurred while saving the order.");
            System.out.println(e.getMessage());
            return false;
        }

        return true;
    }

    private void sendConfirmationEmail(Order order) {

        SmtpGmail smtpGmail = new SmtpGmail("smtpUser", "smtpPassword");

        String name = order.getCustomerName();
        String email = order.getCustomerEmail();

        String html = "<h1>Order Confirmation</h1><p>Hi, " + name + "! Your order has been confirmed.</p>";

        smtpGmail.sendEmail(email, "Order Confirmation", html);
    }
}
