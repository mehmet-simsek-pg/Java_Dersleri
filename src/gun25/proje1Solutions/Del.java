package gun25.proje1Solutions;

import java.util.Scanner;

public class Del {
    /*
        Kullanıcıdan bir metin girmesini isteyin
        girilen metinde "del" yer alıyor ise silin ve silinmiş halini ekrana yazdırın,
        "del" yer almıyor ise metni olduğu gibi yazdırın
     */

    public static void main(String[] args) {
        // Kodlarınızı buradan sonra yazınız

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.print(str.replace("del", ""));
    }


}
