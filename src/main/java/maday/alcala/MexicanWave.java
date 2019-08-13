package maday.alcala;

import java.util.ArrayList;
import java.util.List;

/**
 *This class has the implementation of the solution to the Kata "MexicanWave".
 *
 * @author MadayAlcala.
 */
public final class MexicanWave {
    /**
     *This is the constructor method.
     */
    private MexicanWave() {
    }

    /**
     *
     * @param str the str parameter defines the input string.
     * @return an array of String.
     */
    public static String[] wave(String str) {
        int size = str.length();
        int index;
        List<String> aux = new ArrayList<>();
        for (index = 0; index < size; index++) {
            char seat = str.charAt(index);
            if (seat != ' ') {
                StringBuilder wave = new StringBuilder(str);
                wave.setCharAt(index, Character.toUpperCase(seat));
                aux.add(wave.toString());
            }
        }
        String[] result = new String[aux.size()];
        for (index = 0; index < aux.size(); index++) {
            result[index] = aux.get(index);
        }
        return result;
    }
}
