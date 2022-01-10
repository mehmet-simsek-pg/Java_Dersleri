package gun34.odev1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Insan {
    String adi;
    int ayakkabiNo;
    Ayakkabi ayakkabi = null;
    boolean disarida = false;

    public Insan(String adi, int ayakkabiNo) {
        this.adi = adi;
        this.ayakkabiNo = ayakkabiNo;

    }

    public void ayakkabiGiy(Ayakkabi pabuc){

        if (ayakkabi != null) {
            System.out.println("Zaten ayakkabim var");
        }else if(pabuc.numara != ayakkabiNo && pabuc.mevsim != Main.suAnkiMevsim ){
            System.out.println("Ne numara, ne de mevsim uygun degil");
        }else if (pabuc.numara != ayakkabiNo){
            System.out.println("Bu ayakkabi numarasi bana uygun degil");
        }else if (pabuc.mevsim != Main.suAnkiMevsim){
            System.out.println("Bu ayakkabi bu mevsime uygun degil");
        }else{
            ayakkabi = pabuc;
            System.out.println("ayakkabi giydim");
        }

    }

    public void ayakkabiCikar(){
        if (ayakkabi == null) {
            System.out.println("Zaten Ayakkabim  yok, ne cikarayim");
        }else if (disarida){
            System.out.println("Disaridayim, cikaramam");
        }else{
            System.out.println("Tamam, ayakkabimi cikardim");
            ayakkabi = null;
        }
    }

    public void birazGez(){
        if (ayakkabi == null){
            System.out.println("Ayakkabim yok, gezemem");
        }else if (disarida){
            System.out.println("Zaten geziyorum");
        }else{
            System.out.println("Tamam, biraz gezeyim");
            disarida = true;
        }
    }

    public void eveGel(){
        if (disarida){
            System.out.println("Tamam, eve geldim");
            disarida = false;
        }else{
            System.out.println("Zaten evdeyim");
        }
    }



    @Override
    public String toString() {
        return "Insan{" +
                "adi='" + adi + '\'' +
                ", ayakkabiNo=" + ayakkabiNo +
                ", ayakkabi=" + ayakkabi +
                '}';
    }




}
