package metodos_de_ordenacao;

public class SelectionSort {

    public static void main(String[] args) {

        int[] numeros = { 14, 48, 22, 0, 11, 13, 30 };

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "|");
           
        }

        // ordenando
        int menor, aux;
        for (int i = 0; i < numeros.length; i++) {
            menor = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[menor] > numeros[j]) {
                    menor = j;
                }
            }
            aux = numeros[menor];
            numeros[menor] = numeros[i];
            numeros[i] = aux;
        }

        // Ordenado
        System.out.println("");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "|");
        }
    }

}
