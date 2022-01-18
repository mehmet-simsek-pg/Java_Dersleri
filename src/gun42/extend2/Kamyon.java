package gun42.extend2;

public class Kamyon extends Arac{
    int yukKapasitesi;

    public Kamyon(Turu turu, int model, int yukKapasitesi) {
        super(turu, model);
        this.yukKapasitesi = yukKapasitesi;
    }


}
