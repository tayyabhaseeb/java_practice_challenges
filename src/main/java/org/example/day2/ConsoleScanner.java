package org.example.day2;

import java.util.Scanner;

public class ConsoleScanner {

    public static void start(int randomNumber, int guess, Scanner scanner, int count) {
        System.out.println("Welcome to the Number Guessing game");
        System.out.println("You have 7 guesses to win the game");

        while(count < 7) {
            System.out.println("Guess a number between 1 and 100");
            System.out.println("Please enter your guess: ");
            guess = scanner.nextInt();
            if(logic(guess, randomNumber, count)){
                break;
            }

        }
        if(count > 7) {
            System.out.println("Sorry your time is finshed");
        }

    }

    public static boolean logic(int guess, int randomNumber, int count) {
        if (guess == randomNumber) {
            System.out.println("Congratulations! You win!");
            return true;
        }
        else {
            System.out.println("Sorry, your guess is incorrect!");
            count++;
            if(guess > randomNumber) {
                System.out.println("Sorry, your guess is too high!");
            }else if(guess < randomNumber) {
                System.out.println("Sorry, your guess is too low!");
            }
            return false;

        }
    }
}
