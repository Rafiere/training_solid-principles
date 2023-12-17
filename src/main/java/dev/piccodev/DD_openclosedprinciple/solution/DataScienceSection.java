package dev.piccodev.DD_openclosedprinciple.solution;

/* This class will implements only the interface it needs. */
public class DataScienceSection implements GenerateExcelSalesReport {


    @Override
    public void generateExcel() {

        System.out.println("Generating excel report...");
    }
}
