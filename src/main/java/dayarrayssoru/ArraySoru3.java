package dayarrayssoru;

public class ArraySoru3 {
    public static void main(String[] args) {

        /*
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * lari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */

        int sayi[]={1,2,3,4,5,6,7};
        int toplam=0;

        for (int i=0; i<sayi.length; i++){
            toplam+=sayi[i];

        }
        double ortalama=toplam/sayi.length;
        System.out.println("ortalama = " + ortalama);

             }
    }

