package pwo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;

public class Zadanie2 {

    public static final int FROM = 0, TO = 100;
    public static final String FILE_NAME = "lucseq100.txt";

    public static void main(String[] args) {

        boolean ok = SequenceTools.writeToFile(new LucasGenerator(), FROM, TO, FILE_NAME);
        if (ok) {
            System.out.println("Wynik zapisany do pliku: "
                    + FILE_NAME);
        } else {
            System.out.println("Błąd");
        }
        System.out.println("Lucas wersja 1");

    }
}
