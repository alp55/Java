import java.util.Scanner;;

public class uygulama2 {
    public static void main(String[] args) {
        try (Scanner verioku = new Scanner(System.in)) {
            int sayi1,sayi2;
            System.out.println("bir sayi giriniz");
            sayi1=verioku.nextInt();
            System.out.println("ikinci sayiyi giriniZ");
            sayi2=verioku.nextInt();
            System.out.print("toplam "+(sayi1+sayi2));
        }
        
    }
    
}
