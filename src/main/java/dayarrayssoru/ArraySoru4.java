package dayarrayssoru;

import java.util.Scanner;

public class ArraySoru4 {

    public static void main(String[] args) {

          /*
  Kullanicidan aldigimiz 8 elemanli arrayin icinde
  kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
 */

        int arr[]=new int[8];
        Scanner input =new Scanner(System.in);
        int sayi=0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+" .indexteki elemanı giriniz.");
            arr[i]=input.nextInt();
            if (arr[i]%3==0 && arr[i]!=0){
                System.out.println(arr[i]);
                sayi++;
                
            }
        }
        System.out.println("sayi = " + sayi);
        
        
        
        
        
        
    }

    }

