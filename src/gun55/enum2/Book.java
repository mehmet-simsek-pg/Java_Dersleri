package gun55.enum2;

public enum Book {
    // SEFILLER Book class"indan olusturulmus public static final nesnedir
    SEFILLER("Sefiller", 345),
    SB("Sinekli Bakkal", 200),
    ;

    private String name;
    private int sayfaSayisi;

    Book(String name, int sayfaSayisi) {
        this.name = name;
        this.sayfaSayisi = sayfaSayisi;
    }

    public void kitapBilgisi(){
        System.out.println(name + ", " + sayfaSayisi);
    }




}
