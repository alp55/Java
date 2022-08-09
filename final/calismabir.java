package finalde;
import java.text.DecimalFormat;
import java.util.Scanner;

public class calismabir {
public static void main(String[] args) 
{
double vki,boy,kilo;
Scanner oku = new Scanner(System.in);
DecimalFormat cevir=new DecimalFormat("##.#");
System.out.println("boyunuzu giriniz");
boy=oku.nextDouble()/100;
System.out.println("kilonuzu giriniz");
kilo=oku.nextDouble();

vki=kilo/(boy*boy);
System.out.println("vki degeriniz "+cevir.format(vki));


}


    
}
