package Task2;

import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Main {
    static String URL = "./Task2/Peeranat.txt";
    static FileWriter fs;
    static Scanner sn;
    static File file = new File(URL);

    public static void main(String[] args) throws IOException {
        String text = "Adipisicing nulla eiusmod nisi " +
                "sint minim incididunt.";
        try (FileWriter fs = new FileWriter(file)) {
            fs.write(text);
        }

        try (Scanner sn = new Scanner(file)) {
            while (sn.hasNextLine()) {
                sn.nextLine();
            }
        }
    }
}
