import javax.swing.JOptionPane;
public class H {
  public static void main(String[] args) {
    String litrosAtualStr = JOptionPane.showInputDialog("Digite quantos litros você colocou de gasolina: ");
     String kmRodadoStr = JOptionPane.showInputDialog("Digite o quanto você andou em Km: ");

    double kmRodado = Double.parseDouble(kmRodadoStr);
    double litrosAtual = Double.parseDouble(litrosAtualStr);

    double gasto = kmRodado / litrosAtual; 

    JOptionPane.showMessageDialog(null, "Você gastou " + gasto + " litros de gasolina por Km");
    
  }
}