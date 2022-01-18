package gun42.extend1;

public class Kedi extends Hayvan{
    String evi;
    boolean asiVarmi;

    public void miyavla(){
        System.out.println("miyavladim");
    }

    @Override
    public void yemekYe() {
        //  super   ->  Hayvan
        //  this    ->  Kedi
        super.yemekYe();    // super ile Parant/Super class"a ait field ve methodlara ulasilir
                            // this  ile bu nesneye ait field ve methodlara ulasilir
        System.out.println("Kedi yemek yedi");
    }
}
 /*
    child/subclass

  */
