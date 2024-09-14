package pilhas.pilha_char_vetor;

public class pilha {
    private char[] dados;
    private int topo;
    private int capacidade;

    public pilha(int capacidade) {
        dados = new char[capacidade];
        topo = 0;
        this.capacidade = capacidade;
    }

    public pilha() {
        this(10);
    }

    public boolean estaVazia() {
        return topo == 0;
    }

    public boolean estaCheia() {
        return topo == capacidade;
    }

    public int tamanho() {
        return topo;
    }

    public void push(char i) {
        dados[topo++] = i;
    }

    public char pop() {
        return dados[--topo];
    }

    public char peek() {
        return dados[topo - 1];
    }

    @Override
    public String toString() {
        String s = "";
        if (estaCheia()) {
            for (int i = topo - 1; i >= 0; i--) {
                s += dados[i] + "\n";
            }
        } else {
            s += " pilha vazia";
        }
        return s + "";
    }

}
