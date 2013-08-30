/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

/**
 *
 * @author Andy
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee{
    private double bonus;
    private double bonusCheck;

    public SalaryPlusBonusEmployee(double bonus, double salary, int age, String firstName, String lastName) {
        super(salary, age, firstName, lastName);
        this.bonus = bonus;
    }

    public double getBonusPaycheck(SalaryPlusBonusEmployee spbEmployee){
        bonusCheck = spbEmployee.getPaycheck() + bonus;
        return bonusCheck;
    }
}
