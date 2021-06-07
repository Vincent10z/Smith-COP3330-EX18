/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Vincent Smith
 */

import java.util.Scanner;
public class EX18 {
    public static void main(String[] args) {
    float temperature;

    Scanner in = new Scanner(System.in);

    System.out.println("Press C to convert from Fahrenheit to Celsius");
    System.out.println("Press F to convert from Celsius to Fahrenheit");
    String choice = in.nextLine();

    if (choice.equals("c") || choice.equals("C") ){
        System.out.println("Your choice: C");
        System.out.println("Please enter the temperature in Fahrenheit");
        temperature = in.nextInt();

        temperature = ((temperature - 32)*5)/9;

        System.out.println("temperature in Celsius = " + temperature);

    }
    if (choice.equals("f") || choice.equals("F")){
        System.out.println("Your choice: F");
        System.out.println("Please enter the temperature in Celsius");
        temperature = in.nextInt();

        temperature = ((temperature * 9/5)+32);

        System.out.println("temperature in Fahrenheit = " + temperature);
    }
    else{
        System.out.println("Invalid entry");
    }
}
}