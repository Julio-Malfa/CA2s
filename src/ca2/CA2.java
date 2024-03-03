/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca2;

/**
 *
 * @author julio
 */
public class CA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Accessing Employee to test check for a valid email address
        Employee employee = new Employee();
        employee.setEmail("jjdwdad");
        System.out.println("email " +employee.getEmail());
    }
    
}
