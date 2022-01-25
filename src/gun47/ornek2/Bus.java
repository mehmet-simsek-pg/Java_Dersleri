package gun47.ornek2;

class Bus extends Vehicle implements IDiesel {

    public Bus(Model model, int modelYili) {
        super(model, modelYili);
    }

    @Override
    public String drive() {
        return "Bus drive";
    }

    @Override
    public String changeDiesel() {
        return "Bus changeDiesel";
    }
}
