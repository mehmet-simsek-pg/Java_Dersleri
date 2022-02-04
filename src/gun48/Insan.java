package gun48;

import java.util.ArrayList;

public class Insan {
    String isim;
    ArrayList<Insan> arkadaslar = new ArrayList<>();
    //boolean sohbetEtmiyor = true;
    Insan muhabbetArkadasi;

    public Insan(String isim, Insan...insanlar) {
        this.isim = isim;
        for (Insan insan : insanlar) {
            arkadasEkle(insan);
        }
    }

    public void arkadasEkle(Insan insan){
        if (!this.arkadaslar.contains(insan)) {
            this.arkadaslar.add(insan);
            insan.arkadasEkle(this);
        }
    }


    public void sohbetEt(Insan insan){
        //if (!sohbetEtmiyor) {
        if (muhabbetArkadasi != null){
            System.out.println("Zaten sohbet ediyorum");
        }else{
            if (arkadaslar.contains(insan)){
                System.out.println("Tamam sohbete basladik");
                //sohbetEtmiyor = !sohbetEtmiyor;
                //insan.sohbetEtmiyor = sohbetEtmiyor;
                muhabbetArkadasi = insan;
                insan.muhabbetArkadasi = this;
            }else {
                System.out.println("Arkadasim degil ki");
            }
        }
    }

    public void sohbetiKes(){
        if (muhabbetArkadasi != null){
            System.out.println("Tamam kesiyorum");
            muhabbetArkadasi.muhabbetArkadasi = null;
            muhabbetArkadasi = null;
        }else
            System.out.println("Zaten kimseyle konusmuyorum ki");
    }

    public void neYapiyorsun(){
        //if (sohbetEtmiyor)
        if (muhabbetArkadasi == null)
            System.out.println("Sessizim");
        else
            System.out.println(muhabbetArkadasi.isim + " ile Sohbet ediyorum");
    }


    @Override
    public String toString() {
        String arkadasStr="";
        for (Insan insan : arkadaslar) {
            arkadasStr += insan.isim + ", ";
        }
        arkadasStr = arkadasStr.substring(0, arkadasStr.length()-3);
        return "Insan{" +
                "isim='" + isim + '\'' +
                ", arkadaslari='" + arkadasStr + '\'' +
                '}';
    }
}
