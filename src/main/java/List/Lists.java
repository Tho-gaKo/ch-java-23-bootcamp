package List;

import java.util.HashMap;
import java.util.Map;


public class Lists {
    public static void main(String[] args) {
        Map<String, String> favouriteSubject = new HashMap<>();

        favouriteSubject.put("Timeon", "Math");

        favouriteSubject.put("Timio", "Meth");

        favouriteSubject.remove("Timeon");

        System.out.println(favouriteSubject);
    }
}
