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

    public Employee(int age, String firstName, String lastName, int employeeId) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
    }
        
    public abstract double getPaycheck();

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
