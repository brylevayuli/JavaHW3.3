public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int creditSum = 1_000_000;
        int term1 = 12;
        int term2 = 24;
        int term3 = 36;
        double percent = 0.0999F;

        int pm1 = service.calculate(creditSum, term1, percent);
        System.out.println("Ежемесячный платеж при сроке на 1 год составит: " + pm1);

        int pm2 = service.calculate(creditSum, term2, percent);
        System.out.println("Ежемесячный платеж при сроке на 2 года составит: " + pm2);

        int pm3 = service.calculate(creditSum, term3, percent);
        System.out.println("Ежемесячный платеж при сроке на 3 года составит: " + pm3);

    }
}