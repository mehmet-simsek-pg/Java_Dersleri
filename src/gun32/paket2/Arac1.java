package gun32.paket2;

public class Arac1 {
    String name;
    int nesneCount = 10;
    static int count = 1;

    static {
        System.out.println("static initializer calisti. count = " + count);
        count++;
    }

    {
        System.out.println("instance initializer calisti. nesneCount = " + nesneCount);
        nesneCount++;
    }


    public Arac1(String name) {
        System.out.println("Constructor calisti. nesneCount = " + nesneCount);
        this.name = name;
        nesneCount++;
    }

}
