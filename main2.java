import java.util.Scanner;

public class main2 {

    public static void main(String[] args) {

        double para;

        Scanner gir = new  Scanner(System.in);

        System.out.println("Para tutarini yaziniz");

        para = gir.nextDouble();

        double yuzde1;

        yuzde1 = (para<=1000&&para>=0) ? para*0.18 : para*0.08;

        System.out.println("Kdvsiz para tutari : " + para);

        System.out.println("Kdv tutari : " + yuzde1);

        System.out.println("Kdvli fiyat : " + (para+yuzde1));







    }
}
