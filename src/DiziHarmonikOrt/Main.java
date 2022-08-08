package DiziHarmonikOrt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin eleman sayısını giriniz:");
        int n=input.nextInt();

        int[] list=new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print(i+". eleman:");
           list[i] = input.nextInt();
        }

        double harOrt=0.0;

        for (int i = 0; i < n; i++) {

            harOrt+=(1.0/list[i]);
        }

        System.out.println("Hrmonik Ortalama: "+n/harOrt);
    }
}
