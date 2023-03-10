import javax.swing.JOptionPane;

public class I {
  public static void main(String[] args) {
    String idadeStr = JOptionPane.showInputDialog("Digite sua idade: ");
    String anoAtualStr = JOptionPane.showInputDialog("Digite o ano atual: ");


    double idade = Double.parseDouble(idadeStr);
    double anoAtual = Double.parseDouble(anoAtualStr);

    double anoNovo = 2100 - anoAtual;
    double idadeNova = idade + anoNovo;

    JOptionPane.showMessageDialog(null, "Você terá " + idadeNova + " anos na virada do século em 2100");
  }
}