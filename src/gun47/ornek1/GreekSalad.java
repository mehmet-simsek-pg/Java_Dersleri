package gun47.ornek1;

public class GreekSalad extends Salad{

    public GreekSalad(String name) {
        super(name);
    }

    @Override
    public void madeIn() {
        System.out.println("Yunan salatasi");
    }
}
