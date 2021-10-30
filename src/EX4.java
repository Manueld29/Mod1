import java.util.Scanner;
public class EX4 {
    public static void main(String[] args) {
        int a,b,c;
        double x1,x2,r;

        Scanner aa=new Scanner(System.in);
        System.out.println("a");
        a= aa.nextInt();

        Scanner bb=new Scanner(System.in);
        System.out.println("b");
        b= bb.nextInt();

        Scanner cc=new Scanner(System.in);
        System.out.println("c");
        c= cc.nextInt();

        r=((Math.pow(b,2))-(4*a*c));
        r=Math.sqrt(r);
        x1=((-b)+r)/2*a;
        x2=((-b)-r)/2*a;

        System.out.printf("Solucaçao para a=%d, b=%d, c=%d é %f V %f \n",a,b,c,x1,x2);

    }
}
