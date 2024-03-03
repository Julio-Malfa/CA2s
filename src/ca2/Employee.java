/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2;

/**
 *
 * @author julio
 */
// Created new class employee.
public class Employee {
    
    private String name;
    private String email;
    private int empNum;
    private int nextEmpNum = 1;
    
    public Employee() {
    super();
        name="";
        email="";
        nextEmpNum++;
        empNum = nextEmpNum;
    }    
    
    // Creating the constructors for name, email, empNum and nextEmpNum
    public Employee(String name, String email){
    super();
        this.name = name;
        this.email = email;
        nextEmpNum++;
        empNum = nextEmpNum;
    }
    
    // Acessor methods for name.
    public String getName(){
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // Acessor methods for email.
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;        
        if (email.length() < 3) {
            System.out.println("Lengh cannot be less than 3 digits");
        } else {
            System.out.println("Valid email");
        }
    }
    
    // Acessor methods for empNum
    public int getEmpNum(){
        return empNum;
    }
    
      public void setEmpNum (int empNum) {
        this.empNum = empNum;
    }
    
     // Acessor methods for nextEmpNum
    public int getNextEmpNum(){
        return nextEmpNum;
    }
    
      public void setNextEmpNum (int nextEmpNum) {
        this.nextEmpNum = nextEmpNum++;
    }
       
}

    

