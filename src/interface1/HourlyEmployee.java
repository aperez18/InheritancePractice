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
    private String firstName;
    private String lastName;
    private int employeeId;
    private boolean employed;
    private int hours;
    private double payRate;
    private double paycheck;

    public HourlyEmployee(int age, String firstName, String lastName, int hours, double payRate) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
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
    public String getFirstName(){
        return firstName;
    }
    
    @Override
    public String getLastName(){
        return lastName;
    }
    
    @Override
    public int getAge(){
        return age;
    }
    
    public boolean isEmployed(){
        return employed;
    }
    
    @Override
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
