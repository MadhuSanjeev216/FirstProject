package apps;

import exceptions.InvalidSalaryException;
import org.apache.log4j.Logger;
import service.TaxCalculator;

public class TaxCalculatorApp {
    public static Logger LOG = Logger.getLogger(TaxCalculatorApp.class);
    public static void main(String[] args) {
        TaxCalculator aTaxCalculator = new TaxCalculator();
//        double aSalary = 50000;
//
//        try {
//            LOG.info("The tax for salary: "+ aSalary + " is: "+aTaxCalculator.getTax(aSalary));
//            LOG.info("The tax for salary: "+ aSalary + " is: "+aTaxCalculator.getEffectiveTaxRate(aSalary));
//        } catch (InvalidSalaryException exp) {
//            LOG.error(exp.getMessage());
//        }
        double maxSalary = 350000;
        double aSalary = 50000;
        while (aSalary <= maxSalary){
            try {
                LOG.info("Salary: "+ aSalary + " Tax: "+aTaxCalculator.getTax(aSalary)+ " EffectiveTax: "+aTaxCalculator.getEffectiveTaxRate(aSalary));
            } catch (InvalidSalaryException exp) {
                LOG.error(exp.getMessage());
            }
            aSalary = aSalary + 10000;
        }
    }
}
