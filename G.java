import javax.swing.JOptionPane;

public class G {
  public static void main(String[] Args) {
    String perimeterStr = JOptionPane.showInputDialog("Digite o perímetro do círculo: ");

    double perimetro = Double.parseDouble(perimeterStr);

    double raio = perimetro / (2 * Math.PI);
    double area = Math.PI * raio * raio;

    JOptionPane.showMessageDialog(null, "A área do círculo é: " + area);

    JOptionPane.showMessageDialog(null, "O raio do círculo é: " + raio);
  }
}