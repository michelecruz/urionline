package paresEimpares;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		int numeros[] = new int[loop];
		int[] aux1 = new int[numeros.length];
		int[] aux2 = new int[numeros.length];

		for (int j = 0; j < numeros.length; j++) {
			numeros[j] = sc.nextInt();
			if (numeros[j] % 2 == 0) {
				aux1[j] = numeros[j];
			} else {
				aux2[j] = numeros[j];
			}
		}
		Arrays.sort(aux1);
		for (int k = 0; k < aux1.length; k++) {
			if (aux1[k] != 0) {
				System.out.println(aux1[k]);
			}
		}
		ordenaImpar(aux2);
		for (int j = 0; j < aux2.length; j++) {
			if (aux2[j] != 0) {
				System.out.println(aux2[j]);
			}
		}
	}

	
	public static void ordenaImpar(int[] array) {
		for (int j = 0; j < array.length; j++) {
			int aux = array[j];
			for (int k = j - 1; k >= 0 && array[k] < aux; k--) {
				array[k + 1] = array[k];
				array[k] = aux;
			}
		}
	}
}
 
 
 
