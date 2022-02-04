package gun55.enum2;

class Book1{
    //
    public static final Book1 SEFILLER = new Book1("Sefiller", 345);
    public static final Book1 SB = new Book1("Sinekli Bakkal", 200);


    private String name;
    private int sayfaSayisi;

    Book1(String name, int sayfaSayisi) {
        this.name = name;
        this.sayfaSayisi = sayfaSayisi;
    }

    public void kitapBilgisi(){
        System.out.println(name + ", " + sayfaSayisi);
    }
}
