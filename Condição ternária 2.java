package com.operador_ternario_II;
import java.util.Scanner;

public class operador_ternario {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Qual é o seu dia da semana favorito: ");
		System.out.print("1 para segunda e 7 para domingo. ");
		int num = in.nextInt();
		
		String dia =  (num == 1) ? "Segunda-Feira" :
					  (num == 2) ? "Terça-Feira" :
					  (num == 3) ? "Quarta-Feira" :
					  (num == 4) ? "Quinta-Feira" :
             	 	  (num == 5) ? "Sexta-Feira" :
                 	  (num == 6) ? "Sábado-Feira" :
                 	  "Domingo";
		
 		// é mais recomendado que as operações ternárias.
 		switch (num) { 		
 			case 1 : dia = "segunda";
 			case 2 : dia = "terça";
 			case 3 : dia = "quarta";
 			case 4 : dia = "quinta";
			default: dia = "Dia inválido";					
 		}
		System.out.println("O dia escolhido foi "+ dia);
	}

}
