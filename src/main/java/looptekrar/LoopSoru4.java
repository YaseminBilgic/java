package looptekrar;

import java.util.Scanner;

public class LoopSoru4 {
    public static void main(String[] args) {


         /*
          Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
         atlar ve loop'un bir sonraki değerinden devam eder.

         */

      // Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden kodu yazınız


        Scanner scan = new Scanner(System.in);
        System.out.println("mail adresi giriniz");
        String mail= scan.nextLine();

        for (int i = 0; i < mail.length(); i++) {
            char a=mail.charAt(i);
            if (a==' '){
                continue;

            }
            System.out.print(a);
        }

        }

    }

