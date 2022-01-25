package gun47.ornek1;

public class Baklava extends Sweet{

    public Baklava(String name) {
        super(name);
    }

    @Override
    public void madeIn() {
        System.out.println("Turkey");
    }


}
