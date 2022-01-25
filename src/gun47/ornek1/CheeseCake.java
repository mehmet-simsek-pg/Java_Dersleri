package gun47.ornek1;

public class CheeseCake extends Sweet{

    public CheeseCake(String name) {
        super(name);
    }

    @Override
    public void madeIn() {
        System.out.println("US");
    }
}
