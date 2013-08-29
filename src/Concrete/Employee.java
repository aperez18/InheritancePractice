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
    private String name;
    private int employeeId;
    private boolean employed;
    
    public Employee(int age, String name){
        this.age = age;
        this.name = name;
        employeeId = 123456 + employeeCount;
        employed = true;
        System.out.println("ID number for " + name + ": " + employeeId);
    }
    
    public int getAge(){
        return age;
    }
    
    public String getName(){
        return name;
    }
    
    public int getEmployeeId(){
        return employeeId;
    }
    
    public void terminateEmployee(int employeeId){
        employed = false;
        employeeCount--;
    }
}
