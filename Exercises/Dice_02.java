package Exercises;

import java.util.Random;

public class Dice_02 {
    public static void main(String[] args) {

        Random r = new Random();

        int user1 = r.nextInt(6) + 1;
        int user2 = r.nextInt(6) + 1;
        int userTotal = user1 + user2;

        int computer1 = r.nextInt(6) + 1;
        int computer2 = r.nextInt(6) + 1;
        int computerTotal = computer1 + computer2;

        System.out.println("User " + user1 + " and " + user2 + ", total: " + userTotal);

        System.out.println("Computer " + computer1 + " and " + computer2 + ", total: " + computerTotal);

        if (userTotal > computerTotal) {
            System.out.println("User Wins");
        } else if (computerTotal > userTotal) {
            System.out.println("Computer Wins");
        } else {
            System.out.println("Tie");
        }
    }
}

