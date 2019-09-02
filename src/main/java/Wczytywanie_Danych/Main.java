package Wczytywanie_Danych;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //2. Napisz aplikację w której:
        //
        // - wczytaj od użytkownika jedną linię tekstu
        // - po wczytaniu linii otwórz plik o nazwie 'output_2.txt'
        // - zapisz do pliku linię pobraną od użytkownika
        // - zamknij plik
        //
        //
        //stara treść (może ktoś zrozumie i będzie dla niego bardziej czytelne):
        //
        //Napisz aplikację która otwiera plik 'output_2.txt', następnie czyta jedną linię tekstu od użytkownika
        // i wpisuje tą linię do pliku. Po tej czynności plik ma się zamknąć, a następnie program ma się zakończyć.
        //
        //

        String text;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz tekst: ");
        text = scanner.nextLine();

        File plik = new File("output_2.txt"); // deskryptor pliku
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
