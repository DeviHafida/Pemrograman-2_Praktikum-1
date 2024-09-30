package com.praktikum1;

import java.util.Scanner;
import java.util.Locale;

public class Soal_1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Nama Lengkap: ");
        String namaLengkap = input.nextLine();
        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = input.nextLine();
        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggalLahir = input.nextInt();
        System.out.print("Masukkan Bulan Lahir: ");
        int bulanLahir = input.nextInt();
        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = input.nextInt();
        System.out.print("Masukkan Tinggi Badan: ");
        int tinggiBadan = input.nextInt();
        System.out.print("Masukkan Berat Badan: ");
        double beratBadan = input.nextDouble();
        
        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        String bulan = namaBulan[bulanLahir - 1];
        
        System.out.printf("\nNama Lengkap %s, Lahir di %s pada Tanggal %d %s %d\n", namaLengkap, tempatLahir, tanggalLahir, bulan, tahunLahir);
        System.out.printf("Tinggi Badan %d cm dan Berat Badan %.2f kilogram.\n", tinggiBadan, beratBadan);
        input.close();
	}
}
