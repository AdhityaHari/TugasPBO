package Tugas;

public class GanjilGenap {
    public static void main(String[] args) {
        int[] arr = {3,5,6,32,43,123,348,1210,1232,232432,327523,23786,1234567891,};
        System.out.println("Menentukan bilangan Ganjil dan Genap pada Array");
        System.out.print("Bilangan Genap : ");
        for(int x=0; x<arr.length; x++) {
            if(arr[x]% 2 == 0) {
                System.out.print(arr[x] + " ");
            }
        }
        System.out.println("");
        System.out.print("Bilangan Ganjil : ");
        for(int x=0; x<arr.length; x++) {
            if(arr[x] % 2!=0) {
                System.out.print(arr[x] +" ");
            }
        }
        System.out.println("");
        System.out.println("-------------------------------------------");
    }
}
