
package Jobsheet07;
import java.util.Scanner;
public class Tugas01 {
    public static void main(String[] args){
        String identitas = "Zidan Kamal Arzin / X RPL 2 / 40";
        System.out.println(identitas);
        System.out.println();
        int[] nominal = new int[] {5000, 2000, 1000, 5004, 100};
        Scanner scan = new Scanner(System.in);
        System.out.print("Jumlah uang : ");
        int uang = scan.nextInt();
        int i;
        
        for(i=0;i<5;i++){
            int jumlah = uang/nominal[i];
            uang = uang - (nominal[i]*jumlah);
            
            System.out.println("lembar "+ nominal[i] +" = "+ jumlah);
        }
    }
  
}
