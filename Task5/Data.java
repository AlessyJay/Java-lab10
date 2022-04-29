package Task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;

public class Data {
    static Scanner input = new Scanner(System.in);
    static String accountNumber, count;

    public static void UsersData() throws FileNotFoundException,
            IOException, NumberFormatException {

        File f = new File("./Task5/Bank.txt");
        System.out.println("Welcome to bank Information Searcher.");
        System.out.print("Input 3 digit numbers of bank account: ");
        accountNumber = input.nextLine();

        try (FileReader fr = new FileReader(f)) {
            BufferedReader br = new BufferedReader(fr);

            while ((count = br.readLine()) != null) {
                if (count.contains(accountNumber)) {
                    System.out.println(count);
                }
            }
        }
    }
}
