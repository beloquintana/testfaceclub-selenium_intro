package car;

import java.util.ArrayList;
import java.util.List;

public class CarBrands {
    public static void main(String arg[]){
        List<String> list = new ArrayList<String>();
        list.add("BMW");
        list.add("VW");
        list.add("Chevrolet");
        list.add("Lada");

        System.out.println("Marcas de autos en venta:");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
