package com.constanteII;

import java.util.Scanner;

/*
 *  programa para calcular a distância que o som 
 *  vai demorar para percorrer em um determinado
 *  espaço de tempo 
*/

public class constanteII {
	public static void main(String[] args) {
		final double velocidade_do_som = 340.28; // m/s. Palavra reservada
		
		System.out.println("Digite o espaço de tempo: (s) ");		
		Scanner in = new Scanner(System.in);
		
		int tempo = in.nextInt();		
		double distancia = tempo * velocidade_do_som; 
		
		System.out.println("A distância é de " 
				+ distancia + " metros percorridos");		
		System.out.println("Isso equivale a " + distancia/1000 +" quilometros");
	}
}
