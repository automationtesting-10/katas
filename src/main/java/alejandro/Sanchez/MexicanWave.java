package alejandro.Sanchez;

/**
 * Given a string, returns an array of strings whose characters wave ala Mexican Wave.
 */
public final class MexicanWave {
    private static final char LOWER_LIMIT = 'a';
    private static final char UPPER_LIMIT = 'z';
    private static final char SKIP_CHAR = ' ';

    /**
     * Class Constructor.
     */
    private MexicanWave() {
    }

    /**
     * Returns an array of Strings, each one with an uppercased character, and the next string with the next character
     * uppercased.
     *
     * @param inputString The string to be uppercased ala Mexican Wave
     * @return an array of Strings, each one with an uppercased character.
     */
    public static String[] wave(String inputString) {
        int inputLength = inputString.length();
        int lengthWithoutSpaces = inputString.length() - countSpaces(inputString);
        String[] outputStringArray = new String[lengthWithoutSpaces];
        int outputStringIndex = 0;
            for (int inputStringIndex = 0; inputStringIndex < inputLength; inputStringIndex++) {
                if ((inputString.charAt(inputStringIndex) >= LOWER_LIMIT) && (inputString.charAt(inputStringIndex)
                        <= UPPER_LIMIT)) {
                    outputStringArray[outputStringIndex] = inputString.substring(0, inputStringIndex)
                            + Character.toString(Character.toUpperCase(inputString.charAt(inputStringIndex)))
                            + inputString.substring(inputStringIndex + 1, inputLength);
                    outputStringIndex++;
                }
            }
        return outputStringArray;
    }

    /**
     * Returns the number of times that a space occurs within a given string.
     *
     * @param inputString The string in which spaces are to be counted
     * @return the number of times a space occurs.
     */
    public static int countSpaces(String inputString) {
        int spacesCount = 0;
        for (int inputStringIndex = 0; inputStringIndex < inputString.length(); inputStringIndex++) {
            if (inputString.charAt(inputStringIndex) == SKIP_CHAR) {
                spacesCount++;
            }
        }
        return spacesCount;
    }
}
