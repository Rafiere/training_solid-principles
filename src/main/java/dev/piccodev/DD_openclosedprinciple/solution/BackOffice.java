package dev.piccodev.DD_openclosedprinciple.solution;

public class BackOffice implements GenerateExcelSalesReport, GeneratePDFSalesReport {


    @Override
    public void generateExcel() {

        System.out.println("Generating excel report...");
    }

    @Override
    public void generatePDF() {

        System.out.println("Generating PDF report...");
    }
}
