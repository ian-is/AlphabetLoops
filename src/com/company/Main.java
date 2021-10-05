package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a letter");
        String letter = input.next();

        System.out.println("Enter a number");
        int number = input.nextInt();


        char letterChar = letter.charAt(0);
        int count = 0;
        for (char alphabet = (letterChar); alphabet >= 'a'; alphabet--) {
            //   System.out.println(alphabet);


            if (count < number) {
                System.out.println(alphabet);

                if (alphabet == 'a') {
                  String temp = 'z';

                }
                count = count + 1;


            }


        }
    }
}
