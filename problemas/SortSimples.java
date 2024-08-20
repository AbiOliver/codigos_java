import java.util.Scanner;

public class SortSimples {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // declarando variaveis
        int numerosInteiros[] = new int[3];
        int valoresLidos[] = new int[3];

        // lendo os valores
        for (int i = 0; i < numerosInteiros.length; i++) {
            System.out.print("Digite o " + (i) + "° valor: ");
            numerosInteiros[i] = scan.nextInt();
            valoresLidos[i] = numerosInteiros[i];
        }

        Ordena(numerosInteiros);
        Resultado(numerosInteiros, valoresLidos);
        scan.close();
    }

    // ordenando
    public static void Ordena(int[] numerosInteiros) {
        int aux;

        for (int i = 0; i < numerosInteiros.length; i++) {
            for (int j = i + 1; j < numerosInteiros.length; j++) {
                if (numerosInteiros[i] > numerosInteiros[j]) {
                    aux = numerosInteiros[j];
                    numerosInteiros[j] = numerosInteiros[i];
                    numerosInteiros[i] = aux;
                }
            }

        }

    }

    // Resultado dos valores ordenados
    public static void Resultado(int[] numerosInteiros, int[] valoresLidos) {

        for (int i = 0; i < numerosInteiros.length; i++) {
            System.out.print(numerosInteiros[i] + "|");
        }
        
        System.out.println();
       
        for (int i = 0; i < valoresLidos.length; i++) { 
            System.out.print(valoresLidos[i] + "|");
        }
       
    }
}