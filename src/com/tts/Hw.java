package com.tts;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Hw {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?\n");
        String firstName = input.nextLine();

        System.out.printf("Hello %s!\n", firstName);
        System.out.printf("Today is awesome %s! What do you think?\n", firstName);
        System.out.printf("%s! ... don't you think I'm Awesome?\n", firstName);

        System.out.println("What city are you from?");
        String cityName = input.nextLine();
        System.out.printf("Wow! So you are from %s? I never heard of that place before.\n", cityName);

        int myNum = 15;
        System.out.println(myNum);

        System.out.println(Math.max(10, 55));
        System.out.println(Math.sqrt(81));

        int x = 10;
        int y = 22;
        System.out.println(x >= y);




    }
}


