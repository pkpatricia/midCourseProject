package com.company;

import java.util.Random;

public class Main {

    public static int score = 0;
    public static int count = 0;
    public static int previous;
    public static boolean noWinner = true;


    // Main part of program.  This is where we call the rollDice and tallyPoints.
    public static void main(String[] args) {

        // Function Call to Roll Dice.
        score = rollDice();

        // Function Call to Tally Points
        tallyPoints(score);

    }


    // First roll generate 2 random numbers and check that a value is returned.
    public static int rollDice() {
        Random rand = new Random();

        int die1 = rand.nextInt(6) + 1;
        int die2 = rand.nextInt(6) + 1;
        System.out.println(die1);
        System.out.println(die2);
        count++;

        int result = die1 + die2;
        System.out.println("Die 1: " + die1 + "." + "  Die 2: " + die2 + ". " + "Result is: " + result + ".");
        return result;

    }


    // Initial Role of die to declare winner or call declareWinner method for additional rolls.
    public static int tallyPoints(int score) {

        if ((score == 7 && count == 1) || (score == 11 && count == 1)) {
            System.out.println("You are the winner! You rolled a " + score + ".");
            return 0;
        } else if ((score == 2 && count == 1) || (score == 3 && count == 1) || (score == 12 && count == 1)) {
            System.out.println("You are the Loser!  You rolled a " + score + ".");
            return 0;
        } else {
            System.out.println("No Good Result, Rolling Again!");
            previous = score;
            declareWinner();
            return 0;
        }


    }


    // Additional Rolls of Dice Needed.  1st Roll did not identify a winner or loser.
    public static void declareWinner() {


        // 2nd Roll of Dice
        score = rollDice();

        while (noWinner) {

            if (score == previous) {
                System.out.println("Your previous score was: " + previous + ".");
                System.out.println("Your current score is: " + score + " they match!");
                System.out.println("Yay, You win!");
                noWinner = false;


            } else if (score == 7) {
                System.out.println("Your previous score was: " + previous + ".");
                System.out.println("You rolled a 7!");
                System.out.println("Sorry, You lose!");
                noWinner = false;

            }


            // Keep Rolling Dice until Desired Result.
            else {
                score = rollDice();

            }


        }

    }
}

