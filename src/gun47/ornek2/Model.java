package gun47.ornek2;

enum Model {
    TESLA101("Tesla Car", 0.0, "High technology model"),
    TOYOTAPRIUS30("Toyota Prius", 3.0, "Hybrit auto"),
    BUS403("Bus 403", 5.0, "Transporter Luxury Bus");
    private String name;
    private double engine;
    private String explanation;

    Model(String name, double engine, String explanation) {
        this.name = name;
        this.engine = engine;
        this.explanation = explanation;
    }

    public String getName() {
        return name;
    }

    public double getEngine() {
        return engine;
    }

    public String getExplanation() {
        return explanation;
    }
}
