package com.company;

import org.junit.jupiter.api.Test;

class MainTest {

    Main dicetest = new Main();

    @org.junit.jupiter.api.Test
    void main() {


    }

    @org.junit.jupiter.api.Test
    void rollDice() {
        org.junit.jupiter.api.Assertions.assertNotNull(dicetest.rollDice());
    }

    @Test
    void tallyPoints() {
        int i = Main.tallyPoints(Main.score);
        System.out.println(i);
        org.junit.jupiter.api.Assertions.assertNotNull(i);

    }

    @Test
    void declareWinner() {


        if (Main.score == Main.previous) {

            org.junit.jupiter.api.Assertions.assertTrue(Main.noWinner);
            System.out.println("Winner!");
            System.out.println(Main.score);

        } else if (Main.score == 7) {

            org.junit.jupiter.api.Assertions.assertTrue(Main.noWinner);
            System.out.println("Winner!");
            System.out.println(Main.score);

        } else {

            org.junit.jupiter.api.Assertions.assertFalse(Main.noWinner);
            System.out.println("No Winner!");
            System.out.println(Main.score);
        }

    }
}