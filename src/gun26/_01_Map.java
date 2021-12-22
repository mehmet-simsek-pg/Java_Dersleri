package gun26;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class _01_Map {
    public static void main(String[] args) {
        HashSet<Long> tcNo = new HashSet<>();

        tcNo.add(1234567899L);
        tcNo.add(234567890L);

        System.out.println(tcNo);

        Map<String,Integer> ogrNotlar = new HashMap<>();

        // sol taraf key denir.
        // sag taraf value denir.

        ogrNotlar.put("abdullah",90);
        ogrNotlar.put("fatma",89);
        ogrNotlar.put("mehmet",67);
        ogrNotlar.put("celil",100);
        ogrNotlar.put("mehmet",99); // ilk girilen degerin yerine bunu yazar.

        // 1. yazdirma yolu
        System.out.println(ogrNotlar);
        System.out.println("ogrNotlar.get(\"abdullah\") = " + ogrNotlar.get("abdullah"));
        System.out.println("ogrNotlar.keySet() = " + ogrNotlar.keySet()); // keylerin tamamini yazar
        System.out.println("ogrNotlar.values() = " + ogrNotlar.values()); // value larin tamamini yazar

        // 2. yazdirma yolu
        for (String name:ogrNotlar.keySet()){ // keyler icin keySet()
            System.out.println("name = " + name); // tüm keyleri yazar
        }

        for (Integer not:ogrNotlar.values()){ // value lar icin values()
            System.out.println("not = " + not); // tüm valuelari yazar
        }

        for (Map.Entry<String,Integer> keyVeValues:ogrNotlar.entrySet()){ // hem key hem value lari getirir.
            System.out.println("key="+keyVeValues.getKey());
            System.out.println("value="+keyVeValues.getValue());
        }

        boolean buKeyVarMi = ogrNotlar.containsKey("ahmet");
        // containsKey() tüm keylere bakar bu veri var mi diye
        boolean buValueVarMi = ogrNotlar.containsValue(89);
        // containsValue() tüm value lara bakar bu veri var mi diye

        System.out.println("buKeyVarMi = " + buKeyVarMi);
        System.out.println("buValueVarMi = " + buValueVarMi);

        ogrNotlar.remove("mehmet");
        // mehmet keyini siler haliyle bu keyin value sunu da siler

        ogrNotlar.clear(); // bu ise tüm map i siler. Ilk tanimlanmis bos haline döner

    }
}
