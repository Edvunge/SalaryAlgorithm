package ageByYearsExercises;

import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ageByYears {

	public static void main(String [] args) {
		/*
		 Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
		mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
		(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
		*/
		

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		 
		System.out.println("digite a sua idade apenas em anos:?");
		int years = sc.nextInt();
		
		System.out.println("digite a sua idade apenas em meses:?");
		int moths = sc.nextInt();
		
		System.out.println("digite a sua idade apenas em dias:?");
		int days = sc.nextInt();
		
		days =( days + ( years * 365) + (moths * 30));
		
		System.out.println( " a sua idade em dias é: " + days );
		
		sc.close();
	
	}
}
