package limbert.vargas;

import java.util.ArrayList;
import java.util.List;

/**
 * The wave (known as the Mexican wave in the English-speaking world outside North America) is an example of metachronal
 * rhythm achieved in a packed stadium when successive groups of spectators briefly stand, yell, and raise their arms.
 * Immediately upon stretching to full height, the spectator returns to the usual seated position.
 * The result is a wave of standing spectators that travels through the crowd, even though individual spectators never
 * move away from their seats. In many large arenas the crowd is seated in a contiguous circuit all the way around the
 * sport field, and so the wave is able to travel continuously around the arena; in discontiguous seating arrangements,
 * the wave can instead reflect back and forth through the crowd. When the gap in seating is narrow, the wave can
 * sometimes pass through it. Usually only one wave crest will be present at any given time in an arena, although
 * simultaneous, counter-rotating waves have been produced. (Source Wikipedia).
 */
public final class MexicanWave {

    /**
     * This is the constructor of the MexicanWave class.
     */
    private MexicanWave() {
    }

    /**
     * This method analize all the enter words.
     *
     * @param str is the word.
     * @param index scroll the index of the Uppercase letter.
     * @return a string for analize the space.
     */
    public static String capitalize(String str, int index) {
        String[] array = str.split("");
        array[index] = array[index].toUpperCase();
        return String.join("", array);
    }

    /**
     * This method analize all teh words to enter in the Tests.
     * @param str the word.
     * @return a strign with uppercase letter scrolling.
     */
    public static String[] wave(String str) {
        int size = str.length();
        List<String> result = new ArrayList<>();
        for (int index = 0; index < size; index++) {
            String temp = capitalize(str, index);
            if (!temp.equals(str)) {
                result.add(temp);
            }
        }
        return result.stream().toArray(String[]::new);
    }
}
