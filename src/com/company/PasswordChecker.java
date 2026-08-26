package com.company;

import java.util.Scanner;

public class PasswordChecker {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;
        do{
            System.out.println("Enter your password : ");
            password = sc.nextLine();
        }while(!checkPassword(password));
        System.out.println("Thanks for entering right password");
    }

    static boolean checkPassword(String password){
        return password.length()>10 ? true : false;
    }
}
