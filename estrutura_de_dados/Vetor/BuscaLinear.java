import java.util.Scanner;

public class BuscaLinear {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] estado = { "BA", "CE", "RN", "MA", "SER", "AL", "PN", "PER", "PN" };

        for (int i = 0; i < estado.length; i++) {
            System.out.println(i + 1 + "-" + estado[i]);
        }

        System.out.println("Qual estado vc procura?");

        String siglaEstado = scan.nextLine();
        boolean encontrou = false;

        // busca linear
        for (int i = 0; i < estado.length; i++) {
            String sigla = estado[i];
            if (sigla.equalsIgnoreCase(siglaEstado)) {
                encontrou = true;
            }
        }
        if (encontrou) {
            System.out.println("Encontrou!");
        } else {
            System.out.println("Nao encontrou!");
        }
    }
}
