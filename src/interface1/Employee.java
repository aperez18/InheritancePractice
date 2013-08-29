/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

/**
 *
 * @author Andy
 */
public interface Employee {
    
    public abstract void terminateEmployee(int employeeId);
    
    public abstract void giveRaise(double raise);
    
    public String getName();
    public int getAge();
    public int getEmployeeId();
}
