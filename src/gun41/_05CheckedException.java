package gun41;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _05CheckedException {

    public static void main(String[] args) {
        // checked exceptions, java disinda islmler var ise, dosya islemleri,
        // sistem islemleri, database baglantisi
        // checked exceptions ya try-catch icine alinir ya da exception throw edilir
        try {
            FileInputStream inputStream = new FileInputStream("d:/a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    // try-catch"alinmayan checked exceptionslar exception throw edilmelidir
    // bu methodu kullanan baska methodlar da ya try-catch icinde kullanmali ya da exception throw etmelidir
    public void method1() throws FileNotFoundException {
        getFile1("file");
    }

    // try-catch icine alinan checked exceptions"lar exception throw etmezler
    public void method2() {
        try {
            getFile1("file");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void getFile1(String dosyaAdi) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(dosyaAdi);
    }

    public void method3(){
        getFile2("asdasd");
    }

    public void getFile2(String dosyaAdi) {
        try {
            FileInputStream fileInputStream = new FileInputStream(dosyaAdi);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
