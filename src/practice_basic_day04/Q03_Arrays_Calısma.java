package practice_basic_day04;

import java.util.Arrays;

public class Q03_Arrays_Calısma {
    /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */
    public static void main(String[] args) {

        String str="HeySiri";
        str=str.replace("Hey","Bye");
        System.out.println(str);

        String arr[]=new String[1];
        arr[0]=str;
        System.out.println(Arrays.toString(arr));


        String str1="HeySiri";
        String yenistr[]=str1.split("y");
        yenistr[0]="Bye";
        str1=yenistr[0]+yenistr[1];

        System.out.println(str1);

        String arr2[]=new String[1];
        arr2[0]=str1;

        System.out.println(Arrays.toString(arr2));







    }
}
