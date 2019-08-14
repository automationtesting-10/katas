package raul.choque;

/**
 * MexicanWave class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public final class MexicanWave {

    /**
     * Method constructor of MexicanWave class.
     */
    private MexicanWave() {
    }
    /**
     * wave method makes a mexican wave with a text.
     *
     * @param str is the text to do a wave.
     * @return an String array
     */
    public static String[] wave(String str) {
        String text = str;
        int countSpace = counter(str);
        String[] result = new String[text.length() - countSpace];
        String[] letters = text.split("");
        int j = 0;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i].matches("[a-z]")) {
                letters[i] = letters[i].toUpperCase();
                result[j++] = String.join("", letters);
                letters[i] = letters[i].toLowerCase();
            }
        }
        return result;
    }

    /**
     * counter method count the number of white space in a text.
     *
     * @param str is the text with white space.
     * @return a int as number of white space.
     */
    public static int counter(String str) {
        int result = 0;
        for (char letter:str.toCharArray()) {
            result = (String.valueOf(letter).equals(" ")) ? ++result : result;
        }
        return result;
    }
}
