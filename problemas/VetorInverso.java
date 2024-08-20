package com.mycompany.vetorinverso;

import java.util.Scanner;

public class VetorInverso {

     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int i = 0;
          // int total = 5;
          int numeros[] = { 1, 2, 3, 4, 5, 6 };
          /*
           * for (i = 0; i < total; i++) {
           * System.out.print("Digite o " + (i + 1) + "º numero do vetor: ");
           * numeros[i] = scan.nextInt();
           * }
           */
          for (i = numeros.length - 1; i >= 0; i--) {// invertindo
               System.out.print(numeros[i] + "|");
          }

     }
}
