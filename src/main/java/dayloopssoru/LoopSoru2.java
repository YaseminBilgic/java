package dayloopssoru;

import java.util.Scanner;

public class LoopSoru2 {
    public static void main(String[] args) {


        //girilen sayıdan 100 e kadar 4 ün katı olan tam sayıları print eden kod yazınız

        Scanner input =new Scanner(System.in);
        System.out.println(" Lütfen sayı giriniz: ");
        int sayi=input.nextInt();

        if(sayi>100){
            System.out.println("Lütfen geçerli bir sayı giriniz");
        }else{
            for (int i = sayi; i <100 ; i++) {
                if (i%4==0){
                    System.out.println(i+" ");
                }

            }

        }



    }
}
