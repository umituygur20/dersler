package derssonrasipractice;

import java.util.*;

/*

  Proje: Araç Sigorta Prim Hesaplama
         Araç tipleri: otomobil,kamyon,otobüs,motosiklet
                      - otobüs: 18-30 koltuk veya 31 ve üstü koltuk
         Tarife dönemi: Aralık 2022,Haziran 2022
         1.dönemi: Haziran 2022                   2.dönem: Aralık 2022
           otomobil: 2000                           otomobil: 2500
           kamyon: 3000                             kamyon: 3500
           otobüs: tip1: 4000 tip2: 5000            otobüs: tip1: 4500 tip2: 5500
           motosiklet: 1500                         motosiklet: 1750

       Hatalı girişte hesaplama başarısız uyarısı verip tekrar menü gösterilsin.

   */
public class AracSigortaPrim_MiniProject02 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         int koltukSayisi = input.nextInt();

        if (koltukSayisi<31){
            //prim 4000
            //2.donem olursa +500

        } else {
            //prim 5000
            //2.donem olursa +500
        }

    }




}
