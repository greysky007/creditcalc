public class CreditPaymentService {
    public double calculate(int a, int b, double c, int y) {
        //double k = Math.pow((1.0+(c/100)), 1.0/12.0);
        //double result = (b*(Math.pow(k, 12.0*y))*(k-1))/((Math.pow(k, 12.0*y))-1);
        double k = c / 12 / 100;
        double result = ((k * (Math.pow(1 + k, a))) / (Math.pow(1 + k, a) - 1)) * b;
        return result;
    }
}
