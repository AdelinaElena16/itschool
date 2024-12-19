package com.itschoolsession4.homework.ex2;

import java.util.Scanner;

public class Tema2 {
    public static void main(String[] args) {
        //Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to enter the length and breadth of the rectangle
        System.out.println("Enter the length of the rectangle: ");
        double length =scanner.nextDouble();

        System.out.println("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        //Calculate the area of the rectangle
        double area = length * breadth;

        //Display the result
        System.out.println("The area of the rectangle is: "+ area);

        //Close the Scanner
        scanner.close();


    }

    }

