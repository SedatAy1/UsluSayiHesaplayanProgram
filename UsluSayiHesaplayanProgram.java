
import java.util.Scanner;

public class UsluSayiHesaplayanProgram{
    public static void main(String[] args) {
        int i, k, n;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Üssü Alınacak Sayı Giriniz: ");
        n=scanner.nextInt();
        System.out.print("Üs Olacak Sayıyı Giriniz: ");
        k=scanner.nextInt();
int total=1;
        for (i=1; i<=k; i++){
            total=total*n;
        }
        System.out.println("Cevap: "+total);
    }
}
