package melissa.roman;

import java.util.ArrayList;
import java.util.List;

/**
 * MexicanWave class is in charge of generate the corresponding strings from the wave.
 *
 * @author Melissa Roman
 * @version 1.0
 */
public final class MexicanWave {
    /**
     * Requested constructor.
     */
    private MexicanWave() {

    }
    /**
     * Returns an array of strings with the corresponding strings of the wave.
     * @param str - Input string which is desired to apply the wave to.
     * @return Array od strings.
     */
    public static String[] wave(String str) {
        int length = str.length();
        List<String> listStrings = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            StringBuilder strInIndex = new StringBuilder();
            if (str.charAt(i) != ' ') {
                for (int j = 0; j < length; j++) {
                    if (j == i) {
                        strInIndex.append(Character.toUpperCase(str.charAt(j)));
                    } else {
                        strInIndex.append(str.charAt(j));
                    }
                }
                listStrings.add(strInIndex.toString());
            }
        }
        return listStrings.toArray(new String[0]);
    }
}
