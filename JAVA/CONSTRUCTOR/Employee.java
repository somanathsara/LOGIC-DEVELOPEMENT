import java.util.*;
class data {
    String name;
    int salary;

    data(String name, int salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    double AnnualSalary() {
        return 12 * salary;
    }
}

class Employee {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name here: ");
        String name = sc.nextLine();
        System.out.println("Enter the Salary: ");
        int salary = sc.nextInt();
        data d1 = new data(name,salary);
        double sal = d1.AnnualSalary();
        System.out.println("Salary :"+sal);
    }
}
