package com.kristoffer.demo;

import java.util.Scanner;

import static com.kristoffer.demo.Colors.*;

public class Main {
    public static void main(String[] args) {

        // Instantiate Objects
        Scanner sc = new Scanner(System.in);
        Player player = new Player();

        System.out.println(GREEN + "Welcome Adventurer" + RESET);
        System.out.println("What is your name?");
        player.setName( sc.nextLine() );

        System.out.println("Ah.. your name is: " + player.getName());

        // TODO - Fortsätter 11:30 :)

        // Menu
        System.out.println(""); // <-- TODO Let's try something new later
        switch (sc.nextLine()) {
            case "1" -> System.out.println("You clicked 1");
            case "2" -> System.out.println("You clicked 2");
            case "3" -> System.out.println("You clicked 3");

            default -> System.out.println("Try again!");
        }



    }
}
