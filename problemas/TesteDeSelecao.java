package teste_de_selecao;
import java.util.Scanner;

public class TesteDeSelecao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // declarando variáveis
        int a;
        int b;
        int c;
        int d;

        // lendo os valores inteiros solicitados ao usuário
        System.out.println("Digite o 1° valor inteiro: ");
        a = scan.nextInt();
        System.out.println("Digite o 2° valor inteiro: ");
        b = scan.nextInt();
        System.out.println("Digite o 3° valor inteiro: ");
        c = scan.nextInt();
        System.out.println("Digite o 4° valor inteiro: ");
        d = scan.nextInt();

        if (((a % 2 == 0) && (c >= 0 && d >= 0) && (c + d > a + b) && (b > c && d > a))) {
			System.out.print("Valores aceitos");
		} else {
			System.out.print("Valores nao aceitos");

		}
    }

}
