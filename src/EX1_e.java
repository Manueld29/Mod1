import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EX1_e
{
    public static void main(String[] args) {

        DateTimeFormatter t1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(t1.format(LocalDateTime.now()));

        DateTimeFormatter t2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(t2.format(LocalDateTime.now()));

        DateTimeFormatter t3 = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println(t3.format(LocalDateTime.now()));

        DateTimeFormatter t4 = DateTimeFormatter.ofPattern("MM/dd/yy HH:mm:ss");
        System.out.println(t4.format(LocalDateTime.now()));

    }
}