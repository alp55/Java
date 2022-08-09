import java.util.Random;
import java.util.Scanner;


public class adamasmaca {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dogrubilinen=0;
		int hak=0;
		int puan;
		boolean oyundevam=true;
		
		Scanner bilgioku=new Scanner(System.in);
		String kelime[]={"masa", "sandalye","kalemlik", "kalem", "defter","telefon", "bilgisayar", "kitap", "saat","anahtar"};
		Random kelimetut=new Random();
		int secilen=kelimetut.nextInt(kelime.length);
		String secilenkelime=kelime[secilen];
		String altcizgi[]=new String[secilenkelime.length()];
		for (int i = 0; i < secilenkelime.length()/*4*/; i++) {
			altcizgi[i]="_ ";
			System.out.print(altcizgi[i]);
		}
		while (oyundevam) {
		System.out.println("Bir harf tahmini giriniz");//masa
		char harf=bilgioku.next().charAt(0);
		hak++;//0 +1 
		int haksayaci=0;
		for (int i = 0; i < secilenkelime.length(); i++) {
			if (secilenkelime.charAt(i)==harf){//masaa---a
			dogrubilinen++;//3
			haksayaci++;//3
			hak--;//-2
			altcizgi[i]	=harf+ " ";// a 
		}
			}if (haksayaci>1) 
            {
			hak=hak+(haksayaci-1);	//hak= -2 +	2=0;
		}
		for (int i = 0; i < secilenkelime.length(); i++) {
			System.out.print(altcizgi[i]);
		}
		if (hak>=secilenkelime.length()) {
			System.out.print("hakiniz doldu. Kelime: "+ secilenkelime);
			oyundevam=false;}
		
		if (dogrubilinen==secilenkelime.length()) {
			System.out.print("Kelimeyi Bildiniz: ");
			System.out.println((secilenkelime.length()-hak) * 10);
			oyundevam=false;
		}
		
		}
	}
}