package DiziTranpoz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Satır sayısı:");
        int satir=input.nextInt();
        System.out.print("Sütun sayısı:");
        int sutun=input.nextInt();

        System.out.println("Matrisin elemanlarını giriniz :");
        int eleman=input.nextInt();

        int[][] list=new int[satir][sutun];
        int[][] transpoz=new int[sutun][satir];


        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                list[i][j]=input.nextInt();
            }
        }

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                transpoz[j][i]=list[i][j];
                System.out.print(list[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("---------------");

        for (int i = 0; i < list[0].length; i++) {
            for (int j = 0; j < list.length; j++) {
                System.out.print(transpoz[i][j]+" ");
            }
            System.out.println();
        }
    }

}
