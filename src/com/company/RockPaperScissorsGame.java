package com.company;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    static void main(String[] args) {
        Random rand = new Random();
        int randNo = rand.nextInt(3);

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an option : \n0 for Rock \n1 for Paper \n2 for Scissors");
        int options = sc.nextInt();
        if(options >=3){
            System.out.println("Please choose between 0,1,2 only");
        }else{
            System.out.println("Computer's choice : "+randNo);

            if(options == randNo){
                System.out.println("Draw");
            }else if((options == 0 && randNo == 1) || (options == 1 && randNo == 2) || (options == 2 && randNo == 0)){
                System.out.println("You lost!");
            }else{
                System.out.println("You won");
            }
        }

    }
}
