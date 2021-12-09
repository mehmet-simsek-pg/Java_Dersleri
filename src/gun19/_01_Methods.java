package gun19;

public class _01_Methods {
    public static void main(String[] args) {
        int sayi1 = 3;
        int sayi2 = 5;
        findEnb(sayi1, sayi2);
        findEnb(45, 67);
        findEnb(34, 77);
    }

    public static void findEnb(int num1, int num2){
        /*
        int num1 ve int num2 ye parametre denir. Motodun kullanildigi yerde icine verilen degerlerdir.
        Parametre vermenin bir siniri yoktur. Parametreler ayni tipte olmak zorunda degildir.
        Parametre isimleri ile disaridan gelen verinin isminin ayni olmak zorunda degildir.
         */
        if (num1>num2){
            System.out.println(num1);
        }
        else {
            System.out.println(num2);
        }
    }


}
