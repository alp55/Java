

import java.text.DecimalFormat;
import java.util.Scanner;

public class vki {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try (Scanner bigioku = new Scanner(System.in)) {
	double boy,kilo,vki,ideal,idealalt,idealust;
	DecimalFormat sayiformati =new DecimalFormat("###,##.#");
	System.out.println("Lütfen kilonuzu giriniz(kg)");
	kilo=bigioku.nextDouble();
	System.out.println("Lütfen boyunuzu giriniz(cm)");
	boy=bigioku.nextDouble()/100;
	vki=kilo/(boy*boy);
	
	System.out.println("VKİ Sonucunuz: " + sayiformati.format(vki));
	if (vki<18.5) {
		System.out.println("Durumunuz: ZAYIF ");
		idealalt=Math.round(18.5*(boy*boy));
		idealust=Math.round(24.9*(boy*boy));
		System.out.println("ideal kilonuz: "+ idealalt+ " - "+ idealust +" aralığındadır");
	}else if (vki<25) {
		System.out.println("Durumunuz: NORMAL ");
	}else if (vki<30) {
		ideal=23*(boy*boy);
		ideal=Math.round(ideal);
		System.out.println("Durumunuz: HAFİF KİLOLUSUNUZ. \nİDEAL KİLONUZ: "+ideal);
		System.out.println(kilo-ideal + " kg ağırlık kaybetmelisiniz");
	}else if (vki<35) {
		ideal=24*(boy*boy);
		ideal=Math.round(ideal);
		System.out.println("Durumunuz: 1. DERECE OBEZ  \nİDEAL KİLONUZ: "+ideal);
		System.out.println(kilo-ideal + " kg ağırlık kaybetmelisiniz");
	}else if (vki<45) {
		ideal=24*(boy*boy);
		ideal=Math.round(ideal);
		System.out.println("Durumunuz: 2. DERECE OBEZ  \nİDEAL KİLONUZ: "+ideal);
		System.out.println(kilo-ideal + " kg ağırlık kaybetmelisiniz");
	}else {
		ideal=25*(boy*boy);
		ideal=Math.round(ideal);
		System.out.println("Durumunuz: 3. DERECE OBEZ  \nİDEAL KİLONUZ: " +ideal);
		System.out.println(kilo-ideal + " kg ağırlık kaybetmelisiniz");
	}
}
	}
}