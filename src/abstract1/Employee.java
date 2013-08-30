/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract1;

/**
 *
 * @author Andy
 */
public abstract class Employee {
    
    public static int employeeCount = 0;
    private int age;
    private String firstName;
    private String lastName;
    private int employeeId;
    private boolean employed;

    public Employee(int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        employeeCount++;
        employeeId = 123456 + employeeCount;
        System.out.println("ID number for " + firstName + " " + lastName 
                + ": " + employeeId);
    }
        
    public abstract double getPaycheck();
    public abstract void giveRaise(double raise);

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    
    public boolean isEmployed(){
        return employed;
    }
    
    public void terminateEmployee(){
        Employee.employeeCount--;
        employed = false;
    }
}
