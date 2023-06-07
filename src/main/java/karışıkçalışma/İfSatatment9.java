package karışıkçalışma;

import java.util.Scanner;

public class İfSatatment9 {
    public static void main(String[] args) {

        /* TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.

		 */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen boyunuzu giriniz");
        double boy=scan.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz.");
        double kilo=scan.nextDouble();
        double bmı= kilo /(boy*boy);
        if (bmı<=20){
            System.out.println("Oldukça zayıfsınız.");
        }if ((bmı<=25) && bmı<20){
            System.out.println("Normal sınırdasınız.");
        }if ((bmı<25)&& bmı<=30){
            System.out.println("Sişmansınız.");

        }else System.out.println("Obezsiniz.");



    }

}

