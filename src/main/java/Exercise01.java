/*
* UCF COP3330 Fall 2021 Assignment 1 Solution
* Copyright 2021 Luis Hernandez
*/

//get the Scanner class from java.util in order to receive input from the user
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        //create a Scanner input
        Scanner name = new Scanner(System.in);
        //prompt the user to input their name
        System.out.print("What is your name? ");
        String nm = name.nextLine();
        //print out greeting with user's name
        System.out.printf("Hello, %s, nice to meet you!", nm);
    }
}
