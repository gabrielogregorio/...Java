package com.random;
import java.util.Random;

public class random {
	public static void main(String[] args) {
		Random num = new Random();
		System.out.println(num.nextInt());

		// por padrão, ele gera um número entre 0 e o valor máximo passado
		// Precisamos de dar +1 para mostrar as faces de um dado por exemplo
		System.out.println(num.nextInt(6)+1 );

		// double gera número entre 0 e 0.99999
		System.out.println(num.nextDouble());

		// números entre 0 e 50
		System.out.println(num.nextDouble() * 50);

		// valores booleanos
		System.out.println(num.nextBoolean());
	}
}
