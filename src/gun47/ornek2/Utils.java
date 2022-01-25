package gun47.ornek2;

class Utils {

    static void writeKnowledges(Vehicle vehicle) {
        System.out.println(vehicle.getModel());
        System.out.println(vehicle.getModelYili());

        if (vehicle instanceof TeslaCar) {
            System.out.println(((TeslaCar) vehicle).drive());
        }

        if (vehicle instanceof ToyotaPrius) {
            System.out.println(((ToyotaPrius) vehicle).drive());
        }

        if (vehicle instanceof Bus) {
            System.out.println(((Bus) vehicle).drive());
        }

    }
}
