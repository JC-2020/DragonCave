import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class GuessNumberTest {

    GuessNumber guessnumber;

    @BeforeEach
    void setUp() {
        System.out.println("Before each");
        guessnumber = new GuessNumber();
    }

    @Test
    void checkNumber() {

        assertAll("Test Props",
                () -> assertEquals("yes", guessnumber.checkNumber(1, 1), "Output Matching the System Guessed Number"),
                () -> assertEquals("your number is too small", guessnumber.checkNumber(20, 1), "Output Matching the System Guessed Number"),
                () -> assertEquals("your number is too big", guessnumber.checkNumber(1, 8), "User entered wrong Number One"),
                () ->assertEquals("you entered the wrong number", guessnumber.checkNumber(5, 30), "User entered wrong Number Two"),
                () ->assertEquals("you entered the wrong number", guessnumber.checkNumber(5, -5), "User entered wrong Number Two")
        );
    }

    @AfterEach
    void tearDown() {
    }

}