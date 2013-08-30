/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract1;

/**
 *
 * @author Andy
 */
public class SalariedEmployee extends Employee {
    
    private double salary;
    private boolean vacation = false;

    public SalariedEmployee(double salary, int age, String firstName, String lastName) {
        super(age, firstName, lastName);
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
    
    @Override
    public void giveRaise(double raise){
        salary+=raise;
    }
    
    @Override
    public double getPaycheck(){
        return salary/26;
    }
}
