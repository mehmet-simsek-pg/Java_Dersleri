package gun34.odev2;

public class Grup {
    Isci isci1;
    Isci isci2;

    public Grup(Isci isci1, Isci isci2) {
        this.isci1 = isci1;
        this.isci2 = isci2;
        isci1.grupArkadasi.grupArkadasi = null;
        isci1.grupArkadasi = isci2;
        isci2.grupArkadasi = isci1;
    }

    @Override
    public String toString() {
        return "Grup{" +
                "isci1=" + isci1.adi +
                ", isci2=" + isci2.adi +
                '}';
    }
}
