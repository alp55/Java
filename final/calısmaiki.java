package finalde;

import java.util.Scanner;

public class calısmaiki {
    public static void main(String[] args) 
    {
        Scanner oku= new Scanner(System.in);
        int satir,sutun;
    
        System.out.println("oluşturmak istediginiz şekil kac satir olsun");
        satir =oku.nextInt();
        System.out.println("oluşturmak istediginiz şekil kaç stun olsun");
        sutun=oku.nextInt();
        for(int i=0;i<satir;i=i+1)       
        {
            for(int k=0;satir>k;k=k+1)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
}
