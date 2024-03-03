/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2;

import java.util.Scanner;

/**
 *
 * @author julio
 */
class EmployeeTest {
    public static void main(String[] args) {
        
    // Create Employee Array with 3 objects. 
    Employee joe = new Employee("Joe Bloggs", "jb@gmail.com");
    Employee ann = new Employee("Ann Banana", "ab@gmail.com");
    Employee tom = new Employee("Tom Thumb", "tt@gmail.com");   
 
    // Created Array with name projectGroup
    Employee[] projectGroup = {joe, ann, tom};
        
    // Printing out the value of variable nextEmpNum
    System.out.println("Value of nextEmpNum: " + joe.getNextEmpNum());
    Scanner in = new Scanner(System.in);
        
    // Searching and displaying names of employees with empNum above m
    int m ; 
    System.out.println("Please enter employee number: " );
    m = Integer.parseInt(in.nextLine().trim());
    System.out.println("\nEmployees with empNum smaller than : " +m);
        for (int i = 0; i < projectGroup.length; i++) {
            if(projectGroup[i].getEmpNum() >=m) {
                System.out.println(projectGroup[i].getName());
            }
        }
        
    //         
    Company company = new Company("Business Gnómes Ltd");
    company.addNewStaff(joe);
    company.addNewStaff(ann);
    company.addNewStaff(tom);

}
}
