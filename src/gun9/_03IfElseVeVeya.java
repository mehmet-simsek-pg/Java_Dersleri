package gun9;

import java.util.Scanner;

public class _03IfElseVeVeya {
    public static void main(String[] args) {

        /*
        ögrenci sinavdan 50 den az alirsa sinifta kalir
        50 ve 80 arasi iyi not alir
        80 ve 100 arasi pekiyi not alir
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Notunuzu girin");
        int not = scanner.nextInt();
        if (not<50){
            System.out.println("büte kalsin");
        } else if (not>=50 && not<80){ // yazilan iki sartin da saglanmasi gerekli
            System.out.println("Iyi");
        } else if (not>=80 && not<100){
            System.out.println("pekiyi");
        }
        else {
            System.out.println("100 aldin");
        }

        if (not<50){
            System.out.println("büte kalsin");
        } else if (not>=50 || not<80){ // bir sart saglanirsa kosul gecerli olur
            System.out.println("Iyi");
        } else if (not>=80 || not<100){
            System.out.println("pekiyi");
        }
    }
}
