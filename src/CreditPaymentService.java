public class CreditPaymentService {
    public int calculate (int credit_sum, int term, double percent){

        double r = percent / 100 / 12;
        int pm;

        pm = (int) (credit_sum * (r * Math.pow((1 + r), term)) / (Math.pow((1 + r), term) - 1));
        return pm;
    }
}
