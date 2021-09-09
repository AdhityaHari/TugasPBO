package Tugas;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String args[]){
        int arr[] = {3,5,7,10,14,18,27,36,50};
        int kunci = 18;
        int hasil = Arrays.binarySearch(arr,kunci);
        if (hasil < 0) {
            System.out.println("angka tidak ditemukan");
        } else {
            System.out.println("angka ditemukan pada index : "+hasil);
        }
    }
}
