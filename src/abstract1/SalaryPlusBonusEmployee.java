/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract1;

/**
 *
 * @author Andy
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee{
    private double bonus;
    private double bonusCheck;

    public SalaryPlusBonusEmployee(double bonus, double salary, int age, String firstName, String lastName, int employeeId) {
        super(salary, age, firstName, lastName, employeeId);
        this.bonus = bonus;
    }
     
    public double getBonusPaycheck(SalaryPlusBonusEmployee spbEmployee){
        bonusCheck = spbEmployee.getPaycheck() + bonus;
        return bonusCheck;
    }
}
