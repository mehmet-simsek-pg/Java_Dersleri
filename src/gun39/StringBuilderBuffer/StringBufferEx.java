package gun39.StringBuilderBuffer;

public class StringBufferEx {

    public static void main(String[] args) {

        // immutable
        String str = "Java";
        str.substring(1,3); // str"de bir degisiklik yapmaz
        System.out.println(str);
        str += " Dünya";    // str"de degisiklik yapildi
        System.out.println(str);
        System.out.println("-------------------------------------");

        // mutable
        StringBuffer strBuf = new StringBuffer();
        strBuf.append("Java");      // append eklenecek object"i sona ekler
        System.out.println(strBuf);
        strBuf.reverse();
        System.out.println(strBuf);
        strBuf.append(" Dünya");
        System.out.println(strBuf);

        /*
            java 1.0 ile geldi
            String Builder"a göre daha az etkili (efficient)
            coklu kullanima uygun degil
         */

    }
}
