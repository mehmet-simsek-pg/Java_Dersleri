package gun50.proje6.data;

import java.util.LinkedHashMap;

public class StudentData {
    /*
        Bu class'i değiştirmeyin
        Bu map te
        Key  username'dir
        Value  password'dur
        username ve password olup olmadığını kontrol ederken,
        AddUserNameAndPassword yöntemini kullanın
    */

    private LinkedHashMap<String, String> UsernameAndPassword = new LinkedHashMap<>();

    public StudentData() {
        AddUserNameAndPassword();
    }

    public LinkedHashMap<String, String> AddUserNameAndPassword() {
        UsernameAndPassword.put("Emily", "EM12.");
        UsernameAndPassword.put("Adam", "AdamApple12");
        UsernameAndPassword.put("Lallana", "MidCentral");
        UsernameAndPassword.put("Origiii", "CornerTakenQuickly");
        UsernameAndPassword.put("Gerard", "Captain2005");
        UsernameAndPassword.put("Mo Salah", "KingMo11");
        UsernameAndPassword.put("VanDijk", "Defend04");
        UsernameAndPassword.put("Handerson", "Champ2019");
        UsernameAndPassword.put("Mane", "No10");
        UsernameAndPassword.put("Allison", "GoldGloveNo1");

        return UsernameAndPassword;
    }

}
