/*
 * Copyright (c) 2019 Jalasoft.
 *
 * This software is the confidential and proprietary information of Jalasoft.
 * ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jalasoft.
 */
package jesus.Menacho;

import org.apache.commons.lang3.StringUtils;

/**
 * Class "wave"allows to transform words as if they were people doing
 * the Mexican hello, for it changes a letter to capital letter at the
 * same time.
 *
 * @author Jesus Menacho.
 * @version 1.0
 */
public final class MexicanWave {
    static final int INIT_VARIABLE = 0;

    /**
     * Class constructor.
     */
    private MexicanWave() {
    }

    /**
     * Method "wave"allows to transform words as if they were people doing
     * the Mexican hello, for it changes a letter to capital letter at the
     * same time.
     *
     * @param str Method need a string that containt one o more words.
     * @return A string array.
     */
    public static String[] wave(String str) {
        String stringWithOutSpace = str.replace(" ", "");
        String[] stringVariableWithOutSpace = new String[stringWithOutSpace.length()];
        String stringTemp = "";
        int count = INIT_VARIABLE;
        for (int index = INIT_VARIABLE; index < str.length(); index++) {
            String[] stringSplit = str.split("");
            char extractOneCharacter = stringSplit[index].charAt(INIT_VARIABLE);
            stringSplit[index] = Character.toString(Character.toUpperCase(extractOneCharacter));
            if (extractOneCharacter != ' ') {
                stringVariableWithOutSpace[count] = StringUtils.join(stringSplit);
                count++;
            }
        }
        return stringVariableWithOutSpace;
    }
}
