package oJogoMatematicoDePaula;

import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
	
	static char[] letras;
	
	public static void main(String args[]) {
		
		int cont = 0;                                       
		Scanner scan = new Scanner(System.in);
		int quantTestes = Integer.parseInt(scan.nextLine());
		int[] numerosDeSaida = new int[quantTestes];		
		
		for(int i=0; i < quantTestes;i++){
			
			letras = scan.nextLine().toCharArray();         
			int num1 = Integer.parseInt(letras[cont]+"");  
			char letra = letras[cont+1]; 			    
			int num2 = Integer.parseInt(letras[cont+2]+""); 
			
			
			if(num1 == num2){  
				numerosDeSaida[i] = num1 * num2;
			
		
				
			}else if(Character.isUpperCase(letra) == true){
					numerosDeSaida[i] = num2 - num1;
				
			}else if(Character.isLowerCase(letra) == true){
					numerosDeSaida[i] = num2 + num1;
			}
			
		}
		
		
		for(int ind=0; ind < numerosDeSaida.length; ind++){
			System.out.println(numerosDeSaida[ind]);
		}
	
	}
	
}