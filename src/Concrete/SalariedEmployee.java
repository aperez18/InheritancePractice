/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Concrete;

/**
 *
 * @author Andy
 */
public class SalariedEmployee extends Employee {
    private double salary;
    private boolean vacation = false;

    public SalariedEmployee(double salary, int age, String name) {
        super(age, name);
        this.salary = salary;
    }
    
    public void onVacation(){
        vacation = true;
    }
    public void notOnVacation(){
        vacation = false;
    }
    
    public void raiseSalary(double raise){
        salary+= raise;
    }
    
    public double getPaycheck(){
        return salary/26;
    }
    
}
