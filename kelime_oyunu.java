import java.util.Random;
import java.util.Scanner;

public class kelime_oyunu

{
public static void main(String[] args) 
{
    int hak=0;
		boolean oyundevam=true;
		String secilenkelime="";
		int dogru=0;
		Random tut=new Random();
		Scanner bilgioku=new Scanner(System.in);
		
		
		String kelimeesya[]={"masa", "sandalye","kalemlik", "kalem", "defter","telefon", "bilgisayar", "kitap", "saat","anahtar"};
		String kelimehayvan[]={"kedi", "köpek","aslan", "kaplan", "kaplumbağa","timsah", "kartal", "zürafa", "hipopotam","inek"};
		String kelimeulke[]={"fransa", "ingiltere","türkiye", "bulgaristan", "azerbaycan","rusya", "almanya", "portekiz", "amerika","italya"};
		
		int secilendizi=tut.nextInt(3)+1;
		if (secilendizi==1) {
			int tutulansayi=tut.nextInt(kelimeesya.length);
			secilenkelime=kelimeesya[tutulansayi];
			System.out.println("Kategori= Eşya");
		}else if (secilendizi==2) {
			int tutulansayi=tut.nextInt(kelimehayvan.length);
			secilenkelime=kelimehayvan[tutulansayi];
			System.out.println("Kategori= Hayvan");
		}else if (secilendizi==3) {
			int tutulansayi=tut.nextInt(kelimeulke.length);
			secilenkelime=kelimeulke[tutulansayi];
			System.out.println("Kategori= Ülke");
		}
		
		String altcizgi[]=new String[secilenkelime.length()];

		for (int i = 0; i < secilenkelime.length(); i++) {
			altcizgi[i]="_ ";
			System.out.print(altcizgi[i]);
		}//_ _ _ _ 
		
		while (oyundevam) 
		{
		System.out.println("Lütfen bir harf giriniz");
		char harf=bilgioku.next().charAt(0);
		hak++;
		int hakkontrol=0;
		for (int i = 0; i < secilenkelime.length(); i++) 
		{
			if (harf==secilenkelime.charAt(i)) {//saat----a
				altcizgi[i]=harf+ " ";
				hak--;//0,-1,-2,-3-4
				hakkontrol++;//2
				dogru++; } }
			if (hakkontrol>1) {
				hak=hak+(hakkontrol-1);//0
			}
			for (int i = 0; i < secilenkelime.length(); i++) {
				System.out.print(altcizgi[i]);
			}  
			if (hak>=secilenkelime.length()) {
				System.out.print("Hakkınız doldu. Kelimemiz: " + secilenkelime);
				oyundevam=false;
			}
			if (dogru==secilenkelime.length()) {
				System.out.println("Tebrikler bilidiniz. Puanınız: " + ((secilenkelime.length()-hak)*10));
				System.out.println("Yeniden oynamak iste misiniz? e/h");
				String yanit=bilgioku.next();
				if (yanit.equalsIgnoreCase("e"))  
				{
				hak=0;
				dogru=0;
				secilendizi=tut.nextInt(3)+1;
				if (secilendizi==1) 
				{
					int tutulansayi=tut.nextInt(kelimeesya.length);
					secilenkelime=kelimeesya[tutulansayi];
					System.out.println("Kategori= Eşya");
				}
				else if (secilendizi==2)
				{
					int tutulansayi=tut.nextInt(kelimehayvan.length);
					secilenkelime=kelimehayvan[tutulansayi];
					System.out.println("Kategori= Hayvan");
				}
				else if (secilendizi==3) 
				{

					int tutulansayi=tut.nextInt(kelimeulke.length);
					secilenkelime=kelimeulke[tutulansayi];
					System.out.println("Kategori= Ülke");
				}
					altcizgi=new String[secilenkelime.length()];
					oyundevam=true;	
				for (int i = 0; i < secilenkelime.length(); i++) {
					altcizgi[i]="_ ";
					System.out.print(altcizgi[i]);
				}
				}
			
			
			}
		}
	}
}			

		
		
		




