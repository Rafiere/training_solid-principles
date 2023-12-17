package dev.piccodev.EE_dependencyinversionprinciple.solution;

import dev.piccodev.AA_singleresponsibilityprinciple.problem.Order;

public interface DatabaseRepository {

    boolean save(Order order);
}
