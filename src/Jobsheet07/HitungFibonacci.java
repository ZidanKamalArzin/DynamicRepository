
package Jobsheet07;
import java.util.Scanner;
public class HitungFibonacci {
    private static void tampilJudul(String identitas)
    {
        System.out.println("Identitas : "+ identitas);
        
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
    }
    public static void main(String[] args )
    {
        String identitas = "Zidan Kamal Arzin / X RPL 2 / 40";
        int n = tampilInput();
        tampilJudul(identitas);
    }
    private static int tampilInput() {
        Scanner scanner = new Scanner(System.in);
        
            System.out.println("Bilangan ke-: ");
            int n = scanner.nextInt();
            
            return n;
    }
}
    
