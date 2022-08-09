package finalde;

import java.util.Random;
import java.util.Scanner;

import javax.security.sasl.SaslException;

public class calismabes {
    public static void main(String[] args) 
    
    {
        Scanner oku=new Scanner(System.in);
        int sayac=0;
        Random ras=new Random();
        int dizi [] = new int[10];
        for(int i=0;i<10;i++)
        {
            dizi[i]=ras.nextInt(20);
            

        }
        System.out.print("1-20 arasında sayi tutunuz ");
        int girilensayi=oku.nextInt();
        for(int i=0;i<10;i++)
        {
            if (girilensayi==dizi[i]) 
            {
				System.out.println("Tebrikler, bildiniz");
				sayac++;
				break;
            }

        }
        if (sayac==0) 
        {
        System.out.println("oyunu kazanamadınız");
        }


        
    }
    
}
