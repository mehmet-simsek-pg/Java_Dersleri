package gun30Ment.gun303;

import java.util.ArrayList;

public class Insan {
    static int a;
    String name;
    int age;
    Insan bestFriend;
    ArrayList<Insan> friends;


    public void tanimla(String name, int age) {
        this.name = name;
        this.age = age;
        bestFriend = new Insan();
        friends = new ArrayList<>();

    }

    public void setBestFriend(Insan bestFriend) {
        this.bestFriend = bestFriend;

    }

    public void setFriend(Insan friend){
        friends.add(friend);
    }

    public void writeFriends(){
        for (Insan friend : friends) {
            System.out.println(friend.name + ", " + friend.age);
        }
    }

    public static void main(String[] args) {
        Insan i1 = new Insan();
        i1.tanimla("Ali", 20);
        Insan i2 = new Insan();
        i2.tanimla("Veli", 21);
        Insan i3 = new Insan();
        i3.tanimla("Hasan", 20);
        Insan i4 = new Insan();
        i4.tanimla("Hüseyin", 22);


        i1.setBestFriend(i2);
        i2.setBestFriend(i1);
        i1.setFriend(i2);
        i1.setFriend(i3);
        i3.setBestFriend(i4);

        System.out.println(i1.name);
        System.out.println(i1.bestFriend.name);
        //i1.friends.forEach(a -> System.out.println(a.name + ", " + a.age));
        i1.writeFriends();
        System.out.println(i2.name);
        System.out.println(i2.bestFriend.bestFriend.name);
        System.out.println(i1.friends.get(1).bestFriend.name);

    }


}
