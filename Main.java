public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        // Пример 1: Кредит на 1 год
        double monthlyPayment1 = service.calculate(1_000_000, 9.99, 12);
        System.out.println("Ежемесячный платёж (1 год): " + Math.round(monthlyPayment1));

        // Пример 2: Кредит на 2 года
        double monthlyPayment2 = service.calculate(1_000_000, 9.99, 24);
        System.out.println("Ежемесячный платёж (2 года): " + Math.round(monthlyPayment2));

        // Пример 3: Кредит на 3 года
        double monthlyPayment3 = service.calculate(1_000_000, 9.99, 36);
        System.out.println("Ежемесячный платёж (3 года): " + Math.round(monthlyPayment3));
    }
}
