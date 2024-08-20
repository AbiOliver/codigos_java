package com.mycompany.vogais;

import java.util.Scanner;

public class Vogais {

    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        // entrada
        System.out.print("Digite uma frase: ");
        String frase = scan.nextLine();
        String minusculas = frase.toLowerCase();
        // processamento
        int i = 0, conta = 0;
        while (i < minusculas.length()) {
            if (minusculas.charAt(i) == 'a' || minusculas.charAt(i) == 'e' || minusculas.charAt(i) == 'i'
                    || minusculas.charAt(i) == 'o' || minusculas.charAt(i) == 'u') {
                conta = conta + 1;
            }
            i += 1;
        }
        System.out.println("Esta frase possui " + conta + " vogais ");

        int vogal1 = 0;
        int vogal2 = 0;
        int vogal3 = 0;
        int vogal4 = 0;
        int vogal5 = 0;

        for (i = 0; i < minusculas.length(); i++) {
            if (minusculas.charAt(i) == 'a') {

                vogal1 = vogal1 + 1;

            }
            if (minusculas.charAt(i) == 'e') {
                vogal2 = vogal2 + 1;

            }
            if (minusculas.charAt(i) == 'i') {
                vogal3 = vogal3 + 1;

            }
            if (minusculas.charAt(i) == 'o') {
                vogal4 = vogal4 + 1;

            }
            if (minusculas.charAt(i) == 'u') {
                vogal5 = vogal5 + 1;

            }
        }
        char c = ' ';
        int espaco = 0;
        for (int j = 0; j < frase.length(); j++) {
            if (frase.charAt(j) == ' ') {
                espaco = espaco + 1;
                c = frase.charAt(0);
            }
        }

        /* Saída */
        // vogais
        System.out.println("a: ".toUpperCase() + vogal1);
        System.out.println("e: ".toUpperCase() + vogal2);
        System.out.println("i: ".toUpperCase() + vogal3);
        System.out.println("o: ".toUpperCase() + vogal4);
        System.out.println("u: ".toUpperCase() + vogal5);
        
        // quantidade de espacos
        System.out.println("A frase foi espaçada " + espaco + " vezes");
        System.out.println("Primeira letra: "+c);
        scan.close();
    }
}
