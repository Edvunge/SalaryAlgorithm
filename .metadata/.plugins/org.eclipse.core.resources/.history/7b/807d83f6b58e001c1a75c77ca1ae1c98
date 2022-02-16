package ageByYearsExercises;

import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;
import java.util.Scanner;

public class ageByYears {

	public static void main(String [] args) {
		/*
		 Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
		mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
		(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
		*/
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite a ano do seu nascimento");
		
		int ano = s.nextInt();
		
		System.out.println("Digite o m�s do seu nascimento");
		int mes = s.nextInt();
				
		System.out.println("Digite o dia do seu nascimento");
		int dia = s.nextInt();
		
		
		LocalDate hoje = LocalDate.now();
		LocalDate anniversario = LocalDate.of(ano, mes, dia);
		int anodif = Period.between(anniversario, hoje).getYears();
		int mesdif = Period.between(anniversario, hoje).getMonths();
		int diadif = Period.between(anniversario, hoje).getDays();
		int anodif2 = anodif*365;
		int mesdif2 = mesdif*12;
		int diasdaidade= anodif2 + mesdif2 + diadif;
		System.out.println("Voc� tem " + diasdaidade + " dias da idade");
		
		
		/*
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
	*/	
	}
}
