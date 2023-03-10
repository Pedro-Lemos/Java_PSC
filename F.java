import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        // prompt the user for the base and height of the triangle
            String baseStr = JOptionPane.showInputDialog("Digite a base do triângulo");
        String heightStr = JOptionPane.showInputDialog("Digite a altura do triângulo");
        
        // convert the input strings to doubles
        double base = Double.parseDouble(baseStr);
        double height = Double.parseDouble(heightStr);
        
        // calculate the area of the triangle
        double area = base * height / 2;
        
        // display the result using another dialog box
        JOptionPane.showMessageDialog(null, "A área do triângulo é: " + area);
    }

}
