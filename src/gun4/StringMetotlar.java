package gun4;

public class StringMetotlar {
    public static void main(String[] args) {

        String name = "Mehmet";
        char ilkHarf = name.charAt(0);
        //System.out.println(ilkHarf);

        //Isminizin ikinci harfini yazdirin.
        char ikinciHarf = name.charAt(1);
        //System.out.println("ikinciHarf = " + ikinciHarf);

        // Isminizin ilk harfi ile son harfi ayni mi?

        char ilk = name.charAt(0);
        char son = name.charAt(5);
        boolean esitMi = ilk==son;
        boolean esitDegilMi = ilk!=son;
        String mesaj = "Ilk harf ve son harf esit mi?";
        //System.out.println(mesaj+" "+esitMi);

        char mesajChar = mesaj.charAt(3);
        char bosluk = ' ';

        //System.out.println(mesajChar==bosluk);

        String cümle = "Java ögreniyorum";
        String cumleKisim = cümle.substring(0,4);
        //System.out.println("cumleKisim = " + cumleKisim);
        
        // "Bugün hava kapali semsiye almam lazim"
        // cümlesindeki lazim kismini ekrana yazdirin.

        String cumle2 = "Bugün hava kapali semsiye almam lazim";
        String sonuc = cumle2.substring(32,37);
       // System.out.println("sonuc = " + sonuc);

        // Yukaridaki cumleyi su sekilde yazdiriniz:
        // Semsiye almam lazim, bugün hava kapali

        String ilkKisim =cumle2.substring(18);
        String ikinciKisim = cumle2.substring(0,17);
       // System.out.println(ilkKisim+", "+ikinciKisim);

        String schoolName = "Dortmund Technic";
        // okul isminin 2 ve 3. harflerini yazdirin.

       // System.out.println(schoolName.charAt(1)+" "+schoolName.charAt(2));

       // int cümleUzunluk = schoolName.length();
       // System.out.println("cümleUzunluk = " + cümleUzunluk);

        //schoolName icerisindeki c yi length() metodunu kullanarak yazdirin.
        char c = schoolName.charAt(schoolName.length()-1);
        System.out.println("c = " + c);

        //Isminizin son harfini yazdirin.
        String surName = "Mehmet";
        char sonHarf = surName.charAt(surName.length()-1);
        System.out.println("sonHarf = " + sonHarf);










    }
}
