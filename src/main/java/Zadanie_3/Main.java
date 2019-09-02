package Zadanie_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ////3. Należy napisać aplikację która w pętli while czyta ze Scannera wejście użytkownika z konsoli,
        //        // a następnie linia po linii wypisuje tekst do pliku 'output_3.txt'.
        //        // Aplikacja ma się zamykać po wpisaniu przez użytkownika komendy "quit".
        //        //
        //        //
        //        //Pętla powinna być w try, a nie try w pętli.

        Scanner scanner = new Scanner(System.in);
        String text;


        File plik = new File("output_3.txt"); // deskryptor pliku
        try {
            if (!plik.exists()) {
                plik.createNewFile();
            }
        } catch (IOException ioe) {
            System.out.println("error " + ioe.getMessage());
        }
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(plik, false/*Flaga czy dopisać*/))) {
//            PrintWriter printWriter = new PrintWriter(new FileWriter(plik));
            do {
                System.out.println("Wprowadz tekst: ");
                text = scanner.nextLine();
                System.out.println(text);
                printWriter.println(text);
                printWriter.flush(); // wypchniecie na dysk
            }
            while (!text.equalsIgnoreCase("quit"));
        } catch (IOException ioe) {
            System.out.println("error " + ioe.getMessage());
        }
    }
}

