package software.ulpgc.katas;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    static void main(){
        String s = "¡Viva España!";
        byte[] utf = s.getBytes();
        byte[] iso = s.getBytes(StandardCharsets.ISO_8859_1);

        System.out.println("UTF-8 Coded & UTF-8 Decoded");
        System.out.println(new String(utf));
        System.out.println("ISO_8859_1 Coded & ISO_8859_1 Decoded");
        System.out.println(new String(iso, StandardCharsets.ISO_8859_1));

        System.out.println("UTF-8 Coded & ISO_8859_1 Decoded");
        System.out.println(new String(utf, StandardCharsets.ISO_8859_1));
        System.out.println("ISO_8859_1 Coded & UTF-8 Decoded");
        System.out.println(new String(iso));
    }
}
