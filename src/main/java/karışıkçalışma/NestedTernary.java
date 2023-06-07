package karışıkçalışma;

import java.util.Scanner;

public class NestedTernary {
    public static void main(String[] args) {

           /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen not giriniz.");
        char not =scan.next().toUpperCase().charAt(0);
        //koşul ? sonuç1 : sonuç2 ;
                 // true: false
        String sonuc =not=='A' ? "Gayet başarılı":not=='B'?"Başarılı":not=='C' ?"Ha gayret":"Diğerleri";
        System.out.println(sonuc);



    }
}
