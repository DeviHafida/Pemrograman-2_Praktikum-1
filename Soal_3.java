package com.praktikum1;

import java.util.Scanner;

public class Soal_3 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Baris (N): ");
        int N = input.nextInt();

        System.out.print("Masukkan Bilangan Awal: ");
        int bilangan = input.nextInt();

        int count = 0;

        do {
            if (bilangan % 2 != 0) {
                System.out.print(bilangan + ", ");
                count++; 
            }
            bilangan++; 
        } while (count < N); 
        input.close();
	}
}