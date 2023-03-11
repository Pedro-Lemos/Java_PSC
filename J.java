import javax.swing.JOptionPane;

public class I {
  public static void main(String[] args){
    int p1, p2, media;
    
    p1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a primeira nota", "Primeira Nota", JOptionPane.INFORMATION_MESSAGE));
    p2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a segunda nota", "Segunda Nota", JOptionPane.INFORMATION_MESSAGE));

    media = ((p1 * 2) + (p2 * 3)) / 5;

    JOptionPane.showMessageDialog(null, "A média ponderada da nota é: " + media);
  }
}