package RandomNumber;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand=new Random();
        int number= rand.nextInt(100);
        // int number=(int) (Math.random()*100);

        Scanner input=new Scanner(System.in);

        int right=0;
        int select;
        int[] wrong=new int[5];
        boolean win=false;

        //System.out.println(number);  Gizli sayı yazdırma komutu.

        while (right<5){
            System.out.print("Lütfen tahminizi giriniz:");
            select=input.nextInt();
            if(select<0 || select>99) {
                System.out.println("Lütfen 0 ile 100 arası bir değer giriniz.");
                continue;
            }

            if(select==number){
                System.out.println("Tebrikler,sayıyı bildiniz."+select);
                break;
            }else{
                System.out.println("Hatalı bir sayı girdiniz.");
                if(select>number){
                    System.out.println("Seçtiğiniz sayı gizli sayıdan büyüktür.");
                }else{
                    System.out.println("Seçtiğiniz sayı gizli sayıdan küçüktür.");
                }
                wrong[right++]=select;
                System.out.println("Kalan Hak:"+(5-right));
            }

        }
        if(!win){
            System.out.println("Kaybettiniz!!"+" Tahminleriniz:"+ Arrays.toString(wrong));
            }
    }
}
