package com.tts;

import java.util.Scanner;

public class Madlib {

    public static void main(String[] args) {
//        Use the variables below to compose the following paragraph:
//        name, adjective, verbOne, verbTwo, number, yourName

//        Dear name,
//        You are adverb adjective and I want to be your noun! I want to go to the nounTwo with you in number days.
//                Sincerely, yourName
        // make a scanner

        Scanner input =  new Scanner(System.in);

        int ageLimit = 18;
        System.out.println("How old are you?");
        int age = Integer.parseInt(input.nextLine());

        if (age > ageLimit) {
            System.out.println("You are too young! Sorry.");
            System.exit(0);
        }

        System.out.println("What is the name?");
        String name =  input.nextLine();

        System.out.println("Enter an adjective:");
        String adjective = input.nextLine();

        System.out.println("Enter a noun");
        String nounOne = input.nextLine();

        System.out.println("Enter another noun");
        String nounTwo = input.nextLine();

        System.out.println("Enter your name?");
        String yourName = input.nextLine();

        System.out.println("Enter a number");
        int number = input.nextInt();

        System.out.printf("Dear %s\n", name);
        System.out.printf("You are %s and I want to be your %s! I want to go to the %s with you in %d days.\n",
                adjective, nounOne, nounTwo, number);
        System.out.printf("Sincerely, %s\n", yourName);





    }
}
