package ageByYearsExercises;

import java.util.Locale;
import java.util.Scanner;

public class ageByYears {

	public static void main(String [] args) {
		/*
		 Fa�a um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
		mostre-a expressa em dias. Leve em considera��o o ano com 365 dias e o m�s com 30.
		(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
		*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		 
		System.out.println("digite a sua idade apenas em anos:?");
		double years = sc.nextInt();
		
		System.out.println("digite a sua idade apenas em meses:?");
		double moths = sc.nextInt();
		
		System.out.println("digite a sua idade apenas em dias:?");
		double days = sc.nextInt();
		
		days =( days + ( years * 365) + (moths * 30));
		
		System.out.println( " a sua idade em dias �: " + days );
		
		sc.close();
		
	}
}
