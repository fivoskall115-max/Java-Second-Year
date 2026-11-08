package Exercises;

public class All_employees_test {
    public static void main(String[] args) {

        Manager m = new Manager("John", 2000, 500);

        Clerk c = new Clerk("Peter", 1200, 10, 15);

        ContractWorker w = new ContractWorker("Mary", 100, 12);

        System.out.println("Manager: " + m.calculatePay());
        System.out.println("Clerk: " + c.calculatePay());
        System.out.println("Contract Worker: " + w.calculatePay());
    }
}