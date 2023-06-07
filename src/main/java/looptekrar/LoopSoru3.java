package looptekrar;

import java.util.Scanner;

public class LoopSoru3 {
    public static void main(String[] args) {

        /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
         * bir method create ediniz.
         *
         *  getAsalMi(int sayi)
         *  	return true/false


         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Sayı girin");
        int sayi=scan.nextInt();

        System.out.println(getAsalMi(sayi));


    }

    private static boolean getAsalMi(int sayi) {

        boolean asalMi=true;
        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                asalMi=false;

            }

        }
        return asalMi;
    }


}




