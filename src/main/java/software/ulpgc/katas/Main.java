package software.ulpgc.katas;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {

    static void main() throws IOException {
        File file = new File("document.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length());
        System.out.println(file.canRead());

        try (Reader reader = new FileReader(file, StandardCharsets.ISO_8859_1)){
            System.out.println(reader.readAllAsString());
        }
    }
}
