package basicProgramming;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        int bilangan;

        Scanner a = new Scanner(System. in );
        System.out.println("Masukkan angka");

        int nilai = a.nextInt();

        System.out.println("Faktor-faktornya:");
        int tambah = 0;
        for (int x = 0; x <= nilai; x++) {
            tambah++;
            if (nilai % tambah == 0) {
                System.out.print(tambah + " "); // yg muncul hanya bilangan bulat
            }
        }
    }
}
