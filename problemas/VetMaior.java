package com.mycompany.vetmaior;

import java.util.Scanner;
public class VetMaior {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x[] = new int[5];
        int pos = 0;
        int maior = 0;
        for (int i = 0; i < x.length; i++) {
            x[i] = scan.nextInt();
            if(maior<x[i]){
                maior = x[i];
                pos = i;
            }else{
                maior = maior;
                pos = pos;
            }
        }
        for (int i = 0; i < 5; i++) {
            
            System.out.println("X["+i+"] = "+x[i]);
            
        }
        System.out.println("Maior: "+ maior +"posicao: ["+ pos +"]");
        scan.close();
    }
}
