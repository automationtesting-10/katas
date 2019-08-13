package jesus.Menacho;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import java.util.Arrays;

/**
 * Class verify the correct funtionality to the class MexicanWaveTest.
 */
public class MexicanWaveTest {

    /**
     * Test using to do test using key words "hello".
     */
    @Test
    public void basicTest1() {
        String[] result = new String[] {"Hello", "hEllo", "heLlo", "helLo", "hellO"};
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, MexicanWave.wave("hello"));
    }

    /**
     * Test using to do test using to the key words "codewars".
     */
    @Test
    public void basicTest2() {
        String[] result = new String[] {"Codewars", "cOdewars", "coDewars", "codEwars", "codeWars", "codewArs",
                "codewaRs", "codewarS"};
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, MexicanWave.wave("codewars"));
    }

    /**
     * Test using to do test when don't had parameters.
     */
    @Test
    public void basicTest3() {
        String[] result = new String[] {};
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, MexicanWave.wave(""));
    }

    /**
     * Test using to do test using to the key words "two words".
     */
    @Test
    public void basicTest4() {
        String[] result = new String[] {"Two words", "tWo words", "twO words", "two Words", "two wOrds", "two woRds",
                "two worDs", "two wordS"};
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, MexicanWave.wave("two words"));
    }

    /**
     * Test using to do testing using to the key words "gap" with spaces.
     */
    @Test
    public void basicTest5() {
        String[] result = new String[] {" Gap ", " gAp ", " gaP "};
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, MexicanWave.wave(" gap "));
    }

}
