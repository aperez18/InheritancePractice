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
    private String firstName;
    private String lastName;
    private boolean employed;

    public SalariedEmployee(double salary, int age, String firstName, String lastName) {
        this.salary = salary;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
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
    
    @Override
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
}
