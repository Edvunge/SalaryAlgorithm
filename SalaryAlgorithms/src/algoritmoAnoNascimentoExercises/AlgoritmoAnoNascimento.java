package algoritmoAnoNascimentoExercises;

import java.util.Scanner;

public class AlgoritmoAnoNascimento {
	public static void main(String[] args) {
		/*
		 escreva um algoritmo que leia o ano de nascimento de uma pessoa 
		e apresente uma linha do tempo, mostrando cada ano de vida da pessoa e 
		quantos anos ela tinha em cada ano 
		- até o ano atual (ex: anoNascimento = 2020; " 2021 - 1 ano, 2022 - 2 anos ").
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int anoNascimento;
		int AnoActual = 2021;
		
		System.out.println(" qual é o seu ano de nascimento?");
		anoNascimento = sc.nextInt();
		
		int idade = AnoActual - anoNascimento;
		
		for ( int anoTemporario = anoNascimento;   anoNascimento == AnoActual;   anoNascimento -= 1){
		 System.out.println(anoTemporario + " -  " + " ");
		}
		
		System.out.println("saiu do for.");
		System.out.println(idade);
		
		sc.close();
		}
}
