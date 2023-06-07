package urunsorusu;

public class Urun {



    /*
Urun urun = new Urun();

1) Kullanıcı ürünleri göstermeliyiz. ----> Urun clasın da bir obj. toString()
2) Scanner --> Scanner clasından bir obj create ediniz.
3) Loop --> Do-While Loop --> kullanıcı 0-7 rakamları arasında bir seçim yapmalı ve eğer girmiş olduğu rakam
1 den küçük ve ya 7 den büyük ise döngü devam etmeli ve kullanıcı 1-7 arasında bir seçim yapmaya force edilmeli.
4) 0 a basarak ta menuden cıkabilmeli. --> Yine Bekleriz... Yazısını konsola yazdıralım....
5) Kullanıcıdan productNum (1-7 arasında rakam {Kullanıcı 1 rakamı seçerse, Kraker, 2 rakamını seçerse cips etc.... }) --> switch-case yapısı kurmalıyım...
6) switch benden ProductNum ve alınan bu productNum a göre ilgili ürünün price ı alınmalı. urun.getKraker(), urun.getCips(), urun.getCay(), getCocaCola() etc....
(price set edebilmek için ben price ın setPrice() metodunu kullanmalıyım...)
7) return olarak bana price dönmeli. return getPrice() (double)

 */
        /*
      kraker=2.5;
      cips=2.2;
      cocaCola=2.2;
      fanta=2.0;
      su=1.0;
      cay=1.5;
      filtreKahve=1.99;
      productNum;
      price;
              */

    private double kraker = 2.5;
    private double cips = 2.2;
    private double cocaCola = 2.2;
    private double fanta = 2.0;
    private double su = 1.0;
    private double cay = 1.5;
    private double filtreKahve = 1.99;
    private int urunNumarasi;
    private double fiyat;


    public double krakerAl() { //bir ürünün fiyatını döndürmek için kullanılan bir metoddur

        return kraker;
    }

    public void krakerFiyatiAyarla(double kraker) {

        this.kraker = kraker; //Özetle, "this" anahtar kelimesi, bir sınıfın
        // içindeki bir özelliği ifade etmek ve onun değerini güncellemek için
        // kullanılır.
    }

    public double cipsAl() {

        return cips;
    }

    public void cipsFiyatiAyarla(double cips) {

        this.cips = cips;
    }

    public double cocaColaAl() {

        return cocaCola;
    }

    public void cocaColaFiyatiAyarla(double cocaCola) {

        this.cocaCola = cocaCola;
    }

    public double fantaAl() {
        return fanta;
    }

    public void fantaFiyatiAyarla(double fanta) {

        this.fanta = fanta;
    }

    public double suAl() {

        return su;
    }

    public void suFiyatiAyarla(double su) {

        this.su = su;
    }

    public double cayAl() {
        return cay;
    }

    public void cayFiyatiAyarla(double cay) {

        this.cay = cay;
    }

    public double filtreKahveAl() {
        return filtreKahve;
    }

    public void filtreKahveFiyatiAyarla(double filtreKahve) {

        this.filtreKahve = filtreKahve;
    }

    public int urunNumarasi() {

        return urunNumarasi;
    }

    public void urunNumarasiAyarla(int urunNumarasi) {

        this.urunNumarasi = urunNumarasi;
    }

    public double fiyatAl() {

        return fiyat;
    }

    public void fiyatBelirle(double fiyat) {

        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Urun: " +
                "\nKraker=₺" + kraker +
                ",\ncips=₺" + cips +
                ",\ncocaCola=₺" + cocaCola +
                ",\nfanta=₺" + fanta +
                ",\nsu=₺" + su +
                ",\ncay=₺" + cay +
                ",\nfiltreKahve=₺" + filtreKahve
                ;
    }

    /*
    Bu toString() metodu genellikle hata ayıklama, loglama veya nesne durumu hakkında bilgi sunma gibi senaryolarda kullanılır.
     Örneğin, bir Urun nesnesinin içeriğini kontrol etmek veya kullanıcının seçtiği ürünlerin fiyatlarını göstermek için kullanılabilir.
     */



        }








