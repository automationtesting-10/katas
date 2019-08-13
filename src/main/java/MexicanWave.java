/**
 * This Class perform the knew Mexican Wave.
 */
public final class MexicanWave {

    /**
     * Constructor of MexicanWave Class.
     */
     private MexicanWave() {
    }

    /**
     * Simulates the Mexican Waves.
     *
     * @param str - The string that want to wave.
     * @return resultSize.
     */
    public static String[] wave(String str) {
        int resultSize = str.replaceAll(" ", "").length();
        int resultPosition = 0;
        String[] result = new String[resultSize];
        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) != ' ') {
                result[resultPosition] = transformString(str, index);
                resultPosition++;
            }
        }
        return result;
    }

    /**
     * Simulates the Mexican Waves.
     *
     * @param str   - The string that want uppercase in index position.
     * @param index - The index of the selected letter to uppercase position.
     * @return String with the index char uppercase.
     */
    private static String transformString(String str, int index) {
        String letter = (str.charAt(index) + "").toUpperCase();
        return str.substring(0, index) + letter + str.substring(index + 1);
    }
}
