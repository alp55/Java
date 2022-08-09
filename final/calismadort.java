package finalde;

import java.util.Random;
import java.util.Scanner;

public class calismadort {
    public static void main(String[] args) 
    {
        int sayaç=1,deneme;
        Random tut =new Random();
        Scanner oku=new Scanner(System.in);
        int tutulan=tut.nextInt(30);
        while(sayaç<=5)
        {
            
            System.out.print(sayaç+".deneme hakiniz ");
            deneme=oku.nextInt();
            if(sayaç>=5)
            {
                System.out.println("tutlan sayi "+tutulan);
                break;
            }
            
            if(tutulan==deneme)
            {
                System.out.println("bildiniz");
                break;
            }
            if(tutulan>deneme)
            {
                System.out.println("sayiyi büyüt");
            }
            if(tutulan<deneme)
            {
                System.out.println("sayiyi kücült"); 
            }
            
            
            sayaç=sayaç+1;
        }


    }
    
}
