import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HangmanTest {
    Hangman hangObj = new Hangman();

    List<Character> playerGuesses;

    @BeforeEach
    void setUp() {

        playerGuesses = new ArrayList<>();

    }

    @Test
    void getPlayerGuessTrue() {
        assertAll(
                () -> assertEquals(true, hangObj.getPlayerGuess("cat", playerGuesses, "cat"), "Output Matching the System Guessed Number"),
                () -> assertEquals(false, hangObj.getPlayerGuess("cat", playerGuesses, "dog"), "Output Matching the System Guessed Number"),
                () -> assertEquals(false, hangObj.getPlayerGuess("cat", playerGuesses, "rat"), "Output Matching the System Guessed Number")
        );
    }

    @Test
    void printWordStateTrue() {
        playerGuesses.add('g');
        playerGuesses.add('o');
        playerGuesses.add('d');
        playerGuesses.add('s');
        assertAll(
                () -> assertEquals(true, hangObj.printWordState("dog", playerGuesses), "Output Matching the System Guessed Number")
        );
    }

    @Test
    void printWordStateFalse() {
        playerGuesses.add('p');
        playerGuesses.add('w');
        playerGuesses.add('c');
        playerGuesses.add('m');
        assertAll(
                () -> assertEquals(false, hangObj.printWordState("dog", playerGuesses), "Output Matching the System Guessed Number")
        );
    }



    @AfterEach
    void tearDown() {
    }
}