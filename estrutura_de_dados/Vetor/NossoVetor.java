import java.util.Random;
import java.util.Scanner;

public class NossoVetor {

    private int[] dados;

    public NossoVetor(int capacidade) {
        dados = new int[capacidade];
    }

    public NossoVetor() {
        this(10);
    }

    public int[] getDados() {
        return dados;
    }

    public void setPosicao(int pos, int valor) {
        dados[pos] = valor;
    }

    public void SomaUmVetor(NossoVetor aux) {
        for (int i = 0; i < dados.length; i++) {
            this.dados[i] = this.dados[i] + aux.dados[i];
        }

    }

    public static NossoVetor SomaDoisVetores(NossoVetor vA, NossoVetor vB) {
        NossoVetor vResult = new NossoVetor(vA.dados.length);
        for (int i = 0; i < vA.dados.length; i++) {
            vResult.dados[i] = vA.dados[i] + vB.dados[i];
        }
        return vResult;
    }

    public void PreencheVetor() {
        Random r = new Random();
        for (int i = 0; i < dados.length; i++) {
            dados[i] = r.nextInt(dados.length * 10);
        }
    }

    public void leVetorDoUsuario() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Tamanho do vetor: ");
        int tamanho = scan.nextInt();
        dados = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i + 1) + "° valor do vetor: ");
            dados[i] = scan.nextInt();
        }
        scan.close();
    }

    public void bubbleSort() {
        for (int i = 1; i < dados.length; i++) {
            for (int j = 0; j < dados.length - i; j++) {
                if (dados[j] > dados[j + 1]) {
                    int aux = dados[j];
                    dados[j] = dados[j + 1];
                    dados[j + 1] = aux;
                }
            }
        }
    }

    @Override
    public String toString() {
        String s = " ";
        for (int i = 0; i < dados.length; i++) {
            s += dados[i] + " ";
        }
        return s;
    }

}