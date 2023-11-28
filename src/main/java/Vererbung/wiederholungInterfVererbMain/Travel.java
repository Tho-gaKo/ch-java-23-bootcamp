package Vererbung.wiederholungInterfVererbMain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Travel implements HasPrice{
    @Override
    public void Price() {
        int price = 10;
        System.out.println(price);
    }
}
