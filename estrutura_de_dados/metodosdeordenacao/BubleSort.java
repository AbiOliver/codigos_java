package metodosdeordenacao;

public class BubleSort {
    public static void main(String[] args) {
        /*
         * int[] numerosAleatorios = new int[5];
         * for (int i = 0; i < numerosAleatorios.length; i++) {
         * numerosAleatorios[i] = (int) (Math.random() * numerosAleatorios.length);
         * System.out.print(numerosAleatorios[i] + "|");
         * }
         */
        int[] numerosAleatorios = { 3, 2, 30, 48, 114, 111 };
        for (int i = 1; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios.length - i; j++) {
                if (numerosAleatorios[j] > numerosAleatorios[j + 1]) {
                    int aux = numerosAleatorios[j];
                    numerosAleatorios[j] = numerosAleatorios[j + 1];
                    numerosAleatorios[j + 1] = aux;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < numerosAleatorios.length; i++) {
            System.out.print(numerosAleatorios[i] + "|");
        }

    }

}
