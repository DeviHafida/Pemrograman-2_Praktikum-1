package com.praktikum1;

import java.util.Locale;

import java.util.Scanner;

public class Soal_5 {
	
	public static final double PHI = 3.14;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan jari-jari: ");
		double jariJari = input.nextDouble();
		System.out.print("Masukkan tinggi: ");
		double tinggi = input.nextDouble();
		
		double volume = PHI * jariJari * jariJari * tinggi;
		
		System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3", jariJari, tinggi, volume);
		
        input.close();
	}
}