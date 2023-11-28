package Vererbung.wiederholungInterfVererbMain;

import javax.print.attribute.standard.Destination;
import java.math.BigDecimal;

public class main extends Travel{


    public static void main(String[] args) {
        InternationalTravel tripToRedSea = new InternationalTravel();
        tripToRedSea.Price();

        Destiniation home = new Destiniation("Basel", new BigDecimal("0.6"), "Switzerland");

        String country = home.country();
        System.out.println(country);

        BigDecimal x = new BigDecimal(("0.1"));
        System.out.println(new BigDecimal("0.1").add(new BigDecimal("0.6")));
    }
}
