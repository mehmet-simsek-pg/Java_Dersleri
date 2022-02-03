package gun54.paket3;

public class Motor extends Makine{
    String isim;
    int gucu;

    public Motor(String tur, String isim, int gucu) {
        super(tur);
        this.isim = isim;
        this.gucu = gucu;
    }

    public Motor(String tur, int yapimYili, String isim, int gucu) {
        super(tur, yapimYili);
        this.isim = isim;
        this.gucu = gucu;
    }

    @Override
    public void calis(){
        System.out.println("Motor calisiyor");
    }

    @Override
    public String toString() {
        return "Motor{" +
                "isim='" + isim + '\'' +
                ", gucu=" + gucu +
                '}';
    }
}
