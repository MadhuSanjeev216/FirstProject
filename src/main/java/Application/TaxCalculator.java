package Application;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.logging.Logger;

public class TaxCalculator {

    private static final Logger log = Logger.getLogger(String.valueOf(TaxCalculator.class));
        private static final DecimalFormat df = new DecimalFormat("0.00");
        public double marriedFilingJointly(double salary){
        double tax=0;
        double salInCurrentSlab, taxInCurrentSlab;
        if(salary<22000) {
            tax = salary*0.10; return tax;
        }
        else if(salary>=22000 && salary<=89449) {
            salInCurrentSlab = salary - 22000;
            taxInCurrentSlab = salInCurrentSlab * 0.12;
            tax =  taxInCurrentSlab + 2200;
            return tax;
        }
        else if(salary>=89450 && salary<=190749) {
            salInCurrentSlab = salary - 89449;
            taxInCurrentSlab = salInCurrentSlab * 0.22;
            tax = 10293.88 + taxInCurrentSlab;
            return tax;
        }
        else if(salary>=190750 && salary<=364199) {
            salInCurrentSlab = salary - 190749;
            taxInCurrentSlab = salInCurrentSlab * 0.24;
            tax = 32579.88 + taxInCurrentSlab;
            return tax;}
        else if(salary>=364200 && salary<=462499) {
            salInCurrentSlab = salary - 364199;
            taxInCurrentSlab = salInCurrentSlab * 0.32;
            tax = 74207.88 + taxInCurrentSlab;
            return tax;
        }
        else if(salary>=462500 && salary<=693749) {
            salInCurrentSlab = salary - 462499;
            taxInCurrentSlab = salInCurrentSlab * 0.35;
            tax = 105663.88 + taxInCurrentSlab;
            return tax;
        }
        else if(salary>=693750) {
            salInCurrentSlab = salary - 693749;
            taxInCurrentSlab = salInCurrentSlab * 0.37;
            tax = 186601.38 + taxInCurrentSlab;
            return tax;
        }
        return tax;
    }

    public static void main(String[] args) {
        double percentageOfTax,salary;
        TaxCalculator tObj = new TaxCalculator();
        Scanner sc = new Scanner(System.in);
        log.info("Enter Salary to Calculate Tax");
        salary = sc.nextDouble();
        double tax= tObj.marriedFilingJointly(salary);
        log.info ("The Amount Tax Deducted is: \t\t"+df.format(tax));
        percentageOfTax =((tax/salary)*100);
        log.info("Total Percentage of Tax Deducted is: "+df.format(percentageOfTax)+"%");
    }
}
