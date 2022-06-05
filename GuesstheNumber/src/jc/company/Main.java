package jc.company;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numb = Math.floor(Math.random() * 20);
        System.out.println("Hello! What is your name?");
        String name = scanner.nextLine();
        System.out.println("Well, " + name + ", I am thinking of a number between 1 and 20");
        System.out.println("Take a guess");

        int count = 0;
        while(count <= 6) {
            double inputNum = scanner.nextDouble();
            if (inputNum < numb) {
                System.out.println("Your guess is low");
                count++;
            } else if (inputNum > numb) {
                System.out.println("Your guess is high");
                count++;
            } else {
                System.out.println("Good job! " + name + "You guess my number in " + count + " guesses! ");
                count++;
                if (count < 6){
                    System.out.println("Would you like to play again? y or n");
                    String yes = scanner.next();
                    if (yes.equalsIgnoreCase("y")) {
                        System.out.println("Take a guess");
                    }
                    else
                        break;
                }
            }
        }
    }
}