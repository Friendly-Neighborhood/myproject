import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {
    String ic;
    int amount;
    String phoneNumber;
    double payment;
    int result;

    public Order(){
        this.ic = "";
        this.amount = 0;
        this.payment = 0.0;
        this.phoneNumber = "";
        this.result = 0;
    }

    public String isIceCream(IceCreamList icl, String ic){
        result = icl.isIceCream(ic);
        switch (result){
            case -2:
                return "ic пусте";
            case -1:
                return "Список пустий";
            case 0:
                return "Морозиво знайдено";
            default:
                return "Морозива не знайдено";
        }
    }

    public IceCreamList getIceCream(IceCreamList icl){
        return icl.getIceCream();
    }

    public boolean isAmount(IceCreamList icl, int amount){
        return icl.isAmount(amount);
    }

    public IceCreamList getAmount(IceCreamList icl){
        return icl.getAmount();
    }

    public boolean isDiscountCard(DiscountCardList dcl, String phoneNumber){
        return dcl.isDiscountCard(phoneNumber);
    }

    public DiscountCardList getDiscountCard(DiscountCardList dcl){
        return dcl.getDiscountCard();
    }

    public int getPrice(PriceList prl, String ic){
        return Integer.valueOf(prl.getPrice(ic));
    }

    public PriceList getPriceList(PriceList prl){
        return prl.getPriceList();
    }

    public String calculateTime(ProcessingTime pt, IceCreamList icl){
        return pt.calculateTime(icl.amount);
    }

    public String makePayment(Calc calc, int payment, IceCreamList icl, PriceList prl, Shop shop){
        return calc.makePayment(payment, icl, prl, shop.getInfo());
    }

    public ArrayList<String> markIceCream(SoldIceCream sold, IceCreamList icl){
        return sold.markIceCream(icl.ic, icl.amount, LocalDateTime.now());
    }
}