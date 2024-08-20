package palavra;
import java.util.Scanner;


public class JogoPalavra {
    public static void main(String[] args) throws Exception {
             
   Scanner scan = new Scanner(System.in);
     int i =0;
   try{
            System.out.print("\nEscreva uma palavra contendo as mesmas letras da |A|I|B|C|M|U| ".toLowerCase());
            String minusculo = scan.nextLine();
        for ( i = 0; i <minusculo.length(); i++) {
            if(minusculo.charAt(i)!='a'&& minusculo.charAt(i)!='i'&& minusculo.charAt(i)!='b' && minusculo.charAt(i)!='c'&& minusculo.charAt(i)!='m'&& minusculo.charAt(i)!='u'){
                   throw new Npalavra(minusculo);
            }
        }
        System.out.println("mostra: "+minusculo);
   }catch(Exception e){
       System.out.println("Entrada errada!");
   }
 }
}
    

