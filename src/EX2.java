import java.util.Scanner;
public class EX2 {
    public static void main(String[] args) {
        double euro,dolar;
        Scanner d=new Scanner(System.in);
        System.out.println("Quantidade Dolar?");
        dolar =d.nextDouble();
        euro = dolar * 0.86;
        System.out.printf("%.2f Dolar = %.2f Euros",dolar,euro);

    }
}
