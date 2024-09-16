package pilhas.pilha_char_vetor;

import java.util.Scanner;

public class Parenteses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a expressão: ");
        String expressao = scanner.nextLine();

        Pilha p = new Pilha(expressao.length());

        boolean estaCerta = true;
        int i = 0;

        while (i < expressao.length() && estaCerta) {
            char letra = expressao.charAt(i++);
            if (letra == '(') {
                p.push(letra);
            } else {
                if (p.estaVazia()) {
                    estaCerta = false;
                } else {
                    p.pop();
                }
            }
        }
        if (estaCerta && p.estaVazia()) {
            System.out.println("expressao correta");
        } else {
            System.out.println("expressao incorreta");
        }
    }
}
