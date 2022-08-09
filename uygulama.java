
import java.util.Scanner;
public class uygulama {

    public static void main(String[] args) {
        try (Scanner verioku = new Scanner(System.in)) {
            String isim;
            int yas;
            System.out.println("adınız nedir");
            isim=verioku.next();
            System.out.println("kaç yaşınızdasınız");
            yas=verioku.nextInt();
            System.out.println("merhaba "+isim+" yaşınız "+yas);
        }



    }
}
