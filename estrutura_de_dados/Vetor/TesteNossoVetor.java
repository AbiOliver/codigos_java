public class TesteNossoVetor {
    public static void main(String[] args) {
        NossoVetor v1 = new NossoVetor();
        NossoVetor v2 = new NossoVetor();

        System.out.println(v1.getDados()[5]);
        NossoVetor v3 = v1;

        v1 = new NossoVetor();
        v2 = new NossoVetor();

        v1.SomaUmVetor(v2);

        v1.setPosicao(1,2 );
        v2.setPosicao(1,2);
        v3 = NossoVetor.SomaDoisVetores(v1, v2);
   
    }
}
