package gun46.deneme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashMap<Ogrenci, String> map = new HashMap<>();

        ArrayList<Ogrenci> list = new ArrayList<>();
        Ogrenci o1 = new Ogrenci("A", 18);
        Ogrenci o2 = new Ogrenci("AA", 18);
        Ogrenci o3 = new Ogrenci("AAA", 18);
        Ogrenci o4 = new Ogrenci("B", 18);
        Ogrenci o5 = new Ogrenci("BB", 18);

        o1.addArkadas(o2);
        o2.addArkadas(o1);

        list.add(o1);
        list.add(o2);
        list.add(o3);
        list.add(o4);
        list.add(o5);


        for (Ogrenci ogrenci : list) {
            System.out.println(ogrenci + ", " + ogrenci.arkadaslar);
        }

        o2.addArkadas(o5);
        list.get(1).addArkadas(o5);

        System.out.println(o2);           //o2 = list.get(1)
        System.out.println(list.get(1));

    }



}


class Ogrenci{
    String name;
    int yas;
    HashSet<Ogrenci> arkadaslar = new HashSet<>();

    public Ogrenci(String name, int yas){
        this.name = name;
        this.yas = yas;
    }

    public void addArkadas(Ogrenci ogrenci){
        arkadaslar.add(ogrenci);
    }

    @Override
    public String toString() {
        String alar ="";
        for (Ogrenci arkadas : arkadaslar) {
            alar += "Adi : " + arkadas.name + ", yas : " + arkadas.yas;
        }
        return "Ogrenci{" +
                "name='" + name + '\'' +
                ", yas=" + yas +
                ", arkadaslar=" + arkadaslar +
                '}';
    }
}
