package dev.piccodev.EE_dependencyinversionprinciple.problem;

import dev.piccodev.AA_singleresponsibilityprinciple.problem.Order;

public class Main {

    public static void main(String[] args) {

        OrderProcessor orderProcessor = new OrderProcessor();

        orderProcessor.process(new Order());
    }
}
