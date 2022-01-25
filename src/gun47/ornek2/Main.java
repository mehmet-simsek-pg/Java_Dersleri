package gun47.ornek2;

import gun47.ornek1.Baklava;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vehicle teslaCar = new TeslaCar(Model.TESLA101, 2020);
        Vehicle toyotaPrius = new ToyotaPrius(Model.TOYOTAPRIUS30, 2019);
        Vehicle bus = new Bus(Model.BUS403, 2010);


        Utils.writeKnowledges(teslaCar);
        Utils.writeKnowledges(toyotaPrius);
        Utils.writeKnowledges(bus);

        ArrayList<Vehicle> list = new ArrayList<>(List.of(teslaCar, toyotaPrius, bus));
        list.forEach(v-> System.out.println(v.getClass().getFields().length));

    }
}



