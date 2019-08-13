
/**
 * MexicanWave class.
 *
 * @author Cristian Lujan
 * @version 0.1
 */
class MexicanWave {

    /**
     * Create array wave.
     * @param seatString input string
     * @return wave
     */
    public static String[] wave(String seatString) {

        final int seatCount = countSeats(seatString);
        String[] wave = new String[seatCount];

        for (int waveIndex = 0, seatIndex = 0; waveIndex < wave.length; waveIndex++, seatIndex++) {
            char seatCharWave = seatString.charAt(seatIndex);
            while (Character.isWhitespace(seatCharWave)) {
                seatCharWave = seatString.charAt(++seatIndex);
            }
            StringBuilder seatWaveStringBuilder = new StringBuilder(seatString);
            seatWaveStringBuilder.setCharAt(seatIndex, Character.toUpperCase(seatCharWave));
            wave[waveIndex] = seatWaveStringBuilder.toString();
        }
        return wave;
    }

    /**
     * Return count of spaces white.
     * @param seatString input string
     * @return count of space white
     */
    private static int countSeats(String seatString) {
        int whiteSpaceCount = (int) seatString.codePoints().filter(Character::isWhitespace).count();
        return seatString.length() - whiteSpaceCount;
    }

    /**
     * Constructor of class.
     */
    protected MexicanWave() {

    }
}
