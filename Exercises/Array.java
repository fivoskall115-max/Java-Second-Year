package Exercises;


import java.util.Random;

public class Array {
    public static void main(String[] args) {

        Random r = new Random();

        int[] numbers = new int[10];

        // Fill array
        for (int i = 0; i < 10; i++) {
            numbers[i] = r.nextInt(100) + 1;
            System.out.println(numbers[i]);
        }

        int max = numbers[0];
        int min = numbers[0];

        int sum = 0;
        int even = 0;
        int odd = 0;

        // Find max, min, average and count odd/even
        for (int i = 0; i < 10; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }

            sum = sum + numbers[i];

            if (numbers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        double average = sum / 10.0;

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
