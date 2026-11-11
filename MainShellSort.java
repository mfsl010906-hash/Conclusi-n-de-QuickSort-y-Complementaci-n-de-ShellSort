public class MainShellSort {
    public static void main(String[] args) {
        int[] arreglo = {6, 1, 5, 8, 3, 2, 7, 4};

        System.out.println("Arreglo original (ShellSort):");
        ShellSort.imprimirArreglo(arreglo);

        ShellSort.ordenar(arreglo);

        System.out.println("Arreglo ordenado con ShellSort:");
        ShellSort.imprimirArreglo(arreglo);
    }
}