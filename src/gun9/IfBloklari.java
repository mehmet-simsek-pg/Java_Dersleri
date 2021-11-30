package gun9;

public class IfBloklari {
    public static void main(String[] args) {

        String str = "If ornekler";

        boolean b = str.equals("e");
        boolean c = str.equalsIgnoreCase(" ");
        boolean bb = str.isEmpty();
        boolean a = str.startsWith("e");
        boolean aa = str.endsWith("e");
        boolean cc = str.contains("c");

        int sayi1 = 5;
        int sayi2 = 4;

        boolean sayiBoolean1 = sayi1 == sayi2;
        boolean sayiBoolean2 = sayi1 != sayi2;
        boolean sayiBoolean3 = sayi1 > sayi2;
        boolean sayiBoolean4 = sayi1 < sayi2;
        boolean sayiBoolean5 = sayi1 >= sayi2;
        boolean sayiBoolean6 = sayi1 <= sayi2;


        if (sayi1==sayi2){
            //parantez icersindeki ifadenin cevabi true ise
            // if süslü parantezleri arasi calisir
            System.out.println("Iki sayi esittir");
        }
        else {
            // cevap false ise else süslü parantezleri arasi calisir
            System.out.println("Sayilar esit degildir");
        }

        if (str.endsWith("e")){
            // esitlik kontrolu sadece sayilar arasinda yapilir, string ile yapilmaz.
            // Eger string esitligi kontrol edilecekse == yerine
            // equals() ya da equalsIgnoreCase() kullanilir
            System.out.println("cümle e ile bitiyor");
        }
        else {
            System.out.println("cümle e ile bitmiyor");
        }

    }
}
