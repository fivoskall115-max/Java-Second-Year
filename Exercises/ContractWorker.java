package Exercises;


public class ContractWorker extends Employee {

    private int hoursWorked;
    private double commission;

    public ContractWorker(String name, int hoursWorked, double commission) {
        super(name, 0);
        this.hoursWorked = hoursWorked;
        this.commission = commission;
    }

    public double calculatePay() {
        return hoursWorked * commission;
    }
}
