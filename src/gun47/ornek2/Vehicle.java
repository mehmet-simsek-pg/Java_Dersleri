package gun47.ornek2;

class Vehicle {
    private Model model;
    private int modelYili;

    public Vehicle(Model model, int modelYili) {
        this.model = model;
        this.modelYili = modelYili;
    }


    public Model getModel() {
        return model;
    }

    public int getModelYili() {
        return modelYili;
    }
}
