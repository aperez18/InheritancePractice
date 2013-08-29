/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

/**
 *
 * @author Andy
 */
public class SalariedEmployee implements Employee {
    
    public static int salariedEmployeeCount=0;
    private int employeeId;
    private double salary;
    private boolean vacation = false;
    private int age;
    private String name;
    private boolean employed;

    public SalariedEmployee(double salary, int age, String name) {
        this.salary = salary;
        this.age = age;
        this.name = name;
        salariedEmployeeCount++;
        employeeId = 223456 + salariedEmployeeCount;
        employed = true;
    }
    
    public void onVacation(){
        vacation = true;
    }
    public void notOnVacation(){
        vacation = false;
    }
    
    @Override
    public void giveRaise(double raise){
        salary+= raise;
    }
    
    public double getPaycheck(){
        return salary/26;
    }
    
    
    @Override
    public void terminateEmployee(int employeeId){
        salariedEmployeeCount--;
        employed = false;
    }
    
    @Override
    public int getEmployeeId(){
        return employeeId;
    }
    
    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public int getAge(){
        return age;
    }
}
