public class ExponencialFibonacci {

    static int iteracao = 0;

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci de " + n + " é: " + calcularFibonacci(n));
    }

    public static int calcularFibonacci(int n) {
        iteracao++;
        if (n <= 1) {
            return n;
        }
        System.out.println("Iteração: " + iteracao++);
        return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    }

}
