package dayarrayssoru;

public class ArraySoru6 {
    /*

Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
Cumle: Verilen bir cumledeki bosluklar haric karakter sayisini bulunuz.*/

    public static void main(String[] args) {

        String cumle ="Java öğrenmek çok kolay!";
        String arr[]=cumle.replace(" ", "").split("");
        System.out.println(arr.length);

    }

}
