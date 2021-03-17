package com.maxwell;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    //Enter input
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int number = input.nextInt();
    //Check
    if (number % 5 == 0)
        System.out.println("HiFive");
    //Check even

    }
}
