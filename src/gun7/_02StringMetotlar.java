package gun7;

public class _02StringMetotlar {
    public static void main(String[] args) {
        String str = "Java alistirmalar6";
        String str2 = "";

        System.out.println(str.isEmpty()); // string ifadeye bakar bos mu degil mi diye
        System.out.println(str2.isEmpty());  // bos ise true cevabi verir. Degilse false degeri verir

        System.out.println(str.startsWith("J")); //string ifadenin baslangic harfini kontrol eder. Büyük kücük harf önemlidir!
        System.out.println(str.startsWith("j"));

        System.out.println(str.endsWith("r")); //string ifadenin bitis harfini kontrol eder. Büyük kücük harf önemlidir!
        System.out.println(str.endsWith("R"));

        String strReplaceChar = str.replace('a','s');
        String strReplaceString = str.replace("a","s");

        // replace metodu verdigimiz string ya da char degiskenini
        // eski harf ile degisir. String olarak tanimlar isek kelime ve hatta
        // cümlenin tamamini da degistirebiliriz.
        System.out.println(strReplaceChar);
        System.out.println(strReplaceString);

        String strReplaceFirst = str.replaceFirst("a","*");
        // Bu kisimda ise verilen harfi cumlede ilk gectigi yeri degistirir
        System.out.println(strReplaceFirst);

        String strReplaceAll = str.replaceAll("[a-z]","*");
        // a-z arasindaki tüm kucuk harflerin yerine * yazar
        // Türkce karakterlerde degisiklik yapamiyor
        System.out.println(strReplaceAll);

        String strReplaceAll2 = str.replaceAll("[^a-z]","*");
        // a-z arasindakiler haric tüm karakterlerin yerine * yazar
        // Türkce karakterlerde degisiklik yapamiyor
        System.out.println(strReplaceAll2);

    }
}
