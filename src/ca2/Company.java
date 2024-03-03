/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author julio
 */
public class Company {    
    private String companyName;
    private ArrayList<Employee> staff;

    // Constructor for company and Array for Staff
    public Company() {
    super();
        companyName = "Business Gnómes Ltd";
        staff = new ArrayList<>();
    }
    
    // Creating the constructors for companyName and Staff
    public Company(String companyName) {
    super();
        this.companyName = companyName;
        staff = new ArrayList<>();
    }
    
    // "adds a new employee to the staff arrayList" 
    public void addNewStaff(Employee employee) {
        staff.add(employee);
    }
    
    // "returns the number of employees currently in the arrayList"
    public int getStaffNumber() {
        return staff.size();
    }

    // "uses an iterator object to find in the arrayList all employees"
    public void listEmployees(int empNumValue) {
        System.out.println("\nEmployees: " + empNumValue + " in " + companyName);
        Iterator<Employee> iterator = staff.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getEmpNum() > empNumValue) {
                System.out.println(employee.getName());
            }
        }
    }
}
