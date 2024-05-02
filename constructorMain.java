package info.com;

public class constructorMain {
    public static void main(String args[]){
        ogrenciler ogrenci = new ogrenciler();

        ogrenci.adres = "ankara";
        ogrenci.isim = "sema";
        ogrenci.okulno =220508452;
        ogrenci.boy = 1.72;

        System.out.println(ogrenci.boy);

        ogrenciler ogrenci2 = new ogrenciler("sema",220508452,"tokat",1.73);
        System.out.println(ogrenci2.isim);
    }
}
