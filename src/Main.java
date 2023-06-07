public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int credit_sum = 1_000_000;
        int term_1 = 12;
        int term_2 = 24;
        int term_3 = 36;
        double percent = 0.0999F;

        int pm_1 = service.calculate(credit_sum, term_1, percent);
        System.out.println("Ежемесячный платеж при сроке на 1 год составит: " + pm_1);

        int pm_2 = service.calculate(credit_sum, term_2, percent);
        System.out.println("Ежемесячный платеж при сроке на 2 года составит: " + pm_2);

        int pm_3 = service.calculate(credit_sum, term_3, percent);
        System.out.println("Ежемесячный платеж при сроке на 3 года составит: " + pm_3);

    }
}