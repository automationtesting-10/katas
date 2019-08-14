package john.salazar;

/**
 * This class is a solution for problem of MexicanWave.
 *
 * @author John Salazar Pinto.
 */
public final class MexicanWave {

    /**
     * Method constructor.
     */
    private MexicanWave() {
    }

    /**
     *
     * @param str The Str a string parameter lowercase.
     * @return allWave
     */
    public static String[] wave(String str) {
        int sizeArray = str.replace(" ", "").length();
        int positionArray = 0;
        int size = str.length();
        String[] allWave = new String[sizeArray];
        for (int index = 0; index < size; index++) {
            String character = str.substring(index, index + 1).toUpperCase();
            if (character.contains(" ")) {
                continue;
            } else {
                StringBuilder stringBuilder = new StringBuilder(str);
                stringBuilder.replace(index, index + 1, character);
                if (positionArray <= sizeArray) {
                    allWave[positionArray] = stringBuilder.toString();
                    positionArray++;
                }
            }
        }
        return allWave;
    }
}
