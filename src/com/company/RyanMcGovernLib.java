package com.company;
import java.util.Scanner;

public class RyanMcGovernLib {
    public static void guessGame(){
        double randomDouble = Math.random();
        int numGuesses = 0;
        int answer = (int) (randomDouble*11);
        Scanner input = new Scanner(System.in);
        System.out.println("Try to guess the number: ");
        int guess = input.nextInt();
        numGuesses++;
        while (!(guess==answer)){
            System.out.println("Please try again: ");
            guess = input.nextInt();
            numGuesses++;
        }
        System.out.println("Correct! The answer is "+answer+"! You got it in only "+numGuesses+" guesses!");
        System.out.println("Lets play a game again.");
        chooseGame();
    }

    public static void guessAI(){
        int min = 1;
        int max = 101;
        int numGuesses = 1;
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
                numGuesses++;
            }
            else if (Input.equals("lower")){
                max = currentGuess;
                currentGuess = (max+min)/2;
                numGuesses++;
            }
        }
        System.out.println("I won with only "+numGuesses+" guesses!");
        System.out.println("Lets play a game again.");
        chooseGame();
    }

    public static void chooseGame(){
        System.out.println("Type 1 if you would like to guess a number 1-10. Type 2 if you would like the AI to guess your number of 1-100.");
        Scanner input = new Scanner(System.in);
        String Input = input.nextLine();
        if (Input.equals("1")){
            RyanMcGovernLib.guessGame();
        }
        else if (Input.equals("2")){
            RyanMcGovernLib.guessAI();
        }
        else{
            System.out.println("That isn't 1 or 2.");
            RyanMcGovernLib.chooseGame();
        }
    }
}
