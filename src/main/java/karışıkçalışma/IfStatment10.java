package karışıkçalışma;

import java.util.Scanner;

public class IfStatment10 {
    public static void main(String[] args) {

/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner scan =new Scanner(System.in);
        System.out.println("Yaşınızı giriniz.");
        int yas= scan.nextInt();
        System.out.println("Lütfen kilonuzu giriniz.");
        int kilo= scan.nextInt();

        if (yas<18){
            System.out.println("Bagış yapamaz.");
        }if (yas>18){
            if (kilo<50){
                System.out.println("Bagış yapamaz");
            }if (yas>18){
                if (kilo>50){
                    System.out.println("Bağış yapabilir.");
                }
            }
        }


        }
    }

