package scr.algorithms;

public class OrdenamientoBurbuja {
    // A4 - Iterativo: O(n^2)
    public static void ordenarIterativo(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambio (swap)
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // A4 - Recursivo: O(n^2) 
    public static void ordenarRecursivo(int[] arr, int n) {
        if (n == 1) return; // Caso base

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        // Llamada para el resto del arreglo
        ordenarRecursivo(arr, n - 1);
    }
}