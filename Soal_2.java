package com.praktikum1;

import java.util.Scanner;

public class Soal_2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Angka Awal: ");
		int angkaAwal = input.nextInt();
		
		int count = 0;
		
		while (count < 10) {
			if (angkaAwal % 5 == 0) {
				int hasil = (angkaAwal / 5) - 1;
				System.out.print(hasil + ", ");
			} else {
				System.out.print(angkaAwal + ", ");
			}
			angkaAwal++;
			count++;
		}
		
		input.close();
  }
}