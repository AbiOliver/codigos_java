package metodosdeordenacao;

public class InsertSort {
    public static void main(String[] args) {
        int[] numeros = { 13, 1, 2, 10, 40 };
        int aux, j;
        for (int i = 1; i < numeros.length; i++) {
            aux = numeros[i];
            j = i - 1;
            while (j >= 0 && numeros[j] > aux) {
                numeros[j + 1] = numeros[j];
                j--;
            }
            numeros[j + 1] = aux;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "|");
        }
    }
}
