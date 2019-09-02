package Pliki_przyklad1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        File plik = new File("/tmp/tekst_do_przeczytania"); // deskryptor pliku
        try {
            if (!plik.exists()) {
                plik.createNewFile();
            }
        } catch (IOException ioe) {
            System.out.println("error " + ioe.getMessage());
        }
//        try {
//            PrintWriter printWriter = new PrintWriter(new FileWriter(plik, true/*Flaga czy dopisać*/));
////            PrintWriter printWriter = new PrintWriter(new FileWriter(plik));
//
//            printWriter.println("Siema ziomki!");
//
//            printWriter.close();
//        } catch (IOException ioe) {
//            System.out.println("error " + ioe.getMessage());
//        }


        // try with resources
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(plik, true/*Flaga czy dopisać*/))) {
//            PrintWriter printWriter = new PrintWriter(new FileWriter(plik));

            printWriter.println("Siema ziomki!");
        } catch (IOException ioe) {
            System.out.println("error " + ioe.getMessage());
        }
    }
}