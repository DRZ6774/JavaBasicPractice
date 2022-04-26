package practice_basic_day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q12_ArraysList_Calısma {
    public static void main(String[] args) {
        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Olusturmak istediğiniz listin uzunlugunu giriniz");
        int listUzunluk=scan.nextInt();

        List<Integer> list=new ArrayList<>();
        System.out.println("girdiginiz list uzunlugu kadar eleman ekleyiniz ..");

        for (int i = 0; i <listUzunluk; i++) {
            list.add(scan.nextInt());

            tekrarlıEleman(list);


        }

    }

    private static void tekrarlıEleman(List<Integer> ls) {

        List<Integer>tekrarlıList=new ArrayList<>();

        for (int i = 0; i < ls.size(); i++) {
            for (int j = i+1; j <ls.size() ; j++) {
                if (ls.get(i)==ls.get(j) && !tekrarlıList.contains(ls.get(i))){
                    tekrarlıList.add(ls.get(i));
                }

            }

        }
        System.out.println(tekrarlıList);
    }
}
