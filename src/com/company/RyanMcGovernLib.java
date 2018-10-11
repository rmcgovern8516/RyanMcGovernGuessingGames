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
        int min = 1;
        int max = 100;
        System.out.println("Think of a number between 1 and 100 to be the answer the AI will attempt to guess.");
        System.out.println("Type 'higher' if your # is higher than the current guess,'lower' if it's lower, or 'correct' if I got it.");
        int currentGuess = 50;
        Scanner input = new Scanner(System.in);
        String Input = "";
        while (!(Input.equals("correct"))){
            System.out.println("My guess is "+currentGuess+". Is that correct?");
            Input = input.nextLine();
            if (Input.equals("higher")){
                min = currentGuess;
                currentGuess = (max+min)/2;
            }
            else if (Input.equals("lower")){
                max = currentGuess;
                currentGuess = (max+min)/2;
            }
        }
        System.out.println("Congratulations! You won!");
    }
}
