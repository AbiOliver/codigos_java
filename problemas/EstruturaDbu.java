package EstruturaDbu;

import java.util.Scanner;

public class EstruturaDbu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int numero = scan.nextInt();

        int d = numero / 10;
        int u = numero % 10;

        if (numero >= 10 && numero <= 30) {
            System.out.println("Dezena: " + d);
            System.out.println("Unidade: " + u);
            System.out.println("numero: " + d + 0 + u);
        }
        if (numero >= 31 && numero <= 61) {
            System.out.println("Dezena: " + d);
            System.out.println("Unidade: " + u);
            System.out.println("numero: " + d + 1 + u);
        }
        if (numero >= 62 && numero <= 99) {
            System.out.println("Dezena: " + d);
            System.out.println("Unidade: " + u);
            System.out.println("numero: " + d + 2 + u);
        } else if (numero < 10 || numero > 99) {
            System.out.println("Numero fora da faixa!: " + numero);
        }
        scan.close();
    }
}
