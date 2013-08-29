/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Concrete;

/**
 *
 * @author Andy
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee{
    private double bonus;
    private double bonusCheck;

    public SalaryPlusBonusEmployee(double bonus, double salary, int age, String name) {
        super(salary, age, name);
        this.bonus = bonus;
    }
    
    public double getBonusPaycheck(SalaryPlusBonusEmployee spbEmployee){
        bonusCheck = spbEmployee.getPaycheck() + bonus;
        return bonusCheck;
    }
}
