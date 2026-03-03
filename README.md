# Proyecto: Análisis de Rendimiento de Algoritmos (Iterativo vs. Recursivo)
**Estructura de Datos | Universidad Da Vinci de Guatemala**
**Catedrático:** Ing. Brandon Chitay

---

## 👤 Información del Estudiante
* **Nombre:** María Elena García Valencia
* **Carné:** 202405749

---

## 🚀 Descripción del Proyecto
Este proyecto consiste en una herramienta de medición de rendimiento (*benchmarking*) desarrollada en Java para comparar la eficiencia de algoritmos clásicos en sus versiones iterativas y recursivas. El análisis se centra en la complejidad temporal y el comportamiento de la memoria (Stack) según la notación Big-O.

### Algoritmos Analizados:
1. **Factorial (A1):** Comparación de linealidad O(n).
2. **Fibonacci (A2):** Demostración del crecimiento exponencial O(2^n) frente al lineal O(n).
3. **Búsqueda Lineal (A3):** Análisis del peor caso en arreglos aleatorios.
4. **Ordenamiento Burbuja (A4):** Comparativa de complejidad cuadrática O(n^2).

---

## 📊 Resultados Experimentales
A continuación, se resumen los hallazgos obtenidos tras realizar 5 ejecuciones por prueba para mitigar el impacto del Garbage Collector:

| Algoritmo | Big-O Teórico | Big-O Experimental | Observación Principal |
| :--- | :--- | :--- | :--- |
| **Factorial** | O(n) | O(n) | Ambas versiones son eficientes y lineales. |
| **Fibonacci** | O(2^n) | O(2^n) | La recursión simple explota exponencialmente para n > 30. |
| **Búsqueda** | O(n) | O(n) | El tiempo escala proporcionalmente al tamaño del arreglo. |
| **Burbuja** | O(n^2) | O(n^2) | El costo aumenta drásticamente al incrementar los datos. |

---

## 📁 Estructura del Repositorio
* `src/algorithms/`: Implementaciones de los algoritmos.
* `src/benchmark/`: Lógica de medición y clase `Main`.
* `src/utils/`: Generador de datos aleatorios.
* `resultados/`: Contiene el archivo `tiempos.csv` y el Excel final con gráficas.

---

## 📺 Explicación en Video
Puedes ver la explicación detallada del código, la ejecución y el análisis de gráficas en el siguiente enlace:

👉 **[LINK A TU VIDEO DE YOUTUBE AQUÍ]**

---
© 2024 - Análisis de Algoritmos
