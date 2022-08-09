import java.util.Scanner;
 
public class toplam {
 
     public static void main(String[] args) {
       
        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Birinci Sayıyı Girin: ");         
            int sayi1 = reader.nextInt();
            System.out.print("İkinci Sayıyı Girin: ");   
            int sayi2 = reader.nextInt();
 
            int toplam = sayi1 + sayi2;
 
            System.out.println("Sayıların Toplamı: " + toplam);

            if(sayi1>sayi2)
            {
System.out.println("sayi 1 büyük");

            }
            else if(sayi2>sayi1)
            {
                System.out.println("sayi 2 büyüktür");
            }
            else
            {
System.out.println("sayılar eşitir");
            }
        }

    }
    
}