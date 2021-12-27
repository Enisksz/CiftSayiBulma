package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i ,sayi,kacTane=0;
        double toplam=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        sayi = input.nextInt();

        for(i=1;i<sayi;i++){
            if(i%3==0 && i%4==0){
                toplam = toplam+i;
                kacTane=(kacTane+1);
                System.out.println(kacTane);
            }
        }
        System.out.println("Ortalama: "+toplam);
    }
}
