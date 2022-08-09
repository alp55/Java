import java.util.Scanner;

public class vize

{
    
    public static void main(String[] args)
    {
        double toplam=0;
        try (Scanner oku = new Scanner(System.in)) {
            System.out.println("1. vize notunu giriniz");
            int vize1=oku.nextInt();
            System.out.println("2. vize notunu giriniz");
            int vize2=oku.nextInt();
            System.out.println("final notunu giriniz");
            int fnal=oku.nextInt();
            
            toplam=fnal*0.6+((vize1+vize2)/2*0.4);
        }
        
        System.out.println("toplam "+toplam);
       
        
    }
}
