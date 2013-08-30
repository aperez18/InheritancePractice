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
    
    private double payRate;
    private int hours;
    private double paycheck;
    
    public HourlyEmployee(double payRate, int hours, int age, String firstName, String lastName, int employeeId) {
        super(age, firstName, lastName, employeeId);
        this.payRate = payRate;
        this.hours = hours;
    }  
    
    @Override
    public void giveRaise(double raise){
        payRate+=raise;
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
}
