package dev.piccodev.DD_openclosedprinciple.problem;

public class BackOffice implements GenerateSalesReport {

    @Override
    public void generateExcel(){

        System.out.println("Generating excel report...");
    }

    @Override
    public void generatePDF(){

            System.out.println("Generating PDF report...");
    }
}
