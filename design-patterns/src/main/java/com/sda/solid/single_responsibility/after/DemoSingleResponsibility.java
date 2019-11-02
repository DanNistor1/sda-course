package com.sda.solid.single_responsibility.after;


// each class has a single purpose and all it's methods should relate to function
public class DemoSingleResponsibility {

    public static void main(String[] args) {

        HRPromotions hrPromotions = new HRPromotions();
        TaxCalculation taxCalculation = new TaxCalculation();
        Employee employee = new Employee();
        
        hrPromotions.isPromotionDueThisYear(employee);
        taxCalculation.calculateTaxForCurrentYear(employee);

    }
}
