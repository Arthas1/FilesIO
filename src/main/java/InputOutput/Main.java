package InputOutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz tekst: ");
        text = scanner.nextLine();

        File plik = new File("output_1.txt"); // deskryptor pliku
        try {
            if (!plik.exists()) {
                plik.createNewFile();
            }
        } catch (IOException ioe) {
            System.out.println("error " + ioe.getMessage());
        }
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(plik, true/*Flaga czy dopisać*/))) {
//            PrintWriter printWriter = new PrintWriter(new FileWriter(plik));

            printWriter.println(text);
        } catch (IOException ioe) {
            System.out.println("error " + ioe.getMessage());

        }
    }
}
