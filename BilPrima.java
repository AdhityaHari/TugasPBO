package Tugas;

import java.util.Scanner;

public class BilPrima {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int bil, cek = 0;

        System.out.println("Menentukan Bilangan Prima Atau Bukan");
        System.out.print("Masukkan angka : ");
        bil = input.nextInt();
    
        System.out.println("---------------------------------------");
        for (int i = 2; i<=bil; i++) {
            if (bil%i==0) {
                cek++;
            }
        }
        if (cek == 1) {
            System.out.println(bil+" Adalah bilangan prima");
        }
        else {
            System.out.println(bil+" Bukan Bilangan Prima");
        }
    }
}

