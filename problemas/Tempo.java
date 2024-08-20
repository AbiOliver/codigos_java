
package com.mycompany.tempo;
import java.util.Scanner;
public class Tempo {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        //entrada
        System.out.print("Segundos: ");
        int segundos = scan.nextInt();
        //passagem de parametro
        tempo(segundos);
    }
    public static  void tempo(int segundos){
        //processamento
        int horas = segundos/3600;
        segundos%=3600;
        int minutos = segundos/60;
        segundos%=60;
        //saída
        System.out.println(horas+" horas "+minutos+" minutos "+segundos+" segundos");
      
    }
    
}
