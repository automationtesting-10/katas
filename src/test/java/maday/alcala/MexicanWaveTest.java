package maday.alcala;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import java.util.Arrays;

/**
 *This class has the implementation of the tests for the Kata "MexicanWave".
 *
 * @author MadayAlcala.
 */
public class MexicanWaveTest {

    /**
     * This test verifies that the MexicanWave class works with a short input string.
     */
    @Test
    public void basicTest1() {
        String[] result = new String[]{"Hello", "hEllo", "heLlo", "helLo", "hellO"};
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, MexicanWave.wave("hello"));
    }

    /**
     * This test verifies that the MexicanWave class works with a long input string.
     */
    @Test
    public void basicTest2() {
        String[] result = new String[]{"Codewars", "cOdewars", "coDewars", "codEwars", "codeWars", "codewArs",
                "codewaRs", "codewarS"};
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, MexicanWave.wave("codewars"));
    }

    /**
     * This test verifies that the MexicanWave class works with an empty input string.
     */
    @Test
    public void basicTest3() {
        String[] result = new String[]{};
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, MexicanWave.wave(""));
    }

    /**
     * This test verifies that the MexicanWave class works with spaces in the middle of the input string.
     */
    @Test
    public void basicTest4() {
        String[] result = new String[]{"Two words", "tWo words", "twO words", "two Words", "two wOrds", "two woRds",
                "two worDs", "two wordS"};
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, MexicanWave.wave("two words"));
    }

    /**
     * This test verifies that the MexicanWave class works with spaces at the start and at the end of the input string.
     */
    @Test
    public void basicTest5() {
        String[] result = new String[]{" Gap ", " gAp ", " gaP "};
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, MexicanWave.wave(" gap "));
    }
}
