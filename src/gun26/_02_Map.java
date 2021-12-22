package gun26;

import java.util.HashMap;
import java.util.Map;

public class _02_Map {
    public static void main(String[] args) {

        Map<String,String> bilgiler1 = new HashMap<>();
        bilgiler1.put("email","mehmet@gmail.com");
        bilgiler1.put("tel","+903212234");
        bilgiler1.put("adres","köln");
        bilgiler1.put("cinsiyet","erkek");

        Map<String,String> bilgiler2 = new HashMap<>();
        bilgiler2.put("email","abdullah@gmail.com");
        bilgiler2.put("tel","+903212234");
        bilgiler2.put("adres","ankara");
        bilgiler2.put("cinsiyet","erkek");


        Map<String,Map<String,String>> kisiBilgileri = new HashMap<>();

        // String tanimlamamizin sebebi örnekten dolayi
        // burada yazilanlarin hepsi Integer icinde gecerli

        kisiBilgileri.put("mehmet",bilgiler1); // mehmet key, bilgiler1 mapi value oldu
        kisiBilgileri.put("abdullah",bilgiler2);

        System.out.println(kisiBilgileri);
        System.out.println(kisiBilgileri.get("mehmet"));
        System.out.println(kisiBilgileri.get("mehmet").get("email"));
        System.out.println(kisiBilgileri.get("abdullah"));
        System.out.println(kisiBilgileri.get("abdullah").get("adres"));

    }
}