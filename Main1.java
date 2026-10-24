abstract class Employee {
    abstract void salary();
}

class HR extends Employee {
    void salary() {
        System.out.println("HR Salary: 30000");
    }
}

class Manager extends Employee {
    void salary() {
        System.out.println("Manager Salary: 50000");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Employee e1 = new HR();
        Employee e2 = new Manager();

        e1.salary();
        e2.salary();
    }
}