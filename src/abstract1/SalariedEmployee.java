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
    private int age;
    private String name;
    private boolean employed;

    public SalariedEmployee(double salary, int age, String name) {
        this.salary = salary;
        this.age = age;
        this.name = name;
        employed = true;
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
    
    @Override
    public void terminateEmployee(int employeeId){
        Employee.employeeCount--;
        employed = false;
    }
}
