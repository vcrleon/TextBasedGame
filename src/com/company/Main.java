package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("                                                                                                                             ,---. \n" +
                ",--.                  ,--.      ,--.              ,--.  ,--.                  ,---.                                          |   | \n" +
                "|  |    ,---.  ,---.,-'  '-.    `--',--,--,     ,-'  '-.|  ,---.  ,---.      /  O  \\ ,--,--,--. ,--,--.,-----. ,---. ,--,--, |  .' \n" +
                "|  |   | .-. |(  .-''-.  .-'    ,--.|      \\    '-.  .-'|  .-.  || .-. :    |  .-.  ||        |' ,-.  |`-.  / | .-. ||      \\|  |  \n" +
                "|  '--.' '-' '.-'  `) |  |      |  ||  ||  |      |  |  |  | |  |\\   --.    |  | |  ||  |  |  |\\ '-'  | /  `-.' '-' '|  ||  |`--'  \n" +
                "`-----' `---' `----'  `--'      `--'`--''--'      `--'  `--' `--' `----'    `--' `--'`--`--`--' `--`--'`-----' `---' `--''--'.--.  \n" +
                "                                                                                                                             '--'  ");

        Scanner input = new Scanner(System.in);

        String intro = "Bem vindo! This game is called Lost in the Amazon! You and a group of friends go on a hiking trip to the Amazon rainforest in Brazil. Upon deciding to go follow one of the forest's most lovely animals, you break from your group and get lost in the forest. Your task now is to return to your group of friends before or by the time night falls.";
        System.out.println(intro);
        System.out.println("Are you ready to get started? [Yes/No]");

        String answer = input.nextLine();

        while (!answer.toLowerCase().equals("yes")) {
            System.out.println("Are you ready to start now? [Yes/No]");
            answer = input.next();
        }
        if (answer.toLowerCase().equals("yes")) {
            Questions.question1();

        }

    }
}
