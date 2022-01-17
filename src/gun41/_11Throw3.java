package gun41;

import java.io.IOException;
import java.util.Scanner;

public class _11Throw3 {
    /*
        girilen sayi cift ise,
        3 ile bölünüyor ise iki farkli hata throw edip yakalayin.
        hata yok ise karesini ve karekökünü ekrana yazdirin
        hatasiz girinceye kadar döngü devam etsin

     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){

            try {
                System.out.print("Sayi giriniz : ");
                int i = sc.nextInt();
                if (i % 2 == 0)
                    throw new ArithmeticException("2 ile bölünme hatasi");
                if (i % 3 == 0)
                    throw new IOException("3 ile bölünme hatasi");

                System.out.println("Karesi : " + (i*i));
                System.out.println("Kare kökü : "+ Math.sqrt(i));
                break;
            }catch (ArithmeticException e){
                System.out.println(e.getMessage() + ", Olmamali");
            }catch (IOException e){
                System.out.println(e.getMessage() + ", Bu hic olmadi");
            }catch (Exception e){
                System.out.println(e.getMessage() + ", hele bu hiic olmadi");
                sc.nextLine();
            }


        }



    }
}
