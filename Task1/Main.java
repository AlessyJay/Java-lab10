package Task1;

import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static FileWriter fs;

    public static void main(String[] args) throws IOException {
        try {
            fs = new FileWriter("./Task1/Peeranat.txt");
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        try {
            File file = new File("./Task1/Peeranat.txt");

            try (Scanner sn = new Scanner(file)) {
                String text = "Adipisicing nulla eiusmod nisi " +
                        "sint minim incididunt.";

                while (sn.hasNextLine()) {
                    text = text.concat(sn.nextLine());
                }
                fs.write(text);
            }
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        } finally {
            fs.close();
        }
    }
}