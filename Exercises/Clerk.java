package Exercises;


public class Clerk extends Employee {

    private int overtimeHours;
    private double overtimeRate;

    public Clerk(String name, double salary, int overtimeHours, double overtimeRate) {
        super(name, salary);
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    public double calculatePay() {
        return salary + (overtimeHours * overtimeRate);
    }
}

