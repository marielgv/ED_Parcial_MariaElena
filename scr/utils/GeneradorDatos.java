package scr.utils;
import java.util.Random;

public class GeneradorDatos {
    public static int[] generarArregloAleatorio(int n) {
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(10000); // Números aleatorios entre 0 y 9999
        }
        return arr;
    }
}