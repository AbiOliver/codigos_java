import java.util.Arrays;
import java.util.Scanner;

public class ParesEImpares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int v[] = new int[n];
        int menor;
        int aux;
        int par;
        int impar;

        for (int i = 0; i < v.length; i++) {
            v[i] = scan.nextInt();
        }
        /*for (int i = 0; i < v.length; i++) {
            menor = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[menor] > v[j]) {
                    menor = j;
                }
            }

            aux = v[menor];
            v[menor] = v[i];
            v[i] = aux;

        } */
        Arrays.sort(v);

        // par
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                par = v[i];
                System.out.println(par);
            }
        }

        // impar
        for (int i = n-1; i >= 0; i--) {
            if (v[i] % 2 != 0) {
                impar = v[i];
                System.out.println(impar);
            }
        }
    }
}