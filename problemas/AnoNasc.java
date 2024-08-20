import javax.swing.JOptionPane;

public class AnoNasc {

    public static void main(String[] args) {

        /* Entrada */
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));// solicitação da idade.
        int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual"));// Solicitação do ano atual.

        /* Processamento */
        int nasc = anoAtual - idade;// Cálculo para saber ano de nascimento

        /* Saída */
        JOptionPane.showMessageDialog(null, "Você nasceu em " + nasc);// Exibição do ano de nascimento
    }
}
