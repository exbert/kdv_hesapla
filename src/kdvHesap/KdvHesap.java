package kdvHesap;

import java.util.Scanner;


public class KdvHesap {

    public static final int KDV_18 = 18;
    public static final int KDV_8 = 8;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("KDVsiz tutarı giriniz: ");
        int kdvsiz = s.nextInt();

        int kdv = (kdvsiz <= 1000) ? KDV_18 : KDV_8;

        System.out.println("Ürünün KDV oranı: " + kdv + "% dir.");
        System.out.println("Ürünün KDV'li fiyatı: " + (kdvsiz + kdvsiz*kdv / 100.0) + " TL dir.");
        System.out.println("Ürünün KDV tutarı: " + (kdvsiz*kdv / 100.0) + " TL dir.");
    }
}
