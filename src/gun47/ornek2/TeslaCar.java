package gun47.ornek2;

class TeslaCar extends Vehicle implements IElectric {

    public TeslaCar(Model model, int modelYili) {
        super(model, modelYili);
    }

    @Override
    public String drive() {
        return "Teslacar drive";
    }

    @Override
    public String changeBattery() {
        return "TeslaCar change battery";
    }
}
