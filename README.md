# Conclusi-n-de-QuickSort-y-Complementaci-n-de-ShellSort
- tarea 2 unidad 5 estructura de datos
- instituto tecnologico superior de xalapa
- ingeneria en sistemas computacionales
- docente: Victor Hugo Vasquez Harrera
- alumna: Maria Fatima Sanchez Landa

## Requerimientos del Entorno
- **Lenguaje:** Java SE 8 o superior (JDK 17 recomendado).
- **IDE Sugerido:** NetBeans, Eclipse, IntelliJ IDEA o VS Code.

## Descripción del Proyecto
1. Clase QuickSort: Utiliza la estrategia de "Divide y Vencerás", seleccionando un pivote y particionando el arreglo de manera recursiva. 
2. Main Quick: Clase principal de ejecución. Llama al método de ordenamiento Quicksort (desde el índice 0 hasta arreglo.length - 1
3. clase ShellSort: Es una optimización del ordenamiento por inserción directa que permite comparar e intercambiar elementos separados por intervalos (gaps) mayores a uno, reduciéndolos progresivamente.
4. Main ShellSort: Proporciona un punto de ejecución independiente para probar, validar y visualizar en la consola el funcionamiento del algoritmo ShellSort.

Ambos algoritmos representan enfoques algorítmicos avanzados que superan las limitaciones de los métodos elementales de ordenamiento cuadrático (tales como Burbuja, Selección o Inserción simple), los cuales resultan imprácticos al procesar arreglos de gran escala debido a su complejidad temporal de orden O(n2 ). 


## Instrucciones de Ejecución
1. Clonar el repositorio:
   ```bash
   git clone [https://github.com/mfsl010906-hash/Conclusi-n-de-QuickSort-y-Complementaci-n-de-ShellSort.git]
   cd Conclusi-n-de-QuickSort-y-Complementaci-n-de-ShellSort
   ```

2. Compilar el código:
   ```bash
   javac -d bin src/AjusteDeFunciones/*.java
   ```

3. Ejecutar las clases principales:
   ```bash
   java -cp bin MainQuick.Main
   ```
   ```bash
   java -cp bin MainShellSort.Main
   ```


---

## Salida de Consola
**Quicksort:**
- Arreglo original:
- [6, 1, 5, 8, 3, 2, 7, 4]
- Arreglo ordenado con Quicksort:
- [1, 2, 3, 4, 5, 6, 7, 8]

- Process finished with exit code 0

**ShellSort:** 
- Arreglo original (ShellSort):
-[6, 1, 5, 8, 3, 2, 7, 4]
- Arreglo ordenado con ShellSort:
- [1, 2, 3, 4, 5, 6, 7, 8]

- Process finished with exit code 0

## conclucion
Al compilar y ejecutar cualquiera de las dos implementaciones con el arreglo de prueba propuesto, la salida obtenida en consola es correcta y validada.
Ambas técnicas son fundamentales para optimizar el rendimiento en estructuras de datos dentro de los sistemas computacionales.


