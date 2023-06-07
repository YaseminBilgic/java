package karışıkçalışma;

import java.util.Scanner;

public class İfStatment8 {

    public static void main(String[] args) {
        /* kullanıcıdan bir sayı alın
        Eğer 10 dan büyük ise "büyüksün" yazdırın
        eğer 10 dan küçük ise "normalsin yazdırın


      eğer sayı pozitif değilse -10 dan büyük olup olmadığını kontrol edin
      eğer -10 dan büyük ise negatifsin yazdırın
      eğer -10 dan kucuk ise çok negatifsin yazdırın
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        int sayi=scan.nextInt();
        if(sayi>0){
            if (sayi>10){
                System.out.println("Büyüksün");

            }else System.out.println("Normalsin");

        } else if (sayi<0) {
            if (sayi>-10){
                System.out.println("Negatifsin");
            }else System.out.println("Çok negatifsin");
        }
    }

        }



