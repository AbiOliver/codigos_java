import java.util.Random;

public class NossoVetorDinamico {

    int dados[];
    int capacidade;
    int ocupacao;

    public NossoVetorDinamico(int capacidade) {
        this.dados = new int[capacidade];
        this.capacidade = capacidade;
        this.ocupacao = 0;
    }

    public NossoVetorDinamico() {
        this(10);
    }

    public boolean estaCheio() {
        return ocupacao == capacidade;
    }

    public boolean estaVazio() {
        return ocupacao == 0;
    }

    private void redimensiona(int novaCapacidade) {
        int[] temp = new int[novaCapacidade];
        for (int i = 0; i < ocupacao; i++) {
            temp[i] = dados[i];
        }
        dados = temp;
        capacidade = novaCapacidade;
    }

    public void add(int e) {
        if (estaCheio()) {
            redimensiona(capacidade * 2);
        }

        dados[ocupacao++] = e;
    }

    public int remove() {
        int e = dados[--ocupacao];
        if (capacidade >= 10 && ocupacao <= capacidade / 4) {
            redimensiona(capacidade / 2);
        }

        return e;
    }

    public void preencheVetor(int espalhamento) {
        Random r = new Random();
        for (int i = 0; i < capacidade; i++) {
            dados[i] = r.nextInt(capacidade * espalhamento);
        }
        ocupacao = capacidade;
    }

    public int buscaSimples(int x) {
        for (int i = 0; i < ocupacao; i++) {
            if (x == dados[i]) {
                return i + 1;
            }
        }
        return 0;
    }

    public int numeroOcorrencia(int x) {
        int cont = 0;
        for (int i = 0; i < ocupacao; i++) {
            if (dados[i] == x) {
                cont++;
            }
        }
        return cont;
    }

    public NossoVetorDinamico listaPosicoes(int x) {
        NossoVetorDinamico posicoes = new NossoVetorDinamico();

        for (int i = 0; i < ocupacao; i++) {
            if (dados[i] == x) {
                posicoes.add(i + 1);
            }
        }

        return posicoes;
    }

    public void bubblesort() {
        for (int i = 1; i < ocupacao; i++) {
            for (int j = 0; j < capacidade - i; j++) {
                if (dados[j] > dados[j + 1]) {
                    int aux = dados[j];
                    dados[j] = dados[j + 1];
                    dados[j + 1] = aux;
                }
            }
        }
    }

    public void selectionSort() {
        int menor;
        for (int i = 0; i < dados.length; i++) {
            menor = i;
            for (int j = i + 1; j < dados.length; j++) {
                if (dados[menor] > dados[j]) {
                    menor = j;
                }
            }
            int aux = dados[menor];
            dados[menor] = dados[i];
            dados[i] = aux;
        }
    }
    public void insertionSort(){
        int aux;
        int j;
        for (int i = 0; i < dados.length; i++) {
            aux = dados[i];
            j = i - 1;
            while (j >= 0 && dados[j] > aux) { 
                dados[j + 1] = dados[j];
                j--;
            }
            dados[j + 1] = aux;
        }
    }
    public boolean buscaBinaria(int x) {
        int ini = 0, fim = ocupacao - 1;
        while (ini <= fim) {
            int meio = (ini + fim) / 2;
            if (x == dados[meio]) {
                return true;
            }
            if (x > dados[meio]) {
                ini = meio + 1;
            } else {
                fim = meio - 1;
            }

        }
        return false;
    }

    public int remover(int x) {
        for (int i = 0; i < ocupacao; i++) {
            if (dados[i] == x) {
                int guardaValor = dados[i];
                for (int j = 0; j < ocupacao - 1; j++) {
                    dados[j] = dados[j + 1];
                }
                ocupacao--;
                return guardaValor;
            }
        }
        return -1;
    }

    public boolean removeElemento(int x) {
        for (int i = 0; i < ocupacao; i++) {
            if (dados[i] == x) {
                ocupacao--;
                return true;
            }
        }
            return false;
    }

    @Override
    public String toString() {
        String s = " ";
        for (int i = 0; i < ocupacao; i++) {
            s += dados[i] + " ";
        }
        return s;
    }
}
