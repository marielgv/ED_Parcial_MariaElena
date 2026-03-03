package scr.algorithms;

public class Fibonacci {
    // A2 - Iterativo: O(n)
    public static long calcularIterativo(int n) {
        if (n <= 1) return n;
        long a = 0, b = 1, auxiliar;
        for (int i = 2; i <= n; i++) {
            auxiliar = a + b;
            a = b;
            b = auxiliar;
        }
        return b;
    }

    // A2 - Recursivo: O(2^n) 
    // Advertencia: n > 30 causará lentitud notable [cite: 65]
    public static long calcularRecursivo(int n) {
        if (n <= 1) return n;
        return calcularRecursivo(n - 1) + calcularRecursivo(n - 2);
    }
}
