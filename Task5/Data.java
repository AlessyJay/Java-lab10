package Task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;
import java.net.*;

public class Data {
    static Scanner input = new Scanner(System.in);
    static String accountNumber, count,
            url = "https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt";

    public static void UsersData() throws FileNotFoundException,
            IOException, NumberFormatException {

        URL link = new URL(url);
        InputStream ins = link.openStream();

        System.out.println("Welcome to bank Information Searcher.");
        System.out.print("Input 3 digit numbers of bank account: ");
        accountNumber = input.nextLine();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(ins))) {
            while ((count = br.readLine()) != null) {
                if (count.contains(accountNumber)) {
                    System.out.println(count);
                }
            }
        }
    }
}
