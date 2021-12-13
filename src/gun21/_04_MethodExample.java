package gun21;

public class _04_MethodExample {
    public static void main(String[] args) {
        /*
         Girilen yeni bir password un kurallara uygunluğunu kontrol eden bir metot yazin.
                  kurallar :
                  1) en az 8 karakter olmalı
                  2) içinde pass kelimesi olmamalı
                  3) en fazla 12 karakter olmalı.
         */

        System.out.println(isCorrect("ahahahaha23"));
        System.out.println(isCorrect("pass34"));

    }
    public static boolean isCorrect(String password){

        return password.length() > 8 && password.length() < 12
                && !(password.contains("pass"));

    }

}
