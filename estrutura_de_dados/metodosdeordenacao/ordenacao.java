package metodosdeordenacao;

import java.util.Random;

public class ordenacao {
    int dados[];
    int capacidade;
    int ocupacao;

    public ordenacao(int capacidade) {
        this.dados = new int[capacidade];
        this.capacidade = capacidade;
        this.ocupacao = 0;
    }

    public ordenacao() {
        this(10);
    }

    public void preencheVetor(int espalhamento) {
        Random r = new Random();
        for (int i = 0; i < dados.length; i++) {
            dados[i] = r.nextInt(capacidade * espalhamento);
        }
        ocupacao = capacidade;
    }

    public void selectionSort() {
        int menor;
        for (int i = 0; i < dados.length; i++) {
            menor = i;
            for (int j = i + 1; j < dados.length; j++) {
                if (dados[i] > dados[j]) {
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
            }
            dados[j +1] = aux;
        }
    }
}
