package scr.benchmark;

public class Medidor {
    // Registra el tiempo en nanosegundos y retorna milisegundos
    public static double calcularPromedio(Runnable algoritmo) {
        long sumaNanos = 0;
        int repeticiones = 5; // Regla obligatoria [cite: 62]

        for (int i = 0; i < repeticiones; i++) {
            long inicio = System.nanoTime();
            algoritmo.run();
            long fin = System.nanoTime();
            sumaNanos += (fin - inicio);
        }

        double promedioNanos = (double) sumaNanos / repeticiones;
        return promedioNanos / 1_000_000.0; // Conversión a ms [cite: 61]
    }
}