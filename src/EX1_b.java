import java.util.Scanner;

public class EX1_b {
    public static void main(String[] args) {
        int b, a, d, counter;

        counter = 0;
        d = 10;
        b=1;

        Scanner inteiro = new Scanner(System.in);
        System.out.println("Numero");
        a = inteiro.nextInt();
        a++;

        while (b >= 1)
        {
            b = (a / d);
            d = d * 10;
            counter++;
        }
        System.out.printf("O numero %d tem  %d digitos.", a, counter);

    }
}
