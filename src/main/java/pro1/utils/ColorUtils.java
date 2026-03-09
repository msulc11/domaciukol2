package pro1.utils;

import java.util.Random;

public class ColorUtils {
    static Random random = new Random();

    public static String randomColor(){
        String r = String.format("%02X",random.nextInt(256));
        String g = String.format("%02X",random.nextInt(256));
        String b = String.format("%02X",random.nextInt(256));
        return "#"+r+g+b;
    }
}
