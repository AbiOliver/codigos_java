import java.util.Scanner;

public class Aposta {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Entrada */
        System.out.print("Investimento do 1º apostador: ");// 1ª aposta.
        double investimento1 = scan.nextDouble();
        System.out.print("Investimento do 2º apostador: ");// 2ª aposta.
        double investimento2 = scan.nextDouble();
        System.out.print("Investimento do 3º apostador: ");// 3ª aposta.
        double investimento3 = scan.nextDouble();
        System.out.print("Prêmio: ");// prêmio da loteria.
        double premio = scan.nextDouble();

        /* Processamento */
        double totalAposta = investimento1 + investimento2 + investimento3;// Somatória das apostas em conjunto.
        double apostador1 = investimento1 / totalAposta;// porcentagem do 1ª investimento sobre o total.
        double apostador2 = investimento2 / totalAposta;// porcentagem do 2ª investimento sobre o total.
        double apostador3 = investimento3 / totalAposta;// porcentagem do 3ª investimento sobre o total.

        double recebe1 = premio * apostador1;// Cálculo do valor a receber multiplicando o premio pela procentagem do 1ª
                                             // investimento.
        double recebe2 = premio * apostador2;// Cálculo do valor a receber multiplicando o premio pela procentagem do 2ª
                                             // investimento.
        double recebe3 = premio * apostador3;// Cálculo do valor a receber multiplicando o premio pela procentagem do 3ª
                                             // investimento.

        /* Saída */
        System.out.println("-------------------------------------");
        System.out.format("O 1ª apostador receberá %.1f reais\n", recebe1);// Prêmio recebido pelo 1º apostador.
        System.out.format("O 2ª apostador receberá %.2f reais\n", recebe2);// Prêmio recebido pelo 1º apostador.
        System.out.format("O 3ª apostador receberá %.2f reais\n", recebe3);// Prêmio recebido pelo 1º apostador.
        System.out.println("-------------------------------------");

        scan.close();
    }
}
