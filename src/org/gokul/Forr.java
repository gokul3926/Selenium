package org.gokul;

public class Forr {

	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {
			for (int j = 5-i; j >=0; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(k+ " ");
			}
			System.out.println();

		}
	
		for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 5-i; j++) {
			System.out.print(" ");
			
		}	
		for (int k = 0; k<=i; k++) {
			System.out.print("* ");
			
		}
		System.out.println();
		}
		
		}
	}
	

