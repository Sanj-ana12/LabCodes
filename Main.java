package test;

class Employee {
 protected String name;
 protected String address;
 protected double salary;
 protected String jobTitle;

 public Employee(String name, String address, double salary, String jobTitle) {
     this.name = name;
     this.address = address;
     this.salary = salary;
     this.jobTitle = jobTitle;
 }

 public double calculateBonus() {
     return salary * 0.10; 
 }

 public String generatePerformanceReport() {
     return name + " has a job title of " + jobTitle + " and earns a salary of $" + salary;
 }
}

class Manager extends Employee {
 private int managedTeams;

 public Manager(String name, String address, double salary, String jobTitle, int managedTeams) {
     super(name, address, salary, jobTitle);
     this.managedTeams = managedTeams;
 }

 public double calculateBonus() {
     return salary * 0.15; 
 }

 public void manageProjects() {
     System.out.println(name + " is managing " + managedTeams + " teams.");
 }
}

class Developer extends Employee {
 private String programmingLanguage;

 public Developer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
     super(name, address, salary, jobTitle);
     this.programmingLanguage = programmingLanguage;
 }

 public void developSoftware() {
     System.out.println(name + " is developing software using " + programmingLanguage + ".");
 }
}

class Programmer extends Developer {
 private String project;

 public Programmer(String name, String address, double salary, String jobTitle, String programmingLanguage, String project) {
     super(name, address, salary, jobTitle, programmingLanguage);
     this.project = project;
 }

 public void workOnProject() {
     System.out.println(name + " is working on project: " + project);
 }
}

public class Main {
 public static void main(String[] args) {
     Manager manager = new Manager("Alice", "123 Main St", 90000, "Manager", 5);
     Developer developer = new Developer("Bob", "456 Oak Ave", 75000, "Developer", "Java");
     Programmer programmer = new Programmer("Charlie", "789 Pine Blvd", 70000, "Programmer", "Python", "AI Research");

     Employee[] employees = {manager, developer, programmer};

     for (Employee emp : employees) {
         System.out.println(emp.generatePerformanceReport());
         System.out.println("Bonus: $" + emp.calculateBonus());
         if (emp instanceof Manager) {
             ((Manager) emp).manageProjects();
         } else if (emp instanceof Developer) {
             ((Developer) emp).developSoftware();
         } else if (emp instanceof Programmer) {
             ((Programmer) emp).workOnProject();
         }
         System.out.println("---------------------------------------------------");
     }
 }
}

