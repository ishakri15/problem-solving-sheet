package com.company;

import java.util.Scanner;

public class ExceptionHandling {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result;

        try{
            result = a/b;
            System.out.println("Result : "+result);
        }catch(ArithmeticException ex){
            if(ex.getMessage().equals("/ by zero")){
                System.out.println("Divide by zero occurred");
            }else{
                throw ex;
            }
        }
    }
}
