package createVetorExercises;

import java.util.Arrays;
import java.util.Random;

public class CreateVetor {

	/*
	 * Crie dois vetores de 50 posi??es com valores inteiros aleat?rios, ordene cada
	 * vetor individualmente, e combine os dois vetores gerando um novo vetor de 100
	 * posi??es, de forma que esse novo vetor j? seja criado ordenado
	 */

	public static void main(String[] args) {

		int num = 50;
		int vet1[] = new int[num];
		int vet2[] = new int[num];
		int x;

		Random tab = new Random();

		// gerar 50 numeros aleatorios desordenados
		for (int i = 0; i < vet1.length; i++) {

			if (i == vet1.length - 1) {
				System.out.println(vet1[i]);
				break;
			}
			vet1[i] = tab.nextInt(num);
			System.out.print(vet1[i] + "" + ",");
		}

		for (int i = 0; i < vet2.length; i++) {

			if (i == vet2.length - 1) {
				System.out.println(vet2[i]);
				break;
			}
			vet2[i] = tab.nextInt(num);
			System.out.print(vet2[i] + "" + ",");

		}
		
		// ordenando o primeiro vetor em ordem crescente. 
		ordena(vet1);
		System.out.print("\n ------Vetor1 ordenado em ordem crescente ------ \n");
		for (x = 0; x <= 48; x++)
			System.out.print(vet1[x] + " ");
		
		// ordenando o segundo vetor em ordem crescente. 
		ordena2(vet2);
		System.out.print("\n ------Vetor2 ordenado em ordem crescente ------ \n");
		for (int z = 0; z <= 48; z++)
			System.out.print(vet2[z] + " ");

	}

	public static void ordena(int v1[]) {
		int i, j, aux;
		int pos = 50;
		for (i = 0; i <= pos; i++) {

			for (j = 0; j <= 48; j++) {
				if (v1[j] > v1[j + 1]) {
					aux = v1[j];
					v1[j] = v1[j + 1];
					v1[j + 1] = aux;

				}
			}
		}
	}

	public static void ordena2(int v2[]) {
		int a, b, aux2;
		int pos1 = 50;
		for (a = 0; a <= pos1; a++) {

			for (b = 0; b <= 48; b++)

			{
				if (v2[b] > v2[b + 1]) {
					aux2 = v2[b];
					v2[b] = v2[b + 1];
					v2[b + 1] = aux2;

				}
			}
		}

	}
}
