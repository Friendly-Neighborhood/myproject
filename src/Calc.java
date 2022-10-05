import java.time.LocalDateTime;

public class Calc {
    String receipt;

    public String makePayment(int payment, IceCreamList icl, PriceList prl, String shopInfo){
        receipt = "Внесена сума: " + payment + "\n" + "До оплати: " + (Integer.valueOf(prl.getPrice("Рудь")) * icl.amount/100) + "\nДата й час оплати: " + LocalDateTime.now() + "\n" + "Адреса здійснення оплати: " + shopInfo;
        return receipt;
    }
}