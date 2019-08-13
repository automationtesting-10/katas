package alejandro.Sanchez;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import java.util.Arrays;

/**
 * Test class for MexicanWave class.
 */
public class MexicanWaveTest {
    /**
     * Test a single four-character string.
     */
    public void testSomething() {
        String[] expected = new String[]{"Hola", "hOla", "hoLa", "holA"};
        assertArrayEquals(expected, MexicanWave.wave("hola"));
    }

    /**
     * Test a single two-character string.
     */
    @Test
    public void testAnotherthing() {
        String[] expected = new String[]{"Au", "aU"};
        assertArrayEquals(expected, MexicanWave.wave("au"));
    }

    /**
     * Test a single three-character string.
     */
    @Test
    public void testThreeAmigos() {
        String[] expected = new String[]{"Auc", "aUc", "auC"};
        assertArrayEquals(expected, MexicanWave.wave("auc"));
    }

    /**
     * Test an empty string.
     */
    @Test
    public void testNothing() {
        String[] expected = new String[]{};
        assertArrayEquals(expected, MexicanWave.wave(""));
    }

    /**
     * Test a two strings separated by a single space.
     */
    @Test
    public void testSpaces() {
        String[] expected = new String[]{"Hola amigos", "hOla amigos", "hoLa amigos", "holA amigos", "hola Amigos",
                "hola aMigos", "hola amIgos", "hola amiGos", "hola amigOs", "hola amigoS"};
        assertArrayEquals(expected, MexicanWave.wave("hola amigos"));
    }

    /**
     * Test a single four-character string.
     */
    @Test
    public void basicTest1() {
        String[] result = new String[] {"Hello", "hEllo", "heLlo", "helLo", "hellO" };
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result,
                MexicanWave.wave("hello"));
    }

    /**
     * Test a single nine-character string.
     */
   @Test
    public void basicTest2() {
        String[] result = new String[] {"Codewars", "cOdewars", "coDewars", "codEwars", "codeWars", "codewArs",
                "codewaRs", "codewarS" };
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result,
                MexicanWave.wave("codewars"));
    }

    /**
     * Test a non-alphabetic single-character string.
     */
    @Test
    public void basicTest3() {
        String[] result = new String[] {};
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result,
                MexicanWave.wave(""));
    }

    /**
     * Test a two words separated by a space.
     */
    @Test
    public void basicTest4() {
        String[] result = new String[] {"Two words", "tWo words", "twO words", "two Words", "two wOrds", "two woRds",
                "two worDs", "two wordS" };
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result,
                MexicanWave.wave("two words"));
    }

    /**
     * Test a single string with a leading space and a trailing space.
     */
    @Test
    public void basicTest5() {
        String[] result = new String[] {" Gap ", " gAp ", " gaP " };
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result,
                MexicanWave.wave(" gap "));
    }
}
