package gun50.proje6Solutions.data;

import java.util.LinkedHashMap;

public class StudentData {
    /*
       Dont change this class

       In this map
       Key is the username
       Value is the password

       While checking user name and password  exist or not ,use AddUserNameAndPassword method

    */


    /*
       Bu sınıfı değiştirmeyin

       Bu map te
       Key  username'dir
       Value  password'dur

       While checking username and password  exist or not ,use AddUserNameAndPassword method
       username ve paswword olup olmadığını kontrol ederken, AddUserNameAndPassword yöntemini kullanın

    */

    private LinkedHashMap<String ,String> UsernameAndPassword = new LinkedHashMap<>();

    public StudentData(){
        AddUserNameAndPassword();
    }

    public LinkedHashMap<String,String > AddUserNameAndPassword(){
        UsernameAndPassword.put("Emily","EM12.");
        UsernameAndPassword.put("Adam","AdamApple12");
        UsernameAndPassword.put("Lallana","MidCentral");
        UsernameAndPassword.put("Origiii","CornerTakenQuickly");
        UsernameAndPassword.put("Gerard","Captain2005");
        UsernameAndPassword.put("Mo Salah","KingMo11");
        UsernameAndPassword.put("VanDijk","Defend04");
        UsernameAndPassword.put("Handerson","Champ2019");
        UsernameAndPassword.put("Mane","No10");
        UsernameAndPassword.put("Allison","GoldGloveNo1");

        return UsernameAndPassword;
    }
/*
    public static void main(String[] args) {
        LinkedHashMap<String ,String> up = new LinkedHashMap<>();

        StudentData studentData = new StudentData();

        up = studentData.AddUserNameAndPassword();
        for(Map.Entry entry : up.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());
        if (up.get("Mane").equalsIgnoreCase("No10"))
            System.out.println(true);
        else
            System.out.println(false);
    }

 */
}
