import java.util.Random;

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
        int i = 0;
        this.dados[i] = this.dados[i] + aux.dados[i];
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

}