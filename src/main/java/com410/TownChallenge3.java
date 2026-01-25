package com410;
/* This program asks the user to enter town names, generates random match results,
 displays them in a table, and counts home wins, away wins, and draws. */
import java.util.Random;
import java.util.Scanner;

public class TownChallenge3 {

    public static void main(String[] args) {

        // Create a Scanner to read input from the keyboard
        Scanner input = new Scanner(System.in);

        // Create a Random object to generate scores between 0 and 9
        Random random = new Random();

        // Array to store 8 town names entered by the user
        String[] towns = new String[8];

        // Variables to keep track of match outcomes
        int homeWins = 0;
        int awayWins = 0;
        int draws = 0;

        // Ask the user to enter the names of 8 towns
        for (int i = 0; i < towns.length; i++) {
            System.out.print("Enter the name of town " + (i + 1) + ": ");
            towns[i] = input.nextLine();
        }

        // Print table header using formatted output
        System.out.printf("%n%-18s %3s %-18s %3s%n","Home", "HS", "Away", "AS");
        // Print a separator line for the table
        System.out.printf("%-18s %3s %-18s %3s%n","------------------", "---",
                "------------------", "---");

        // Loop through the towns array two at a time to create matches
        for (int i = 0; i < towns.length; i += 2) {

            // Generate random scores for home and away teams
            int homeScore = random.nextInt(10);
            int awayScore = random.nextInt(10);

            // Display the match result in table format
            System.out.printf("%-18s %3d %-18s %3d%n",towns[i], homeScore,
                    towns[i + 1], awayScore);

            // Decide the result of the match
            if (homeScore > awayScore) {
                homeWins++;          // Home team wins
            } else if (homeScore < awayScore) {
                awayWins++;          // Away team wins
            } else {
                draws++;             // Match is a draw
            }
        }

        // Display the summary of results
        System.out.printf("%nHomes %d, Draws %d, Aways %d%n",homeWins, draws, awayWins);
    }
}
