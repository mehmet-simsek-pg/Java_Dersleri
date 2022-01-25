package gun47.ornek1;

public abstract class Food {
    private String name;

    public abstract void madeIn();
    public abstract void taste();

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
