package gun47.ornek2;

class ToyotaPrius extends Vehicle implements IElectric, IVehicle, IGas {

    public ToyotaPrius(Model model, int modelYili) {
        super(model, modelYili);
    }

    @Override
    public String drive() {
        return "ToyotaPrius drive";
    }

    @Override
    public String changeOil() {
        return "ToyotaPrius change oil";
    }

    @Override
    public String changeBattery() {
        return "ToyotaPrius change battery";
    }
}
