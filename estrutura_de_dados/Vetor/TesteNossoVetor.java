
// na aplicação, que lê uma array comum,
// aí vc cria na classe um método que recebe esse vetor
// e passa para o seu atributo, assim, fica independente da origem

public class TesteNossoVetor {
    public static void main(String[] args) {

        NossoVetor v = new NossoVetor();
        v.leVetorDoUsuario();
        System.out.println(v);
        v.bubbleSort();
        System.out.println(v);
    }
}
