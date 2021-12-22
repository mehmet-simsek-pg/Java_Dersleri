package gun27.task1;

public class Otomobil {

    String renk;
    double motorHacmi;
    int kacKapi;
    int modelYili;
    String marka;

    public void arabaMarkaVeModel(String marka,int modelYili){
        System.out.println("arabanin markasi "+marka+" "+"arabanin model yili "+modelYili);
    }
    public void markaModelVeRenk(String marka, int modelYili, String renk){
        System.out.println("arabanin markasi "+marka+" "+"arabanin model yili "+modelYili+" "+"rengi "+renk);
    }

}
