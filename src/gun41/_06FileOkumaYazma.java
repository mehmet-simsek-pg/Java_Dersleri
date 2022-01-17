package gun41;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class _06FileOkumaYazma {

    public static void main(String[] args) throws IOException {

        dosyaYaz("info.txt");
        System.out.println("---------");
        dosyaOku("info.txt");

    }

    public static void dosyaYaz(String dosyaAdi) throws IOException {
        FileWriter fileWriter = new FileWriter(dosyaAdi);
        fileWriter.write("Java ");
        fileWriter.write("2022");
        fileWriter.close();
    }

    public static void dosyaOku(String dosyaAdi) throws IOException {
        FileReader fileReader = new FileReader(dosyaAdi);
        Scanner sc = new Scanner(fileReader);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
        fileReader.close();
    }
}
