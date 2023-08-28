package daire;
import java.sql.SQLOutput;
import java.util.Scanner;
public class DaireOlcer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r;
        double pi = 3.14;
        System.out.print("Dairenin yarı çapını giriniz: ");
        r = input.nextDouble();


        double alan = pi * r * r ;
        double cevre = 2 * pi * r;



        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin çevresi : " + cevre);

        System.out.print("İstediğiniz dilimin merkez açı ölçüsünü giriniz:");
        int centerAngle = input.nextInt();

        double dilimAlan = (pi * (r*r) * centerAngle) /360;
        System.out.print("Daire diliminin alanı : " + dilimAlan);






    }

}
