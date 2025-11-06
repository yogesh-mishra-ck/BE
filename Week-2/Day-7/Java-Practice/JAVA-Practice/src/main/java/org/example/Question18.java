package org.example;

//Employee Management System
//Create an Employee class (POJO).
//Extend it with FullTimeEmployee and PartTimeEmployee subclasses.
//Override a method to calculate salary differently for each.
//Use polymorphism to call methods on a list of employees.

class Employee{
    private int eid;
    private String name;
    private String role;
    private int workingHours;

    public Employee(){}

    public Employee(int eid, String name, String role,int workingHours) {
        this.eid = eid;
        this.name = name;
        this.role = role;
        this.workingHours = workingHours;
    }

    public int getEid() {
        return eid;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getWorkingHours(){
        return this.workingHours;
    }


    public void setEid(int eid) {
        this.eid = eid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setWorkingHours(int workingHours){
        this.workingHours = workingHours;
    }

    //function to override
    public double calculateSalary(){
        return 0.0;
    }
}

class FullTimeEmployee extends Employee{

    private int basePay;

    FullTimeEmployee(int eid, String name, String role,int workingHours, int basePay){
        super(eid,name,role,workingHours);
        this.basePay = basePay;
    }


    @Override
    public double calculateSalary(){
        return basePay+10000;
    }
}

class PartTimeEmployee extends Employee{

    private double hourlyRate;

    public PartTimeEmployee(int eid, String name, String role,int workingHours, double hourlyRate){
        super(eid,name,role,workingHours);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary(){
        return this.getWorkingHours()*hourlyRate;
    }

}
public class Question18 {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee(21,"Yogesh","Full-Stack-Developer",38,40000);
        Employee partTimeEmployee = new PartTimeEmployee(879,"Kushagra","Devops-Engineer",16, 2000);

        Employee fullTimeEmployee2 = new FullTimeEmployee(46,"Lalit","System Engineer",45,30000);
        Employee partTimeEmployee2 = new PartTimeEmployee(325,"Kushagra","Data Engineer",29, 1100);

        Employee[] employees = {fullTimeEmployee, partTimeEmployee, fullTimeEmployee2, partTimeEmployee2};
        for(Employee employee: employees){
            System.out.println(
                    "Name of the Employee: "+employee.getName()+"\n"+
                    "Employee ID: "+employee.getEid()+"\n"+
                    "Salary: "+employee.calculateSalary()+"\n"
            );
        }

    }
}
