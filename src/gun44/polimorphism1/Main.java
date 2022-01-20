package gun44.polimorphism1;

public class Main {

    public static void main(String[] args) {
        Calisan calisan = new Calisan("Ali", 1000);
        Ogrenci ogrenci = new Ogrenci("Veli", "Istanbul");

        ogrenciBilgisiYaz(ogrenci);
        calisanBilgisiYaz(calisan);


        // polimorphism
        Insan calisan1 = new Calisan("Ali1", 2000);
        Insan ogrenci1 = new Ogrenci("Veli1", "Ankara");

        insanBilgisiYaz(calisan);
        insanBilgisiYaz(calisan1);
        insanBilgisiYaz(ogrenci1);

    }

    public static void insanBilgisiYaz(Insan insan){
        System.out.println(insan);
    }

    public static void ogrenciBilgisiYaz(Ogrenci ogrenci){
        System.out.println(ogrenci);
    }

    public static void calisanBilgisiYaz(Calisan ogrenci){
        System.out.println(ogrenci);
    }

}
