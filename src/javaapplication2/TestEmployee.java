package javaapplication2;

public class TestEmployee {

    public static void main(String[] args) {
        Employee emp1 = new Employee("One", 3000.00);
        Employee emp2 = new Employee("Two");
        emp2.setSalary(5600.00);
        System.out.printf("Salary: %.2f\n", emp1.getSalary());
        emp1.raiseSalary(8.0);
        System.out.printf("Salary after increase: %.2f\n", emp1.getSalary());
        
        if(emp1.getSalary() > emp2.getSalary()){
            
            System.out.println(emp1.getSalary());
        }
        else{
            System.out.println(emp2.getSalary());
        }
        System.out.printf("Total salary: %.2f + %.2f + %.2f\n",emp1.getSalary(),emp2.getSalary(),(emp1.getSalary() + emp2.getSalary()));
       
    }
}
