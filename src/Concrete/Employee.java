/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Concrete;

/**
 *
 * @author Andy
 */
public class Employee {
    public static int employeeCount = 0;
    private int age;
    private String firstName;
    private String lastName;
    private int employeeId;
    private boolean employed;
    
    public Employee(int age, String firstName, String lastName){
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        employeeId = 123456 + employeeCount;
        employed = true;
        System.out.println("ID number for " + firstName + " " + lastName 
                + ": " + employeeId);
    }
    
    public int getAge(){
        return age;
    }
    
    public String getName(){
        return firstName + " " + lastName;
    }
    
    public int getEmployeeId(){
        return employeeId;
    }
    
    public void terminateEmployee(int employeeId){
        employed = false;
        employeeCount--;
    }
}
