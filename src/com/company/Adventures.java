package com.company;

import java.util.Scanner;

public class Adventures {

    public static void adventure1(){
        System.out.println("Great! Your mystery tool is Torch and Matches and it is used as a source of light! These two come in handy during dusk and night hours!");
        System.out.println("Now that you have your Torch and Matches, you are ready to get going. You keep walking for hours, but to no avail. In fact, you've entered a more desolate area and the night is starting to fall.");
        System.out.println("Do you want to use your Torch and Matches for better visibility and guidance? Yes/No?");
        Scanner input3 = new Scanner(System.in);
        String answer = input3.nextLine();

        if(answer.toLowerCase().equals("yes")) {
            System.out.println("Now that your path is a bit clearer, you are able to find a safer trail that will lead you out of the scary, desolate area. The fire is so powerful and bright, that all the living creatures in the forest are able to see you walk by. But the torch is foreign to them, and their fear prevents them from attacking you or even get close to you. There is, however, one intelligent creature who's more familiar with the light and quickly follows you. The friendly monkey has found you! You follow his signals without questioning and he leads you back to your friends!");
            System.out.println("You've managed to survive the forest and find your way back!");

            System.out.println();
            String youWin = "YOU WIN!";
            for(int i = 0; i < youWin.length(); i++) {
                System.out.print(youWin.charAt(i));
            }
        } else if (answer.toLowerCase().equals("no")){
            System.out.println("You keep walking, entering deeper into the forest as you go. Before you know it, night time has fallen. You decide to reach for your matches, which you placed in your pocket. However, you didn't realize these fell out of your pocket some time ago and you didn't see them because it was too dark to tell if those were matches or sticks. You are frantically scared, and suddenly, you hear a hissing sound rapidly approaching you. It happens to be a group of anacondas! They finally reach you and attack you. You lost!");
        } else {
            System.out.println("Sorry, that's not an option. Now you have to start over!");
        }
    }

    public static void adventure2(){
        System.out.println("Great! Your mystery tool is a Conch Shell and it can be used as a horn! It can help locate you!");
        System.out.println("Now that you have your Conch Shell you are ready to get going. You know that you can use your Conch Shell anytime, especially when in danger! You keep walking for hours, but to no avail. Not to mention dusk is falling and you keep getting deeper into a desolate area.");
        System.out.println("Do you want to use your Conch Shell to signal for help? [Yes/No]?");

        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        if (answer.toLowerCase().equals("yes")) {
            System.out.println("You keep walking, and horn your Conch Shell with every step you make. The friendly monkey, who has been looking for you all this time, is able to hear the sound of the Conch Shell from his location and starts swinging by the trees, headed your way. You hear something approaching you, look up and realize the friendly monkey has been able to find you! You follow his signals without questioning and he leads you back to your friends!");
            System.out.println("You've managed to survive the forest and found your way back!");

            System.out.println();
            String youWin = "YOU WIN!";
            for(int i = 0; i < youWin.length(); i++) {
                System.out.print(youWin.charAt(i));
            }
        } else if (answer.toLowerCase().equals("no")){
            System.out.println("You've chosen to not use your Conch Shell when you had the chance! You tried to outsmart the forest, but the hungry jaguar was wandering around the same desolate area, found you and chased you down. You tried to run away from him and used your Conch Shell for help, but you were running so fast that you dropped it. You couldn't outrun the jaguar, he caught you and attacked you! You Lost!");
        } else {
            System.out.println("Sorry, that's not an option. Now you have to start over!");
        }

    }

    public static void adventure3(){
        System.out.println("Your mystery tool is a delicious box of Raw Almonds! While they can help you kill hunger throughout your journey, they aren't a very useful survival tool! The leader of the tribe has giving you the opportunity to choose another mystery tool!");
        System.out.println("Which one do you choose? Mystery Tool 1 or 2?");
        Scanner input3 = new Scanner(System.in);
        int answer = input3.nextInt();

        switch(answer){
            case 1:
                adventure1();
                break;
            case 2:
                adventure2();
                break;
        }

    }
}
