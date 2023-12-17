package dev.piccodev.EE_dependencyinversionprinciple.solution;

import dev.piccodev.AA_singleresponsibilityprinciple.problem.Order;
import dev.piccodev.EE_dependencyinversionprinciple.problem.OracleRepository;
import dev.piccodev.EE_dependencyinversionprinciple.problem.PostgresRepository;
import dev.piccodev.EE_dependencyinversionprinciple.problem.SendEmailConfirmation;

public class OrderProcessor {

    private DatabaseRepository databaseRepository;
    private SendEmailRepository sendEmailRepository;

    public OrderProcessor(DatabaseRepository databaseRepository, SendEmailRepository sendEmailRepository){
        this.databaseRepository = databaseRepository;
        this.sendEmailRepository = sendEmailRepository;
    }

    public void process(Order order){

        PostgresRepository postgresRepository = new PostgresRepository();
        OracleRepository oracleRepository = new OracleRepository();

        SendEmailConfirmation sendEmailConfirmation = new SendEmailConfirmation();
        boolean isOracle = true;

        if(isOracle){
            oracleRepository.save(order);
        } else {
            postgresRepository.save(order);
        }

        sendEmailConfirmation.sendConfirmationEmail(order);
    }
}
