package gun32.paket2;

public class Arac {
    String name;                // instance var
    int nesneCount = 10;
    static int count = 1;       // class var


    //static initializer, cagrilmadan otomatik calisir
    static {
        System.out.println("static initializer calisti. count = " + count);
        count++;
    }

    // instance initializer, cagrilmadan otomatik calisir
    {
        System.out.println("instance initializer calisti. nesneCount = " + nesneCount);
        nesneCount++;
    }

    // contructor ise new yapildiginda otomatik calisir
    public Arac(String name) {
        System.out.println("Constructor calisti. nesneCount = " + nesneCount);
        this.name = name;
        nesneCount++;
        System.out.println("Nesne Olustu.");
    }

    public String toString(){
        return "Name : " + name + ", nesne count : " + nesneCount;
    }

    // class"in baslamasi icin tetikleyici method
    public static void main(String[] args) {
        System.out.println("Main basladi. count = " + count);
        Arac a1 = new Arac("Audi");

        System.out.println("nesneCount = " + a1.nesneCount);
        System.out.println(a1);

        System.out.println("Main Bitti");
    }

}

/*
    main calistirildiginda
    1. static variable"lari okur
    2. static initializer calistirilir
    3. main baslatilir

    new ile nesne olusturulmadan instancelar okunmazlar
    4. instance variable"lari okur
    5. instance initializer"i calistirir
    6. Constructor"i calistirir, (yani nesne create edilir)
    7. methodlar, cagrilinca okunur

    Not :
    1. eger class icinde initializer var ise initializer icinde kullanilacak
        variablelar initializerlardan önce tanimlanmali. Aksi takdirde
        instance ve class variablelarinin tanimlanma yeri farketmez.
        Ancak prensip olarak en üstte tanimlanir
    2. Methodlarin olusturulma sirasi önemli degildir
    3. Method ici calima yukaridan baslamak üzere asagi dogru yürütülür.
        Tanimlamalarin sirasi önemlidir.
 */