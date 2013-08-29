/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract1;

/**
 *
 * @author Andy
 */
public class HourlyEmployee extends Employee{
    
    private String name;
    private int age;
    private int employeeId;
    private boolean employed;
    private double payRate;
    private int hours;
    private double paycheck;

    public HourlyEmployee(String name, int age, double payRate, int hours, double paycheck) {
        this.name = name;
        this.age = age;
        this.payRate = payRate;
        this.hours = hours;
        this.paycheck = paycheck;
        employeeId = 123456 + employeeCount;
        employed = true;
    }
    
    @Override
    public void terminateEmployee(int employeeId){
        Employee.employeeCount--;
        employed = false;
    }
    
    public int getEmployeeId(){
        return employeeId;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public boolean isEmployed(){
        return employed;
    }
    
    public double getPaycheck(){
        if(hours <= 40){
            paycheck = hours*payRate;
        }else{
            paycheck = (40*payRate) + (hours-40)*(payRate*1.5);
        }
        
        return paycheck;
    }
}
