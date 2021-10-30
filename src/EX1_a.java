import java.util.Scanner;
public class EX1_a{
    public static void main(String[] args) {
        float r,ir;
        int ri,i;
        Scanner real = new Scanner(System.in);
        System.out.println("Numero Real");
        r = real.nextFloat();

        Scanner inteiro = new Scanner(System.in);
        System.out.println("Inteiro");
        i = inteiro.nextInt();

        ri=(int) r;
        ir=i;
        System.out.printf("Real %f = Inteiro %d \n",r,ri);
        System.out.printf("Inteiro %d = Real %f \n",i,ir);

    }
}


