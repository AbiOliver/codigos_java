import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int proximo, anterior = 0, atual = 1;

        for (int i = 0; i <= n; i++) {
            if (n == i) {
                System.out.println(anterior);
            } else {
                System.out.println(anterior + " ");
                proximo = anterior + atual;
                anterior = atual;
                atual = proximo;
            }
        }
    }
}
