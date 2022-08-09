package finalde;

import java.util.Scanner;

public class calismauc 
{
    public static void main(String[] args) {
    Scanner oku = new Scanner(System.in);
    int vize,fnal;
    double ortalama;
    System.out.print("vize notunu giriniz");
    vize=oku.nextInt();
    System.out.print("final notunu giriniz");
    fnal=oku.nextInt();    
    ortalama=(vize*0.4)+(fnal*0.6);
    if(ortalama>=50)
    {
        System.out.println("geçtiniz");

    }
    else
    {
        System.out.println("kaldınız");
    }

    }
   
    
}
