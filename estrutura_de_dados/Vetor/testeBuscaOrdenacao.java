import java.util.Scanner;
 
public class testeBuscaOrdenacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        NossoVetorDinamico v = new NossoVetorDinamico(100);
        v.preencheVetor(1);
        System.out.println("Vetor gerado: " + v);
 
        System.out.println("Digite um valor para a busca: ");
        int x = scan.nextInt();
        int posicao = v.buscaSimples(x);
 
        if (posicao > 0) {
            System.out.println("A primeira ocorrencia de "+ x + " foi na posicao "+ posicao);
 
            System.out.println(x +" encontrado "+ v.numeroOcorrencia(x) +" vez(es).");
            System.out.println("As posicoes são "+v.listaPosicoes(x));
        } else {
            System.out.println(x + "posicao não encontrada");
        }
 
        //-------------------------------------------------------------------------------
 
        v.bubblesort();
        System.out.println("Vetor ordenado: " + v);
       
        if(v.buscaBinaria(x)){
            System.out.println("busca binaria achou "+ x);
        }else{
            System.out.println("busca binaria não achou "+x);
        }
 
        scan.close();
    }
}
 