package gun21;


public class _06_MethodExample {
    public static void main(String[] args) {
        /*
         aaabbbfffgggtttdddd b bu sekilde yazilmis bir kelimeyi düzenleyecek bir metot yazin.
         ciktisi bu sekilde olacaktir -> 3a3b3f3g3t4d
         */


        System.out.println(duzenlenmis("aaabbbfffgggtttddddba"));
    }

    public static String duzenlenmis(String str) {

        String yeniHali = "";
        String[]array = str.split("");
        // ifadeyi düzenledikten sonra atacagimiz bos string degisken
        int count; // cümle icerisindeki 1 harfin kac tane oldugunu bulmak icin degisken
        for (int i = 0; i < str.length(); i++) {
            // dis döngü sirayla harfi alir
            String harf = String.valueOf(str.charAt(i)); // o an ki harfi asagida kontrol etmek icin string degiskene atadik
            count=0; // her harf icin sayac 0 dan saymaya baslasin diye döngü icerisinde count u 0 a esitledik
            for (int j = 0; j < array.length; j++) {
                // yukaridan gelen harfi cümle icerisinde kontrol etmek icin olan döngü
                if (array[i].contains(array[j])){
                    // yukaridan gelen harfi cümle(kelime icerisinde sirayla olup olmadigini kontrol ediyor)
                    count++;
                }
            }
            if (!yeniHali.contains(harf))
                // o an ki harf in düzenlenen string icerisinde olup olmadigini
                // kontrol ediyor. Eger yoksa düzenlenen stringe ekliyor
            yeniHali+=count+harf;

        }
        return yeniHali;
    }


}
