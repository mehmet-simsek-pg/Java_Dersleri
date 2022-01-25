package gun47.ornek1;

public class Main {

    public static void main(String[] args) {

        Food baklava = new Baklava("Baklava");
        Food cheeseCake = new CheeseCake("CheeseCake");
        Food greekSalad = new GreekSalad("GreekSalad");
        Food sezarSalad = new SezarSalad("SezarSalad");

        bilgiYaz(baklava);
        bilgiYaz(cheeseCake);
        bilgiYaz(greekSalad);
        bilgiYaz(sezarSalad);

        baklavaBilgiYaz((Baklava) baklava);

    }

    public static void baklavaBilgiYaz(Baklava baklava){
        System.out.println(baklava.getName());
    }


    public static void bilgiYaz(Food food){
        System.out.println(food.getName());
        food.taste();
        food.madeIn();

        // Parent ismi ile gelen nesnelerin hangi class"in nesnesi oldugunu anlamak icin
        // instanceof (nesnesi) kullanilir
        System.out.println(food instanceof Sweet);
        System.out.println(food instanceof Baklava);
        System.out.println("------------------");
        if (food instanceof Baklava)
            System.out.println( ( (Baklava) food ).getName());

    }

}

