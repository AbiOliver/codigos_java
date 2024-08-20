package com.mycompany.vetormultiplicado;

import java.util.Scanner;

public class VetorMultiplicado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero[] = new int[5];
        System.out.println("digite o valor a ser multiplicado: ");
        int multi = scan.nextInt();
        for (int i = 0; i < 5; i++) {
            System.out.print("digite 5 valores: ");
            numero[i] = scan.nextInt();
        }
        int res = 0;
        for (int i = 0; i < 5; i++) {
            res = multi * numero[i];
            System.out.println(numero[i] + " x " + multi + "  = " + res);
        }
    }
}
