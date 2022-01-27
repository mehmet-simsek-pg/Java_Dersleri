package gun49.ornek2;

public class Insan {
    String isim;
    boolean ehliyet;
    Arac arac;
    String durum = "bosta";


    public Insan(String isim, boolean ehliyet) {
        this.isim = isim;
        this.ehliyet = ehliyet;
    }


    public Insan aracBin(Arac arac){
        if (arac.getSofor() == null) {
            arac.setSofor(this);
            this.arac = arac;
            System.out.println("Araca bindim");
            durum = "aracta";
        }else
            System.out.println("Aracin zaten bir soforü var");

        return this;
    }


    public Insan aracIn(){
        if (arac == null){
            System.out.println("Arabaya binmedim ki, ineyim");
        }else if(arac.isCalisiyor()){
            System.out.println("Araba calisiyor, inemem");
        }else{
            this.arac.setSofor(null);
            this.arac = null;
            this.durum = "bosta";
            System.out.println("indim");
        }
        return this;
    }

    public Insan sur(){
        if (!ehliyet){
            System.out.println("Ehliyetim yok, süremem");
        }else if (arac == null){
            System.out.println("Araca binmedim ki, süremem");
        }else {
            durum = "calisiyor";
            arac.setCalisiyor(true);
            System.out.println("Calisiyorum");
        }
        return this;
    }

    public Insan dur(){
        if (arac.isCalisiyor()) {
            System.out.println("durdum");
            arac.setCalisiyor(false);
            durum = "durdu";
        }else if (arac == null)
            System.out.println("Zaten arac kullanmiyorum");
        else if (!arac.isCalisiyor())
            System.out.println("Arac calismiyor ki");
        return this;
    }



    @Override
    public String toString() {
        return "Insan{" +
                "isim='" + isim + '\'' +
                ", ehliyet=" + ehliyet +
                ", durum='" + durum + '\'' +
                '}';
    }


}
