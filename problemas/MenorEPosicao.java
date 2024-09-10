import java.util.Scanner;

public class MenorEPosicao {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x[] = new int[n];
        int menor = 0;
        int pos = 0;

        for (int i = 0; i < x.length; i++) {
            x[i] = scan.nextInt();

            if (i == 0) {
                menor = x[i];
                pos = i;
            } else if (x[i] < menor) {
                menor = x[i];
                pos = i;
            }
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: "+ pos);

    }
}
