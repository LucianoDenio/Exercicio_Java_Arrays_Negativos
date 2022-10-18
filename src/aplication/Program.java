package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números deseja digitar ? ");
		int n = sc.nextInt();
		
		double [] vect = new double [n];
		for(int i=0;i<vect.length;i++) {
			System.out.print("digite um número: ");
			vect[i] = sc.nextInt();
		}
		System.out.println("NÚMEROS NEGATIVOS: ");
		for(int i=0;i<vect.length;i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		sc.close();
	}

}
