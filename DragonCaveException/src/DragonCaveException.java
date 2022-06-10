import java.util.Scanner;

public class DragonCaveException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are in a land full of dragons. In front of you,\n" +
                "\n" +
                "You see two caves. In one cave, the dragon is friendly\n" +
                "\n" +
                "and will share his treasure with you.  The other dragon\n" +
                "\n" +
                "is greedy and hungry and will eat you on sight.\n" +
                "\n" +
                "Which cave will you go into? (1 or 2)");

        try {
            int userInput = scanner.nextInt();

            if (userInput == 1) {
                System.out.println("You approach the cave...\n" +
                        "\n" +
                        "It is dark and spooky...\n " +
                        "\n" +
                        "A large dragon jumps out in front of you!  He opens his jaws and...\n" +
                        "\n" +
                        "Gobbles you down in one bite!");

            }
            else if (userInput == 2) {
                System.out.println("The dragon will give you treasure");
            } else {
                System.out.println("You have entered wrong number, please input 1 or 2.");
            }
        } catch (Exception e) {
            System.out.println("Caught Exception: not a valid number input");
        }
    }
}

