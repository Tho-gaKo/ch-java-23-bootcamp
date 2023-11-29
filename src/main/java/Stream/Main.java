package Stream;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numList = new ArrayList<>();
        for (int i =0; i <= 9; i++){
            numList.add((int)(Math.random()*1000 +1));
        }

        numList.stream()
                .filter(n -> n% 2  == 0)
                .map(n -> n * 2)
                .sorted()
                .forEach(System.out::println);

        int sum = numList.stream()
                .filter(n -> n% 2  == 0)
                .map(n -> n * 2)
                .sorted()
                .reduce(0,Integer::sum);

        System.out.print("sum : "+sum);
        System.out.println("");

        List<Integer> newNum;
        newNum = new ArrayList<>(numList);

        newNum.stream()
                .filter(n -> n%2 == 0)
                .map(n -> n*2)
                .sorted()
                .forEach(System.out::println);



    }
}
