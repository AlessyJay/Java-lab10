package Task3;

import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static String url = "./Task3/PeeranatCopy.txt",
            orginal = "./Task2/Peeranat.txt",
            storage;

    public static void main(String[] args) throws IOException {
        File f = new File(orginal);
        try {
            Scanner sn = new Scanner(f);
            while (sn.hasNextLine()) {
                storage = sn.nextLine();
            }
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter(url)) {
            storage = storage.replaceAll(" ", "-");
            fw.write(storage);
        }
    }
}