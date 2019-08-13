package LimbertVargas;

import java.util.ArrayList;
import java.util.List;

public class MexicanWave {
    public static String capitalize(String str, int i) {
        String [] array = str.split("");
        array[i] = array[i].toUpperCase();
        return String.join("", array);
    }

    public static String[] wave(String str) {
        int size = str.length();
        List<String> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String temp = capitalize(str,i);
            if(!temp.equals(str))
                result.add(temp);
        }
        return result.stream().toArray(String[]::new);
    }
}
