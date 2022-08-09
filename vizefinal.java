import java.util.Scanner;

public class vizefinal {
    public static void main(String[] args) 
    {
        try (Scanner verioku = new Scanner(System.in)) {
            int fnl,vize;
            
            double ortalama;

            System.out.println("vize notunuzu giriniz ");
            vize=verioku.nextInt();
            System.out.println("lütfen final notunuzu giriniz");
            fnl=verioku.nextInt();
            ortalama=(fnl*0.6)+(vize*0.4);
            System.out.println(ortalama);
            if(ortalama>50 && fnl>50)
            {
                System.out.println("gectiniz");
            }
            else
            {
                System.out.println("kaldınız");
            }
        }



        
    }
    
}
