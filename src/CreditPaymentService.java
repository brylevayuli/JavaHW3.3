public class CreditPaymentService {
    public int calculate(int creditSum, int term, double percent) {

        double r = percent / 100 / 12;
        int pm;

        pm = (int) (creditSum * (r * Math.pow((1 + r), term)) / (Math.pow((1 + r), term) - 1));
        return pm;
    }
}
