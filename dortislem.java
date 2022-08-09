import java.util.Scanner;

public class dortislem {
    public static void main(String[] args) 
    {
        int bir,iki,toplam=0,sec;
        try (Scanner oku = new Scanner(System.in)) {
            System.out.println("birinci sayiyi giriniz");
            bir=oku.nextInt();
            System.out.println("ikinci sayiyi giriniz");
            iki=oku.nextInt();
            while (1!=0)
            {
            System.out.println("toplama için 1 cıkarma için 2 carpma için 3 bölme için 4 basınız");
            sec=oku.nextInt();
   
            if(sec==1)
            {
                toplam=bir+iki;
                break;

            }
            else if(sec==2)
            {
                toplam=bir-iki;
                break;

            }
            else if(sec==3)
            {
                toplam=bir*iki;
                break;
            }
            else if(sec==4)
            {
                toplam=bir/iki;
                break;

            }
            else
            {
                System.out.println("yanlış secim yaptınız tekrar yapınız");
            }

   }
        }
        System.out.println("toplam "+toplam);
    }
    
}
