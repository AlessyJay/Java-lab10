package Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Data {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String firstName, lastName, url = "./Task4/Users.txt";

    public static void InputData() throws IOException {

        System.out.println("Welcome to simple registeration.");
        System.out.print("Please enter your first name: ");
        firstName = br.readLine();
        System.out.print("Please enter your last name: ");
        lastName = br.readLine();

        try (FileWriter fw = new FileWriter(url)) {
            fw.append("First name: " + firstName + "\n");
            fw.append("Last name: " + lastName + "\n");
        }
    }

    public static void ReadData() throws FileNotFoundException {
        File f = new File(url);
        try (Scanner sn = new Scanner(f)) {
            while (sn.hasNextLine()) {
                System.out.println(sn.nextLine());
            }
        }
    }
}