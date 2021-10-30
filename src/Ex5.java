import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner aa=new Scanner(System.in);
        System.out.println("Numero 1");
        a= aa.nextInt();

        Scanner bb=new Scanner(System.in);
        System.out.println("Numero 2");
        b= bb.nextInt();

        Scanner cc=new Scanner(System.in);
        System.out.println("Numero 3");
        c= cc.nextInt();
        if (a>b && a>c) {
            System.out.printf("a=%d, b%d, c%d, maior numero é = %d", a, b, c, a);
        }
        else if (b>a && b>c) {
            System.out.printf("a=%d, b%d, c%d, maior numero é = %d", a, b, c, b);
        }
        else if (c>a && c>b){
            System.out.printf("a=%d, b%d, c%d, maior numero é = %d", a, b, c, c);
        }
    }
}
