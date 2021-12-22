package gun26;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _04_Map {
    public static void main(String[] args) {
        // Kullanıcıya
        // 1-Ekleme
        // 2-Listeleme
        // 3-Arama
        // 4-Düzeltme
        // 5-Çıkış
        // Seçeneklerini vererek username (key),password, userType (Müdür, çalışan)
        // dan oluşan bir Map tanımlayınız.
        // Kullanıcının seçimine göre Her bir işlemi ayrı metodda yaptırınız.
        // Mainde sadece Seçenekler ve metodların çağrılması olsun.

        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        Map<String,Map<String,String>> users = new HashMap<>();

        int islem ;
        do {
            menu();
            System.out.println("islem girin");
            islem = scanner.nextInt();
            switch (islem){
                case 1: ekleme(users); break;
                case 2: listeleme(users); break;
                case 3:
                    System.out.println("username girin");
                    String username = sc.nextLine();
                    arama(users,username); break;
                case 4:
                    System.out.println("username girin");
                    username = sc.nextLine();
                    duzeltme(users,username); break;
            }

        }while (islem<5);

    }
    public static void duzeltme(Map<String,Map<String,String>> users, String username){
        Scanner girdi = new Scanner(System.in);
        Map<String,String> map = new HashMap<>();

        System.out.println("yeni pass girin");
        String pass = girdi.nextLine();

        System.out.println("yeni rol");
        String rol = girdi.nextLine();

        map.put(pass,rol);

        users.put(username,map);

    }
    public static void arama(Map<String,Map<String,String>> users, String username){
        System.out.println(users.get(username));
    }
    public static void listeleme(Map<String,Map<String,String>> users){
        for (Map.Entry<String,Map<String,String>> mapEntry:users.entrySet()){
            System.out.println(mapEntry.getKey()+" "+mapEntry.getValue());
        }
    }

    public static void ekleme(Map<String,Map<String,String>> users) {
        Scanner sc = new Scanner(System.in);
        Map<String,String> user = new HashMap<>();

        System.out.println("username girin");
        String name = sc.nextLine();

        System.out.println("password girin");
        String password = sc.nextLine();

        System.out.println("user type girin");
        String userType = sc.nextLine();

        user.put(password,userType);

        users.put(name,user);

    }

    public static void menu(){
        System.out.println("1-Ekleme");
        System.out.println("2-Listeleme");
        System.out.println("3-Arama");
        System.out.println("4-Düzeltme");
        System.out.println("5-Çıkış");
    }
}
