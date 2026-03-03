package scr.algorithms;

public class Factorial {
    // A1 - Iterativo: O(n)
    public static long calcularIterativo(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // A1 - Recursivo: O(n) 
    public static long calcularRecursivo(int n) {
        if (n <= 1) return 1; // Caso base: 0! = 1 
        return n * calcularRecursivo(n - 1);
    }
}