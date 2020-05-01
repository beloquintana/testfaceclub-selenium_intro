package less.and.greater;

import java.util.ArrayList;
import java.util.List;

public class LessAndGreaterCalculator {
    static List<Integer> list = new ArrayList<Integer>();

    public static void main(String arg[]){
        list.add(10);
        list.add(5);
        list.add(520);
        list.add(8);
        list.add(-8);
        list.add(521);

        System.out.println("El mayor numero es: " + calculateGraterNumber());
        System.out.println("El menor numero es: " + calculateSmallestNumber());
    }

    public static int calculateSmallestNumber(){
        int smallestNumber = list.get(0);
        for(int i=1;i<list.size();i++){
            if(smallestNumber > list.get(i))
                smallestNumber = list.get(i);
        }
        return smallestNumber;
    }

    public static int calculateGraterNumber(){
        int greaterNumber = list.get(0);
        for(int i=1;i<list.size();i++){
            if(greaterNumber < list.get(i))
                greaterNumber = list.get(i);
        }
        return  greaterNumber;
    }
}
