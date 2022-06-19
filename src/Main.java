public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int years = 1;
        int months = years * 12;
        int sum = 1_000_000;
        double percent = 9.99;
        double payment = service.calculate(months, sum, percent, years);
        System.out.println("Ежемесячный платеж: " + payment);

        years = 2;
        months = years * 12;
        sum = 1_000_000;
        percent = 9.99;
        payment = service.calculate(months, sum, percent, years);
        System.out.println("Ежемесячный платеж: " + payment);

        years = 3;
        months = years * 12;
        sum = 1_000_000;
        percent = 9.99;
        payment = service.calculate(months, sum, percent, years);
        System.out.println("Ежемесячный платеж: " + payment);
    }
}
