package com.itschoolsession4.homework.ex1;


import java.util.Scanner;

public class  Tema1
{
    public static void main(String[] args) {
        //Create a Scanner object for user input
        Scanner scanner =new Scanner( System.in);

        // Prompt the user to enter two numbers
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 =scanner.nextDouble();

        //Perform calculations
        double addition = num1 + num2;
        double subtraction = num1 -num2;
        double multiplication = num1 * num2;
        double division =(num2 != 0)    ? num1/num2 : Double.NaN; //Avoid division by zero
        double modulus= (num2 !=0) ? num1 % num2 :Double.NaN;

        //Display results
        System.out.println("Results");
        System.out.println("Addition: "+ subtraction);
        System.out.println("Multiplication: "+ multiplication);
        if (num2 != 0) {
            System.out.println("Division: " + division);
            System.out.println("Modulus: " + modulus);

        } else {
            System.out.println("Division: Undefined (division by zero)");
            System.out.println("Modulus: Undefined (modulus by zero)");
         //Close the scanner
            scanner.close();




            }

    }}




