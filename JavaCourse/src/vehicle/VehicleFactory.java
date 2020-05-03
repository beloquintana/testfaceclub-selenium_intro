package vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleFactory {
    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<Vehicle>();
        list.add(new Car("Auto VW",100,8,"MX25"));
        list.add(new Car("Auto Lada",50,5,"LADA589"));
        list.add(new Bicycle("Bicicleta Deportiva",30,1));
        list.add(new Car("Auto Chevrolet",89,8,"CH12UX3"));

        for (int i=0;i<list.size();i++){
            System.out.println("Descripcion: " + list.get(i).getDescription());
            System.out.println("Potencia : " + list.get(i).calculatePower());
        }
    }
}
