import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) throws FileNotFoundException {
        Hangman myObj = new Hangman();

        Scanner keyboard = new Scanner(System.in);

        System.out.println("H A N G M A N");
        System.out.println("1 or 2 players?");
        String player = keyboard.nextLine();

        String word;

        if (player.equals("1")) {
            Scanner scanner = new Scanner(new File("C:/Users/user/IdeaProjects/Hangman/words_alpha.txt"));
            List<String> words = new ArrayList<>();

            while (scanner.hasNext()) {
                words.add(scanner.nextLine());
            }

            Random rand = new Random();
            word = words.get(rand.nextInt(words.size()));
        } else {
            System.out.println("Player 1, Please enter your word:");
            word = keyboard.nextLine();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("Ready for player 2! Good luck!");

        }

        System.out.println(word);

        List<Character> playerGuesses = new ArrayList<>();

        int wrongCount = 0;

        while (true) {
            myObj.printHangedMan(wrongCount);
            System.out.println("Guess a letter.");
            String letterGuess = keyboard.nextLine();

            System.out.println("Wrong count = " + wrongCount);
            if (wrongCount >= 6) {
                System.out.println("You lose!");
                System.out.println("The word was: " + word);
                break;
            }

            myObj.printWordState(word, playerGuesses);
            if (!myObj.getPlayerGuess(word, playerGuesses, letterGuess)) {
                wrongCount++;
            }

            if (myObj.printWordState(word, playerGuesses)) {
                System.out.println("Yes!  The secret word is " + word + "You have won!");
                break;
            }

            //System.out.println("Guess a letter.");
            if (letterGuess.equals(word)) {
                //System.out.println("You win!");
                System.out.println("Yes! The secret word is " + word + "You have won!");
                break;
            } else {
                System.out.println("Nope! Try again.");
            }
        }

    }

    public void printHangedMan(int wrongCount) {
        System.out.println(" ------- ");
        System.out.println(" |     |");
        if (wrongCount >= 1) {
            System.out.println(" 0");
        }
        if (wrongCount >= 2) {
            System.out.print("\\ ");
            if (wrongCount >= 3) {
                System.out.print("/");
            } else {
                System.out.print("");
            }
        }

        if (wrongCount >= 4) {
            System.out.println(" |");
        }

        if (wrongCount >= 5) {
            System.out.print("/ ");
            if (wrongCount >= 6) {
                System.out.print("\\");
            } else {
                System.out.print("");
            }
        }
        System.out.print("");
        System.out.print("");
    }

    public boolean getPlayerGuess(String word, List<Character> playerGuesses, String letterGuess) {
        {


            playerGuesses.add(letterGuess.charAt(0));
            System.out.println("Your word is " + letterGuess);
            return word.contains(letterGuess);


        }

    }

    public boolean printWordState(String word, List<Character> playerGuesses) {
        int correctCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (playerGuesses.contains(word.charAt(i))) {
                System.out.print(word.charAt(i));
                correctCount++;
            }
            else {
                System.out.print("-");
            }
        }
        System.out.println();

        return (word.length() == correctCount);
    }
}
