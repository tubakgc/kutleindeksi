import java.util.Scanner;

public class kutleindeks {
    public static void main(String[] args) {
         int kg;

         Scanner inp =new Scanner(System.in);

         System.out.print("kilonuzu giriniz:");
         kg= inp.nextInt();

         double boy, sonuc;
         System.out.print("boyunuzu cm cinsinden giriniz:");
         boy= inp.nextDouble();

         sonuc = kg / (boy * boy);
         System.out.print("vücut kitle indeksi:" + sonuc);




    }
}
