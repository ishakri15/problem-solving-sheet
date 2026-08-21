package com.company;

import java.util.Random;
import java.util.Scanner;

/*Create a class Game, which allows a user to play "Guess the Number"
game once. Game should have the following methods:
1. Constructor to generate the random number.
2. takeUserInput() to take a user input of number.
3. isCorrectNumber() to detect whether the number entered by the user is true
4. getter and setter for noOfGuesses
Use properties such as noOfGuesses(int), etc to get this task done!
*/
class Game{
    private int num;
    private int input;
    private int noOfGuesses = 0;

    Game(){
        Random rnd = new Random();
        this.num = rnd.nextInt(100);
    }
    void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        input = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(input == num){
            System.out.println("Correct, You guessed it in "+noOfGuesses+" attempts");
            return true;
        }else if(input > num){
            System.out.println("too high");
        }else if(input < num){
            System.out.println("too low");
        }
        return false;
    }
}
public class GuessNumberGame {
    static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
            System.out.println(b);
        }
    }
}
