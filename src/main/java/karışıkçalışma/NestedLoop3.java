package karışıkçalışma;

import java.util.Scanner;

public class NestedLoop3 {
    public static void main(String[] args) {
            /*
        girilen bir ifadenin istenen harf sayısını print eden code create ediniz

        input : selam javaCAN'lar
        output : a sayısı :3
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Bir cümle giriniz.");
        String cümle=scan.nextLine();
        System.out.println("Sayılacak harfi giriniz");
        char harf=scan.next().charAt(0);
        int harfSayısı=0;
        for (int i = 0; i <cümle.length() ; i++) {
         if (cümle.charAt(i)==harf){
             harfSayısı++;
         }

        }
        System.out.println("Girdiğiniz cümle: " + cümle+"de istediğiniz harf : " + harf +" "+ harfSayısı + " kadar var");
    }
}
