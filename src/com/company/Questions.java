package com.company;
import java.util.Scanner;

public class Questions {

    public static void question1() {
        System.out.println("You and a group of friends go on a hiking trip to the Amazon rain forest in Brazil. After finding the perfect camping site and settling down, you see a monkey playing around a nearby tree. You tell your friends you'll be back in a second, grab your backpack with your camera in it and follow the monkey.");
        System.out.println("You've been so entertained and amazed by the monkey, that you lost track of time and of path, and realize you are now in the middle of nowhere, alone with the monkey. The monkey senses your fear and signals you to follow his path. Do you follow the monkey? [Yes/No]");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
            if (answer.toLowerCase().equals("yes")){
                Questions.question2A();
            } else if (answer.toLowerCase().equals("no")){
                question2B();
            } else {
                System.out.println("Sorry, that's not an option. Now you have to start over!");
            }
    }

    public static void question2A(){
        System.out.println("Fortunately, the monkey turns out be incredibly friendly and seems to know what he is doing. He even grabs a hand of bananas from the tree and throws it down to you, further proving his friendliness and trustworthiness! However, you notice there is a huge, monstrous, and hungry jaguar a few meters away. But the monkey does not notice the jaguar and keeps swinging down the trees. Since he is ahead of you, you have no time to alert him. Your only option is for you to either keep walking down the monkey's path or follow a new path on the right. Do you 1. Keep walking or 2. Turn right?");
        Scanner input2 = new Scanner(System.in);
        int answer = input2.nextInt();
        if (answer == 1) {
            System.out.println("You've been eaten by the jaguar! Game Over!");

        } else if (answer == 2){
            System.out.println("You've managed to evade the jaguar and saved your life! But now you are in the middle of the forest, alone and helpless. You keep walking straight down the path and encounter a small tribe of the indigenous people of the Amazon. They invite you to join them and offer you water and fruit. You thank them and tell them you must keep going and try to find your way back before night falls. They tell you it is dangerous for you to wander around the forest without a survival tool and offer you to take one of three Mystery Tools.");
            System.out.println("You need to choose either Mystery Tool 1, Mystery Tool 2 or Mystery 3 to continue. Do you choose 1, 2, or 3?");
            answer = input2.nextInt();
            switch (answer) {
                case 1:
                    Adventures.adventure1();
                    break;
                case 2:
                    Adventures.adventure2();
                    break;
                case 3:
                    Adventures.adventure3();
                    break;
            }

        } else {
            System.out.println("Sorry, that's not an option. Now you have to start over!");
        }

    }

    public static void question2B() {
        System.out.println("Game over! Unfortunately, you left your compass behind and have no sense of direction. There's no way for you to figure out your way on your own!");
    }

}
