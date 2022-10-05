public class DiscountCardList {
    Object[][] discountCards = {{"0673423414", 172}, {"0932458949", 299}, {"0969435689", 32}, {"0504354298", 215}, {"0934512395", 122}}; // {номер_телефону, кількість_бонусів}

    public boolean isDiscountCard(String phoneNumber){
        for (int i = 0; i < discountCards.length; i++) {
            if (phoneNumber == discountCards[i][0]){
                return true;
            }
        }
        return false;
    }

    public DiscountCardList getDiscountCard(){
        return this;
    }
}