package com.company;
import java.util.Scanner;

public class RyanMcGovernLib {
    public static void guessGame(){
        double randomDouble = Math.random();
        int answer = (int) (randomDouble*11);
        Scanner input = new Scanner(System.in);
        System.out.println("Try to guess the number: ");
        int guess = input.nextInt();
        while (!(guess==answer)){
            System.out.println("Please try again: ");
            guess = input.nextInt();
        }
        System.out.println("Correct! The answer is "+answer+"!");
    }

    public static void guessAI(){
        Scanner Answer = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100 to be the answer the AI will attempt to guess.");
        int answer = Answer.nextInt();
        System.out.println("I will try to guess the number you've inputted!");
        int currentGuess = 50;
        Scanner input = new Scanner(System.in);
        while (!input.equals("correct")){
            System.out.println("My guess is "+currentGuess+". Is that correct?");
        }
    }
}
