public class PriceList {
    Object[][] prices = {{"Рудь", 80}, {"Ласунка", 70}, {"Три Ведмеді", 70}, {"Біла Береза", 60}, {"Ласка", 80}}; // {назва_морозива, ціна_за_100_грам}

    public String getPrice(String ic){
        for (int i = 0; i < prices.length; i++) {
            if (ic == prices[i][0]) {
                return "Ціна за 100 грам: " + (int)prices[i][1] + " грн";
            }
        }
        return "Немає ціни!";
    }

    public PriceList getPriceList(){
        return this;
    }
}