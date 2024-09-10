package lista_ligada;

public class Programa {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.adicionar("ba");
        lista.adicionar("pn");
        lista.adicionar("ce");
        lista.adicionar("rn");
        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("Ultimo: " + lista.getUltimo().getValor());

        lista.remover("ba");
        lista.remover("pn");
        lista.remover("ce");
        lista.remover("rn");

        
     
    
       lista.adicionar("SP");
       System.out.println("tamanho: "+ lista.getTamanho());
        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.pegaPosicao(i).getValor());
        }
    }
}
