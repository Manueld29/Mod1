import java.util.Scanner;

public class EX1_c {

    public static void main(String[] args){
        float a,x,y,z;

        Scanner xx = new Scanner(System.in);
        System.out.println("Numero 1");
        x = xx.nextFloat();

        Scanner yy = new Scanner(System.in);
        System.out.println("Numero 2");
        y = yy.nextFloat();

        Scanner zz = new Scanner(System.in);
        System.out.println("Numero 3");
        z = zz.nextFloat();

        Scanner aa = new Scanner(System.in);
        System.out.println("Numero 4");
        a = aa.nextFloat();

        System.out.printf("%.2f\n",x);
        System.out.printf("%.2f\n",y);
        System.out.printf("%.2f\n",z);
        System.out.printf("%.2f\n",a);



    }
}