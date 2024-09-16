package pilhas.pilha_char_vetor;

import java.util.Scanner;

public class invertePalavra {
    public static void main(String[] args) {

        Pilha p = new Pilha();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        String inversao = " ";

        for (int i = 0; i < palavra.length(); i++) {
            p.push(palavra.charAt(i));
        }
        while (!p.estaVazia()) {
            inversao += p.peek();
            p.pop();
        }
        System.out.println(inversao);
    }
}
