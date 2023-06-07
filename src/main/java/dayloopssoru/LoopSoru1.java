package dayloopssoru;

public class LoopSoru1 {

    public static void main(String[] args) {

        // 41 kere maşallah print ediniz

        for (int i =1;i <=41 ;i++ ){
            System.out.println(i+ "Maşallah");

        }




       // 1. yol:
     /*  for (int i = 1; i <= 41; i++) {
            System.out.println(i+ "Maaşallah");
            }

      */


        // 2. yol :
     /*
       for(int i = 1; i <= 41; i++) {

            if (i < 42) {
                System.out.println(i + "Maaşallah");
            } else {
                System.out.println(i + "selam javacanlar");
            }
        }

      */
       // 3. yol :java bunun gibi uzun işlemleri sevmez.
       // System.out.println("Masallah");



    }
}
