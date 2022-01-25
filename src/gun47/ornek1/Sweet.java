package gun47.ornek1;

public abstract class Sweet extends Food{

    public Sweet(String name) {
        super(name);
    }

    public void taste() {
        System.out.println("Tatli");
    }
}
