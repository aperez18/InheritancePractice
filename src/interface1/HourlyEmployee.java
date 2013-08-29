/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

/**
 *
 * @author Andy
 */
public class HourlyEmployee implements Employee {
    
    public static int hourlyEmployeeCount=0;
    private int age;
    private String name;
    private int employeeId;
    private boolean employed;
    private int hours;
    private double payRate;
    private double paycheck;

    public HourlyEmployee(int age, String name, int hours, double payRate) {
        this.age = age;
        this.name = name;
        this.hours = hours;
        this.payRate = payRate;
        hourlyEmployeeCount++;
        employed = true;
        employeeId = 123456 + hourlyEmployeeCount;
    }
    
    @Override
    public void terminateEmployee(int employeeId){
        hourlyEmployeeCount--;
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
    
    @Override
    public void giveRaise(double raise){
        payRate+=raise;
    }
}
