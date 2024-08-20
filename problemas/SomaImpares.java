
package com.mycompany.vetorsoma;

import java.util.Scanner;

public class VetorSoma {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeros[] = new int[5];
        int i = 0, soma = 0;
        for (i = 0; i < 5; i++) {
            System.out.print("digite 5 numeros: ");
            numeros[i] = scan.nextInt();
        }
        for (i = 0; i < 5; i++) {
            if (numeros[i] % 2 == 1) {
                soma = soma + numeros[i];
            }
        }
        System.out.println("Os números impares somados equivalem a " + soma);
    }
}
