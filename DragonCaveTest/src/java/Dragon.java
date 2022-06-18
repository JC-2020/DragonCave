import java.util.Scanner;

public class Dragon {

    public String getDragon() {
        String dragonCave = "";
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
            dragonCave = checkDragon(userInput);
        } catch (Exception e) {
            System.out.println("Caught Exception: not a valid number input");
        }
        return dragonCave;
    }

    public String checkDragon(int inpNum) {
        {
            String mesg = "";
            if (inpNum == 1) {
                mesg = "You approach the cave...\n" +
                        "\n" +
                        "It is dark and spooky...\n " +
                        "\n" +
                        "A large dragon jumps out in front of you!  He opens his jaws and...\n" +
                        "\n" +
                        "Gobbles you down in one bite!";

            } else if (inpNum == 2) {
                mesg = "The dragon will give you treasure";
            } else {
                mesg = "You have entered wrong number, please input 1 or 2.";
            }
            return mesg;
        }
    }
}





