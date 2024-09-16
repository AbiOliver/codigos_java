package pilhas.pilha_char_vetor;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {

        Pilha p = new Pilha();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        String inversao = "";
        for (int i = 0; i < palavra.length(); i++) {
            p.push(palavra.charAt(i));
        }

        for (int i = 0; i < palavra.length(); i++) {
            inversao += p.pop();
        }
        System.out.println("inversao: "+inversao);

        if(palavra.equalsIgnoreCase(inversao)){
            System.out.println("E palindromo");
        }else{
            System.out.println("Nao e palindromo");
        }

    }
}
