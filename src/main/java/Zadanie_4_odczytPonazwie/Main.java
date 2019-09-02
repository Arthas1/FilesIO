package Zadanie_4_odczytPonazwie;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text;
        String adrespliku;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz adres sprawdzanego pliku: ");
        adrespliku = scanner.nextLine();

        File plik = new File(adrespliku); // deskryptor pliku


        try {
            if (!plik.exists()) {
                System.out.println("Plik nie istnieje");
                plik.createNewFile();
            }
        } catch (IOException ioe) {
            System.out.println("error " + ioe.getMessage());
        }
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(plik, true/*Flaga czy dopisać*/))) {
//            PrintWriter printWriter = new PrintWriter(new FileWriter(plik));


        } catch (IOException ioe) {
            System.out.println("error " + ioe.getMessage());

        }
    }
}