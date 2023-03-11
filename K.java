import javax.swing.JOptionPane;

public class K {
    public static void main(String[] args) {
        double salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário fixo do funcionário:"));
        double totalVendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o total que o funcionário vendeu:"));
        
        double comissao = totalVendas * 0.04;
        double totalSalario = salarioFixo + comissao;
        
        JOptionPane.showMessageDialog(null, "A comissão é de R$" + comissao + " e o salário final do funcionário é de R$" + totalSalario);
    }
}