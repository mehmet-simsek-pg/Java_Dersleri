package gun49.ornek2;

public class Arac {
    private String isim;
    private Insan sofor;
    private boolean calisiyor = false;

    public Arac(String isim) {
        this.isim = isim;
    }


    public void setSofor(Insan sofor) {
        this.sofor = sofor;
    }

    public Insan getSofor() {
        return sofor;
    }

    public boolean isCalisiyor() {
        return calisiyor;
    }

    public void setCalisiyor(boolean calisiyor) {
        this.calisiyor = calisiyor;
    }

    @Override
    public String toString() {
        return "IsMakinesi{" +
                "isim='" + isim + '\'' +
                ", sofor=" + sofor +
                ", calisiyor=" + calisiyor +
                '}';
    }

}
