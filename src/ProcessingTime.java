public class ProcessingTime {
    double wait_time_in_seconds = 0;

    public String calculateTime(int amount){
        wait_time_in_seconds = (amount / 100 * 30) / 60;
        return "Час очікування на замовлення: " + wait_time_in_seconds + " хвилин";
    }
}