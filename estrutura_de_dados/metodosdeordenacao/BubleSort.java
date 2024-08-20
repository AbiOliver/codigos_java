package metodosdeordenacao;

public class BubleSort {
    public static void main(String[] args) {
        /*int[] numerosAleatorios = new int[5];
        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = (int) (Math.random() * numerosAleatorios.length);
            System.out.print(numerosAleatorios[i] + "|");
        }*/
        int [] numerosAleatorios = {11, 13, 30, 48, 14, 22};
        int aux = 0;
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = i + 1; j < numerosAleatorios.length; j++) {
                if (numerosAleatorios[i] > numerosAleatorios[j]) {
                    aux = numerosAleatorios[j];
                    numerosAleatorios[j] = numerosAleatorios[i];
                    numerosAleatorios[i] = aux;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < numerosAleatorios.length; i++) {
            System.out.print(numerosAleatorios[i] + "|");
        }

        
    }

}
