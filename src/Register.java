import java.util.ArrayList;

public class Register {
    Order o;
    IceCreamList icl;
    DiscountCardList dcl;
    PriceList prl;
    Calc calc;
    Shop shop;
    SoldIceCream sold;
    ProcessingTime pt;

    public Register(IceCreamList icl, DiscountCardList dcl, PriceList prl, Calc calc, Shop shop, SoldIceCream sold, ProcessingTime pt){
        this.icl = icl;
        this.dcl = dcl;
        this.prl = prl;
        this.calc = calc;
        this.shop = shop;
        this.sold = sold;
        this.pt = pt;
    }

    public Register(){
        this.icl = new IceCreamList();
        this.dcl = new DiscountCardList();
        this.prl = new PriceList();
        this.calc = new Calc();
        this.shop = new Shop();
        this.sold = new SoldIceCream();
        this.pt = new ProcessingTime();
    }

    public void newOrder(){
        o = new Order();
    }

    public String isIceCream(String ic){
        return o.isIceCream(icl, ic);
    }

    public IceCreamList getIceCream(IceCreamList icl){
        return o.getIceCream(icl);
    }

    public boolean isAmount(int amount){
        return o.isAmount(icl, amount);
    }

    public IceCreamList getAmount(IceCreamList icl){
        return o.getAmount(icl);
    }

    public boolean isDiscountCard(String phoneNumber){
        return o.isDiscountCard(dcl, phoneNumber);
    }

    public DiscountCardList getDiscountCard(DiscountCardList dcl){
        return o.getDiscountCard(dcl);
    }

    public int getPrice(String ic){
        return o.getPrice(prl, ic);
    }

    public PriceList getPriceList(PriceList prl){
        return o.getPriceList(prl);
    }

    public String calculateTime(){
        return o.calculateTime(pt, icl);
    }

    public String makePayment(int payment){
        return o.makePayment(calc, payment, icl, prl, shop);
    }

    public ArrayList<String> markIceCream(){
        return o.markIceCream(sold, icl);
    }
}