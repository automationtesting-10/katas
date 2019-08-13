package melissa.roman;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

/**
 * Implements tests for MexicanWave class.
 */
public class MexicanWaveTest {
    /**
     * Test to verify result for string example "hello".
     */
    @Test
    public void basicTest1() {
        String[] result = new String[] {"Hello", "hEllo", "heLlo", "helLo", "hellO"};
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result,
                MexicanWave.wave("hello"));
    }

    /**
     * Test to verify result for string example "codewars".
     */
    @Test
    public void basicTest2() {
        String[] result = new String[] {"Codewars", "cOdewars", "coDewars", "codEwars", "codeWars", "codewArs",
                "codewaRs", "codewarS"};
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result,
                MexicanWave.wave("codewars"));
    }

    /**
     * Test to verify result for empty string.
     */
    @Test
    public void basicTest3() {
        String[] result = new String[] {};
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result,
                MexicanWave.wave(""));
    }

    /**
     * Test to verify result for two words string.
     */
    @Test
    public void basicTest4() {
        String[] result = new String[] {"Two words", "tWo words", "twO words", "two Words", "two wOrds", "two woRds",
                "two worDs", "two wordS"};
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result,
                MexicanWave.wave("two words"));
    }

    /**
     * Test to verify result for string with blank spaces at the beginning and the end.
     */
    @Test
    public void basicTest5() {
        String[] result = new String[] {" Gap ", " gAp ", " gaP "};
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result,
                MexicanWave.wave(" gap "));
    }
}
