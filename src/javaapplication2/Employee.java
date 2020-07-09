package javaapplication2;

public class Employee {

    private String name;
    private double salary;

    public Employee()
    {
        name = "";
        salary = 0.0;
    }
    
    public Employee(String employeeName)
    {
        name = employeeName;
        salary = 0.0;
    }
        
    public Employee(String employeeName, double currentSalary) {
        name = employeeName;
        salary = currentSalary;
    }

    void raiseSalary(double percent) {
        salary = salary + (salary * percent / 100.0);
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double money) {
        this.salary = money;
    }
    
}
