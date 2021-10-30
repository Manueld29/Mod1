import java.util.Scanner;
public class EX3 {
    public static void main(String[] args) {
        double c,f,k,cf,ck,fc,fk,kc,kf;

        Scanner cc= new Scanner(System.in);
        System.out.println("Celsius");
        c =cc.nextFloat();

        Scanner ff= new Scanner(System.in);
        System.out.println("Fahrenheit");
        f =ff.nextFloat();

        Scanner kk= new Scanner(System.in);
        System.out.println("Kelvin");
        k = kk.nextDouble();

        cf=1.8*c+32;
        ck=c+273.15;
        fc=(f-32)/1.8000;
        fk=((f-32)/1.8000)+273.15;
        kc=k-273.15;
        kf=((k-273.15)*1800)+32;

        System.out.printf("%.2f Celsius = Kelvin %.2f\n",c,ck);
        System.out.printf("%.2f Kelvin =  Celsius %.2f\n",k,kc);
        System.out.printf("%.2f Fahrenheit = Kelvin %.2f\n",f,fk);
        System.out.printf("%.2f Kelvin = Fahrenheit %.2f\n",k,kf);
        System.out.printf("%.2f Celsuis = Fahrenheit %.2f\n",c,cf);
        System.out.printf("%.2f Fahrenheit = Celsius %.2f\n",f,fc);
    }

}
