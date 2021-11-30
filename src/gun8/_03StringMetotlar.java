package gun8;

public class _03StringMetotlar {
    public static void main(String[] args) {
        String str = "Java";
        String strTrim = str.trim();
        // trim() metodu string ifadenin basindaki ve sonundaki bosluklari siler.
        System.out.println(strTrim);
        System.out.println(str.length());
        System.out.println(strTrim.length());

        String strToLowerCase = str.toLowerCase();
        // string ifade icerisindeki tüm büyük harfleri kücük harfe cevir.
        System.out.println(strToLowerCase);

        String strToUpperCase = str.toUpperCase();
        // string ifade icerisindeki tüm kücük harfleri büyük harfe cevir.
        System.out.println(strToUpperCase);

        String strEquals = "java";
        System.out.println(str.equals(strEquals));
        // girilen iki string in esit olup olmadigina bakar.(büyük kücük harf duyarli)
        System.out.println(str.equalsIgnoreCase(strEquals));
        // girilen iki string in esit olup olmadigina bakar.(büyük kücük harf olmasi önemli degil)

        System.out.println(str.contains("Java"));
        // string icerisinde verilen string ifadenin olup olmadigini kontrol eder.
        // büyük kücük harf, bosluk olup olmamasi kisaca herseyin kontrolünü yapar.

    }
}
