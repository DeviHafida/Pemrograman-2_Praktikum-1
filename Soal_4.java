package com.praktikum1;

import java.util.Scanner;

public class Soal_4 {
	    public static void main(String[] args) {
	    	Scanner input = new Scanner(System.in);
	        
	        System.out.print("Tangan Abu: ");
	        String abu = input.nextLine().toUpperCase(); 
	        System.out.print("Tangan Bagas: ");
	        String bagas = input.nextLine().toUpperCase(); 

	        int poinAbu = 0;
	        int poinBagas = 0;

	        for (int i = 0; i < 3; i++) {
	            char tanganAbu = abu.charAt(i);
	            char tanganBagas = bagas.charAt(i);
	            
	            if (tanganAbu == tanganBagas) {
	                continue;
	            } else if ((tanganAbu == 'B' && tanganBagas == 'G') || 
	                       (tanganAbu == 'G' && tanganBagas == 'K') || 
	                       (tanganAbu == 'K' && tanganBagas == 'B')) {
	                poinAbu++;
	            } else {
	                poinBagas++;
	            }
	        }

	        if (poinAbu > poinBagas) {
	            System.out.println("Abu");
	        } else if (poinBagas > poinAbu) {
	            System.out.println("Bagas");
	        } else {
	            System.out.println("Seri");
	        }

	        input.close();
	    }
	}
