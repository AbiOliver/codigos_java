
import java.util.Scanner;

public class multiplicaImpares {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // entrada
        System.out.println("Digite o menor numero: ");
        int numero1 = scan.nextInt();
        System.out.println("Digite o maior numero:");
        int numero2 = scan.nextInt();
        int somaPares = 0;
        int multiplicaImpares = 1;
        // processamento
        for (int i = numero1; i <= numero2; i++) {// o valor de i recebe o numero1, verificará se os valores dos
                                                  // intervalos dos numeros digitados são pares ou impares e irão
                                                  // efetuar o cálculo pedido para cada condição.
            if (i % 2 == 0) {
                somaPares += i;
            } else if (i % 2 != 0) {
                multiplicaImpares *= i;
            }
        }
        // saída
        System.out.println("A soma dos números pares no intervalo de " + numero1 + " e " + numero2 + " é " + somaPares
                + "\nE a multiplicação dos impares é " + multiplicaImpares);
        scan.close();
    }
}
