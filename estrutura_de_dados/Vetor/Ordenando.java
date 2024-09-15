
public class Ordenando {
    public static void main(String[] args) {
        NossoVetorDinamico ord1 = new NossoVetorDinamico();
        ord1.preencheVetor(1);
        System.out.println("Vetor gerado: " + ord1);
        ord1.selectionSort();
        System.out.println("Vetor ordenado selection: " + ord1);

        System.out.println("------------------------------------------------");

        NossoVetorDinamico ord2 = new NossoVetorDinamico();
        ord2.preencheVetor(1);
        System.out.println("Vetor gerado: " + ord2);
        ord2.insertionSort();
        System.out.println("vetor ordenado em insert: "+ ord2);

    }
}
