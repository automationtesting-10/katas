package raul.choque;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * MexicanWaveTest class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class MexicanWaveTest {

    /**
     * Method to test use a one word.
     */
    @Test
    public void test1UseOneWord() {
        String[] result = new String[] {"Hello", "hEllo", "heLlo", "helLo", "hellO"};
        assertArrayEquals(result, MexicanWave.wave("hello"));
    }

    /**
     * Another method to test use a one word.
     */
    @Test
    public void test2UseOneWord() {
        String[] result = new String[] {"Codewars", "cOdewars", "coDewars",
            "codEwars", "codeWars", "codewArs", "codewaRs", "codewarS"};
        assertArrayEquals(result, MexicanWave.wave("codewars"));
    }

    /**
     * Method to test use a word empty.
     */
    @Test
    public void test3UseStringEmpty() {
        String[] result = new String[] {};
        assertArrayEquals(result, MexicanWave.wave(""));
    }

    /**
     * Method to test use two words.
     */
    @Test
    public void test4UseTwoWords() {
        String[] result = new String[] {"Two words", "tWo words", "twO words", "two Words",
            "two wOrds", "two woRds", "two worDs", "two wordS"};
        assertArrayEquals(result, MexicanWave.wave("two words"));
    }

    /**
     * Method to test use a word with a init and end white space.
     */
    @Test
    public void test5UseOneWordWithSpaceInitAndEnd() {
        String[] result = new String[] {" Gap ", " gAp ", " gaP "};
        assertArrayEquals(result, MexicanWave.wave(" gap "));
    }
}
