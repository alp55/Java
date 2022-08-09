package finalde;

import java.util.Random;
import java.util.Scanner;

public class calismaalti {
    public static void main(String[] args) 
    {
    boolean oyundevam=true;
    Scanner oku=new Scanner(System.in);
    String kelime[]={"araba","kalem","keriz"};
    Random kelimetut=new Random();
    int secilen=kelimetut.nextInt(kelime.length);
    String secilenkelime=kelime[secilen];
    
    String altcizgi[]=new String[secilenkelime.length()];
    for(int i=0;i<secilenkelime.length();i++)
    {
        altcizgi[i]="_";
        System.out.print(altcizgi[i]);

    }

    while(oyundevam)
    {
        System.out.println("Bir harf tarhmini ");
        char harf=oku.next().charAt(0);
        for (int i = 0; i < secilenkelime.length(); i++) {
            if (secilenkelime.charAt(i)==harf){
            altcizgi[i]	=harf+ " ";
            }
        }for (int i = 0; i < secilenkelime.length(); i++) {
            System.out.print(altcizgi[i]);
        }

    }

}
    
}
