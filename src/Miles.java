public class Miles {
    public static void main(String[] args) {
        int ticketPrice = 10_686; // стоимость билета
        int numberOfRublasForOneMiles = 20; // колличество рублей для одной бонусной мили

        System.out.println((ticketPrice / numberOfRublasForOneMiles) + " Количество милей");
    }
}
