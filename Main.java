package test;

class Employee {
 void work() {
     System.out.println("Employee is working.");
 }

 double getSalary() {
     return 30000.00; 
 }
}


class HRManager extends Employee {

 void work() {
     System.out.println("HR Manager is managing HR tasks.");
 }

 void addEmployee() {
     System.out.println("HR Manager added a new employee.");
 }
}

public class Main {
 public static void main(String[] args) {
     Employee genericEmployee = new Employee();
     genericEmployee.work();
     System.out.println("Salary: " + genericEmployee.getSalary());

     HRManager hr = new HRManager();
     hr.work();             
     System.out.println("Salary: " + hr.getSalary());  
     hr.addEmployee();     
 }
}
