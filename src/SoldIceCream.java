import java.time.LocalDateTime;
import java.util.ArrayList;

public class SoldIceCream {
    ArrayList<String> soldIceCreams = new ArrayList<String>();
    String amount = "";

    public ArrayList<String> markIceCream(String ic, int amount, LocalDateTime dateTime) {
        this.amount += amount;
        soldIceCreams.add(ic);
        soldIceCreams.add(this.amount);
        return soldIceCreams;
    }
}