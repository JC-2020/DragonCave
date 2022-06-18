import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class DragonTest {
    Dragon draObj;

    @BeforeEach
    void setUp() {
        draObj = new Dragon();
    }

    @Test
    void checkDragon() {
        assertAll("Test Props",
                () -> assertEquals("You approach the cave...\n" +
                        "\n" +
                        "It is dark and spooky...\n " +
                        "\n" +
                        "A large dragon jumps out in front of you!  He opens his jaws and...\n" +
                        "\n" +
                        "Gobbles you down in one bite!", draObj.checkDragon(1), "it works for 2!"),
                () -> assertEquals("The dragon will give you treasure", draObj.checkDragon(2), "it works for 2!"),
                () -> assertEquals("You have entered wrong number, please input 1 or 2.", draObj.checkDragon(3), "t works for 2!")
        );

    }

    @AfterEach
    void tearDown() {
        System.out.println("This test completed");
    }

}