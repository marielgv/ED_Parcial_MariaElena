package scr.benchmark;

import scr.algorithms.*;
import scr.utils.GeneradorDatos;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Configurar punto decimal para que Excel lo reconozca fácilmente
        Locale.setDefault(Locale.US);

        System.out.println("------ INICIO DE PRUEBAS DE RENDIMIENTO ------");
        System.out.println("Algoritmo,Version,n,Tiempo_ms");

        // 1. Tamaños para Factorial y Fibonacci (n = 5 a 30)
        int[] nPequeños = {5, 10, 15, 20, 25, 30};

        for (int n : nPequeños) {
            // Factorial (Limitado a n=20 para evitar desbordamiento de long)
            if (n <= 20) {
                double tFactIter = Medidor.calcularPromedio(() -> Factorial.calcularIterativo(n));
                double tFactRec = Medidor.calcularPromedio(() -> Factorial.calcularRecursivo(n));
                System.out.printf("Factorial,Iterativo,%d,%.6f\n", n, tFactIter);
                System.out.printf("Factorial,Recursivo,%d,%.6f\n", n, tFactRec);
            }

            // Fibonacci
            double tFibIter = Medidor.calcularPromedio(() -> Fibonacci.calcularIterativo(n));
            double tFibRec = Medidor.calcularPromedio(() -> Fibonacci.calcularRecursivo(n));
            System.out.printf("Fibonacci,Iterativo,%d,%.6f\n", n, tFibIter);
            System.out.printf("Fibonacci,Recursivo,%d,%.6f\n", n, tFibRec);
        }

        // 2. Tamaños para Búsqueda y Burbuja (n = 100 a 10,000)
        int[] nGrandes = {100, 500, 1000, 5000, 10000};

        for (int n : nGrandes) {
            int[] arreglo = GeneradorDatos.generarArregloAleatorio(n);
            int objetivo = -1; // Buscamos un valor que probablemente no esté para medir el peor caso O(n)

            // Búsqueda Lineal
            double tBusIter = Medidor.calcularPromedio(() -> BusquedaLineal.buscarIterativo(arreglo, objetivo));
            double tBusRec = Medidor.calcularPromedio(() -> BusquedaLineal.buscarRecursivo(arreglo, objetivo, 0));
            System.out.printf("Busqueda Lineal,Iterativo,%d,%.6f\n", n, tBusIter);
            System.out.printf("Busqueda Lineal,Recursivo,%d,%.6f\n", n, tBusRec);

            // Ordenamiento Burbuja
            // Clonamos el arreglo para que cada repetición del medidor use un arreglo desordenado
            double tBurbIter = Medidor.calcularPromedio(() -> {
                int[] copia = arreglo.clone();
                OrdenamientoBurbuja.ordenarIterativo(copia);
            });
            
            // Nota: Burbuja recursivo con n=10,000 puede dar StackOverflowError dependiendo de la memoria asignada
            double tBurbRec = Medidor.calcularPromedio(() -> {
                int[] copia = arreglo.clone();
                OrdenamientoBurbuja.ordenarRecursivo(copia, copia.length);
            });
            
            System.out.printf("Burbuja,Iterativo,%d,%.6f\n", n, tBurbIter);
            System.out.printf("Burbuja,Recursivo,%d,%.6f\n", n, tBurbRec);
        }

        System.out.println("------ PRUEBAS FINALIZADAS ------");
    }
}
