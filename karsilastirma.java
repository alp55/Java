import java.util.Scanner;


 public class karsılastırma {
    
    public static void main(String[] args) {
       
        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Birinci Sayıyı Girin: ");         
            int sayi1 = reader.nextInt();
            System.out.print("İkinci Sayıyı Girin: ");   
            int sayi2 = reader.nextInt();
            System.out.print("ücüncü sayiyi giriniz: ");
            int uc = reader.nextInt();
            if((sayi1>sayi2) & (sayi1>uc))
            {
                System.out.println("en büyük sayi 1");
            }
            else if((sayi2>sayi1) & (sayi2>uc))
            {
                System.out.println("sayi 2 büyüktür");
            }
            else if((uc>sayi1) & (uc>sayi2))
            {
                System.out.println("3 sayı en büyüktür");
            }
            else
            {
System.out.println("sayılar eşitir");

            }
        }

        }
}