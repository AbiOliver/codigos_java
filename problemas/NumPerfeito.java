package com.mycompany.numperfeito;

import java.util.Scanner;

public class NumPerfeito {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int numero = scan.nextInt();
		int soma = 0;
		int metade = numero / 2;
		int divisor = 1;

		while (divisor <= metade) {
			if (numero % divisor == 0) {
				soma = soma + divisor;
			}
			divisor++;
		}
		if (soma == numero) {
			System.out.print("perfeito");
		} else {
			System.out.print("Não é perfeito.");
		}
		scan.close();

	}

}
