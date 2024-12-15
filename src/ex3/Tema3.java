package ex3;

public class Tema3 {
    public static void main(String[] args) {
        //Create two String objects with the same value
        String stringOne = "OpenAI";
        String stringTwo = "OpenAI";

        //Check if they refer to the same object using '=='
         if (stringOne == stringTwo) {
             System.out.println("stringOne and stringTwo refer to the same object.");
         } else {
             System.out.println("stringOne and stringTwo do not refer to the same object.");
         }

         //Check if they have the same values using 'equals'
        if (stringOne.equals(stringTwo)) {
            System.out.println("stringOne and stringTwo have the same value.");
        }else  {
            System.out.println("stringOne and stringTwo do not have the same value");

        }


        }



             }



