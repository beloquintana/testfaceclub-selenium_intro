package avg.grade.calculator;

import java.util.ArrayList;
import java.util.List;

public class AVGCalculator {
    public static void main(String arg[]){
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(5);
        list.add(1);

        int sum = 0;
        for(int i=0;i<list.size();i++){
            sum = sum + list.get(i);
        }

        int average = sum / list.size();
        System.out.println("El promedio de notas es de: " + average);
    }
}
