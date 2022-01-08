package gun35.proje3Solutions.GameGuess;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    /*
        int randomGenerator();  methodu oluşturun.
        Bu method 0 ile 100 arasında random bir sayı oluşturmalı.
        Bu method random sayıyı return etmeli.
     */

    public int randomGenerator(){
        return new Random().nextInt(10);
    }




    /*
        void letsGuess ()  methodunu oluşturalım.
        Bu method parametre olarak bir int almalı.
        Bu method, kullanici doğru sayıyı bulana ya da tahmin etme limitine ulaşana kadar sormaya devam edecek.
        Girilen sayı random sayıdan küçükse "Your number is too low" yazdıralım.
        Girilen sayı random sayıdan büyükse "Your number is too high" yazdıralım.
        Girilen sayı random sayıya eşit olduğunda "You got it !!" yazdıralım
        Ve loop sonlandırılsın.
        Tahmin girişiminiz maksimum 5'tir.
        Eğer tahmininiz  5'e ulaşırsa "Anlamadım dostum !!!"

        Not:
         1) Sayıları tahmin ederken Scanner Class kullanmanız gerekir.
         2) Bu methodların her ikisi de statik bir method değildir
    */

    public void letsGuess(int num){

        int count = 0;

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("Tahmin sayiniz : ");
            int t = sc.nextInt();
            count++;
            if (t == num){
                System.out.println("You got it !!");
                break;
            }
            if (count >= 5){
                System.out.println("Anlamadım dostum !!!");
                break;
            }

            if(t < num){
                System.out.println("Your number is too low");
            }else {
                System.out.println("Your number is too high");
            }
        }
    }

}
