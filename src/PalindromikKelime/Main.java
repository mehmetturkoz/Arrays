package PalindromikKelime;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen kelime giriniz:");
        String kelime=input.next();

        System.out.println(isPalindrome(kelime));
        System.out.println(isPalidrome2(kelime));

    }

    static boolean isPalidrome2(String str){
        String reverse="";
        for (int i = str.length()-1; i >=0 ; i--) {

            reverse+=str.charAt(i);

        }
        if(str.equals(reverse)){
            return true;
        }else{
            return false;
        }
    }

   static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;

        while(i<j){

            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;

        }

        return true;
   }
}
