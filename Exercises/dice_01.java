package Exercises;

import java.util.Random;

    public class dice_01 {
        public static void main(String[] args) {

            Random r = new Random();

            int die = r.nextInt(6) + 1;

            System.out.println("the die shows:"+ die );
        }
    }



