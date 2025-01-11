public class CreditPaymentService {

    // Метод для расчета ежемесячного платежа
    public double calculate(double loanAmount, double annualRate, int months) {
        double monthlyRate = annualRate / 12 / 100; // Ежемесячная процентная ставка
        return loanAmount * (monthlyRate * Math.pow(1 + monthlyRate, months)) /
                (Math.pow(1 + monthlyRate, months) - 1);
    }
}
