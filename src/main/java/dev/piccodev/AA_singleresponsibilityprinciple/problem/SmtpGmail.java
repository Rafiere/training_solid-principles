package dev.piccodev.AA_singleresponsibilityprinciple.problem;

public class SmtpGmail {

    public SmtpGmail(String user, String password){

        System.out.println("Connecting to the SMTP server...");
    }

    public void sendEmail(String to, String subject, String body){

        System.out.println("Sending the email...");
    }
}
