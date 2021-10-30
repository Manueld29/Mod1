
import java.util.Scanner;

public class EX6
{
    public static void main(String[] args) {
        int x,y,z;
        z=0;
        Scanner xx=new Scanner(System.in);
        System.out.println("Numero");
        x=xx.nextInt();

        for(y=1;y<=x;y++) {
            if (x % y == 0) {
                z++;
            }
        }
        if (z==2) {
            System.out.printf("%d é um numero primo.\n", x);
        }
        else {
            System.out.printf("%d não é um numero primo\n", x);
        }

    }
}
