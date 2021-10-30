import java.util.Scanner;

public class EX1_d {

    public static void main(String[]args) {
        float x, y;

        Scanner xx = new Scanner(System.in);
        System.out.println("Numero 1");
        x = xx.nextFloat();
        y = x * 100;

        System.out.printf("%.0f\n", y);
        System.out.printf("%.3f\n", x);
        System.out.printf("%.2f\n", x);
        System.out.printf("%.1f\n", x);
    }
}