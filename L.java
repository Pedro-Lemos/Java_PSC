import javax.swing.JOptionPane;

public class L {
  public static void main(String[] args) {
    
    double anoDeNascimento = Double.parseDouble(JOptionPane.showInputDialog("Digite seu ano de nascimento"));
    double anoAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o ano atual"));

    double idade = anoAtual - anoDeNascimento;

    JOptionPane.showMessageDialog(null, "Sua idade em anos é: " + idade);
  }
}