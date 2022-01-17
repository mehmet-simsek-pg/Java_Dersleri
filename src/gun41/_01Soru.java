package gun41;

import java.util.Scanner;

public class _01Soru {

    /*
        kullanicidan bir int alacaz. Hatasiz girimesini saglayalim.
        integer girene kadar okutma islemi devam edecek


     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        while (true){
            try {
                sc.nextInt();
                break;
            }catch (Exception e){
                System.out.println("Sayi Girin");
                sc.nextLine();
            }
        }
         */
        boolean devam = true;
        while (devam){
            try {
                sc.nextInt();
                devam = false;
            }catch (Exception e){
                System.out.println("Sayi Girin");
                sc.nextLine();
            }
        }





    }

}
