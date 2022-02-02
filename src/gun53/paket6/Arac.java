package gun53.paket6;

import java.util.ArrayList;

public class Arac {
    String isim;
    int yolcuKapasitesi;
    ArrayList<Insan> yolcular = new ArrayList<>();
    int mevcutYolcu;
    //Insan[] yolcularArray;

    public Arac(String isim, int yolcuKapasitesi) {
        this.isim = isim;
        this.yolcuKapasitesi = yolcuKapasitesi;
        //yolcularArray = new Insan[yolcuKapasitesi];
    }

    public void yolcuBindir(Insan yolcu){
        if (mevcutYolcu < yolcuKapasitesi ) {
            yolcular.add(yolcu);
            mevcutYolcu++;
            System.out.println(yolcu.isim + " bindi");
        } else
            System.out.println("Aracta yer yok");

    }

    public void yolcuIndir(Insan yolcu){
        if (yolcular.contains(yolcu)){
            yolcular.remove(yolcu);
            mevcutYolcu--;
            System.out.println(yolcu.isim + " indi");
        }else{
            System.out.println(yolcu.isim + " isminde bir yolcu yok");
        }
    }

    public void yolcuListesi(){
        System.out.println("Yolcu Listesi");
        int i=1;
        for (Insan yolcu : yolcular) {
            System.out.println(i++ + ". yolcu : " + yolcu);
        }
    }

    @Override
    public String toString() {
        String str = yolcuKapasitesi + " yolcu kapasiteli, " +
                isim + " isimli aracin yolcu Listesidir\n";
        int i=1;
        for (Insan yolcu : yolcular) {
            str += i++ + ". yolcu : " + yolcu + "\n";
        }
        return str;
    }
}
