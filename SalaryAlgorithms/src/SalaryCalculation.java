import java.util.Locale;
import java.util.Scanner;

public class SalaryCalculation {
	public static void main(String[] args) {
		/*
		 Crie um algoritmo que leia o valor do sal�rio m�nimo e o valor do sal�rio de um usu�rio,
		calcule a quantidade de sal�rios m�nimos esse usu�rio ganha e imprima o resultado.
		(1 salario minimo = $ 788,00)
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		 double salarioMinimo = 788.00f;
		 double counter;
		
		System.out.println("indique o seu salario:?");
		double salaryUser = sc.nextDouble();
		
		
		//double SalaryAmount = SalaryUser - SalarioMinimo;
		
		for(counter = salaryUser; counter >= salarioMinimo ; counter -= 1 ) {
			System.out.println(counter);
		}
		
		// System.out.println(" os sal�rios m�nimos s�o: " + SalaryAmount);
		
		
		sc.close();

	}

}
