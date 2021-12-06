package gun16;

public class _02_Array {
    public static void main(String[] args) {

        String str = "Hello World";

        String[] strArray = new String[6]; // 1. tanimlama sekli
        String[] array ={"hello","merhaba","hallo"}; // 2. tanimlama sekli

        strArray[0] = ""; // hicbir deger yok. yokluk diyebiliriz
        strArray[2] = " "; // degeri bosluk bir degeri var
        strArray[4] = "Hello";
        strArray[5] = "I love Java";

        for (int i = 0; i < strArray.length; i++) {
            /*
            String array lerde indislere deger atanmaz ise
            default null degerini cikti olarak verir
             */
            System.out.println(strArray[i]);
        }
    }
}
