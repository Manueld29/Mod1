import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class Circulo {
    public static void main (String[] args) {
        double area, raio;
        String raioStr;
        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println("Este programa usa JOption");
                raioStr = JOptionPane.showInputDialog(null, "Escreva o raio do circulo (em cm):", "Cálculo da área do circulo",
                        JOptionPane.QUESTION_MESSAGE);
        raio = Double.parseDouble(raioStr);
        area = Math.PI * Math.pow(raio, 2);
        JOptionPane.showMessageDialog(null, "A área do circulo de raio " + df.format(raio) + " é de " + df.format(area) + "cm2", "Área do circulo",
                JOptionPane.INFORMATION_MESSAGE);
    }
}