package Exercises;

public class Bank_example {
    public static void main(String[] args) {

        BankAccount a = new BankAccount(1020);

        System.out.println(a.getBalance());

        a.withdraw(500);
        System.out.println(a.getBalance());

        a.deposit(600);
        System.out.println(a.getBalance());
    }
}