package Exercises;

import java.util.Random;

public class Dice_03 {
    public static void main(String[] args) {

        Random r = new Random();

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;

        for (int i = 1; i <= 1000; i++) {

            int die = r.nextInt(6) + 1;

            if (die == 1) {
                a++;
            } else if (die == 2) {
                b++;
            } else if (die == 3) {
                c++;
            } else if (die == 4) {
                d++;
            } else if (die == 5) {
                e++;
            } else {
                f++;
            }
        }

        System.out.println("1: " + a + " times");
        System.out.println("2: " + b + " times");
        System.out.println("3: " + c + " times");
        System.out.println("4: " + d + " times");
        System.out.println("5: " + e + " times");
        System.out.println("6: " + f + " times");
    }
}

