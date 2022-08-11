package DiziSira;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Dizi elaman sayısını giriniz:");
        int elamanSayisi=input.nextInt();
        int[] list=new int[elamanSayisi];

        for (int i = 0; i < elamanSayisi; i++) {
            System.out.print((i+1)+". Eleman :");
            list[i]= input.nextInt();
        }
        Arrays.sort(list);
        System.out.println("Sıralama: "+Arrays.toString(list));
    }
}
