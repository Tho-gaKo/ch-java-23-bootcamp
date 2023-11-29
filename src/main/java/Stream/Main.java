package Stream;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(54);

        numList.stream().filter(n -> n% 2  == 0).map(n -> n * 2).forEach(System.out::println);



    }
}
