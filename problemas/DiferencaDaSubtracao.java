package com.mycompany.lista2ex6;

import java.util.Scanner;
public class DiferencaDaSubtracao {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      /*Entrada*/
      System.out.print("Digite um valor inteiro: ");//Solicitação do 1º valor inteiro.
      int valor1 = scan.nextInt();
      System.out.print("Digite outro valor inteiro: ");//Solicitação do 2º valor inteiro.
      int valor2 = scan.nextInt();
      
      /*Processamento*/
      if(valor1>valor2){//Condição proposta para determinar se o valor1 é maior que o valor2.
          int diferenca = valor1-valor2;//cálculo da diferença entre eles.
          
          /*Saída1*/
          System.out.println(valor1+" é o maior número");//Exibição do maior valor
          System.out.println("Diferença existente é de "+diferenca+" número");//Exibição da diferença entre eles.
          
      }else if(valor1<valor2){//Condição proposta para determinar se o valor2 é maior que o valor1.
          
          int diferenca = valor2-valor1;//cálculo da diferença entre eles.
          
          /*Saída2*/
          System.out.println(valor2+" é o maior número");//Exibição do maior valor
          System.out.println("Diferença existente é de "+diferenca+" número");//Exibição da diferença entre eles.
          
      }else{//Condição, caso não exista o valor maior.
          
          /*Saída3*/
          System.out.println("O número "+valor1+" e o número "+valor2+" são iguais!");//Exibição, caso os valores sejam iguais.
      }
      
      scan.close();
    }
}
