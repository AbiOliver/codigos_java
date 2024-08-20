
package tamanho_letra;

import java.util.Scanner;

public class TesteStringReplace {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Seu nome: ");
        String nome = scan.next();
        String minusculo = nome.toLowerCase();
        int i = 0;
        for (i = 0; i < nome.length(); i++) {
            minusculo.charAt(i);

        }
        System.out.println("o nome " + nome.replace('l', 'm') + " tem " + i + " letras.");
    }
}
