package service;

import domain.Constants;
import exceptions.InvalidSalaryException;

public class TaxCalculator {

    private int getSlab(double salary) throws InvalidSalaryException {
        int returnValue = Constants.INVALID_SLAB;
        if (salary >= Constants.SLAB_MIN[Constants.FIRST_SLAB]
                && salary <= Constants.SLAB_MAX[Constants.FIRST_SLAB]) {
            returnValue = Constants.FIRST_SLAB;
        } else if (salary > Constants.SLAB_MAX[Constants.FIRST_SLAB] &&
                salary <= Constants.SLAB_MAX[Constants.SECOND_SLAB]) {
            returnValue = Constants.SECOND_SLAB;
        } else if (salary > Constants.SLAB_MAX[Constants.SECOND_SLAB] &&
                salary <= Constants.SLAB_MAX[Constants.THIRD_SLAB]) {
            returnValue = Constants.THIRD_SLAB;
        }
        if (returnValue == Constants.INVALID_SLAB) {
            throw new InvalidSalaryException(InvalidSalaryException.STANDARD_MESSAGE);
        }
        return returnValue;
    }

    public double getTax(double salary) throws InvalidSalaryException {
        int taxSlab = getSlab(salary);
        double returnValue = 0.0;
        double excessSalary;
        switch (taxSlab) {
            case Constants.FIRST_SLAB:
                excessSalary = salary - Constants.SLAB_MIN[Constants.FIRST_SLAB];
                returnValue = Constants.SLAB_RATE[Constants.FIRST_SLAB] * salary;
                break;
            case Constants.SECOND_SLAB:
                excessSalary = salary - Constants.SLAB_MAX[Constants.FIRST_SLAB];
                returnValue = Constants.SLAB_TAX[Constants.SECOND_SLAB] +
                        (Constants.SLAB_RATE[Constants.SECOND_SLAB] * excessSalary);
                break;
            case Constants.THIRD_SLAB:
                excessSalary = salary - Constants.SLAB_MAX[Constants.SECOND_SLAB];
                returnValue = Constants.SLAB_TAX[Constants.THIRD_SLAB] +
                        (Constants.SLAB_RATE[Constants.THIRD_SLAB] * excessSalary);
                break;
        }
        return returnValue;
    }

    public double getEffectiveTaxRate(double salary) throws InvalidSalaryException {
        double taxValue = getTax(salary);
        return taxValue * Constants.MAX_PERCENTAGE / salary;
    }
}
