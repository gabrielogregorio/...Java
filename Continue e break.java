package com.bloco_continue;

public class bloco_continue {

	public static void main(String[] args) {

		/* Loop para demonstrar o conceito */
		for (int i = 0; i<1000; i++) {

			if (i == 10)
				/* Pula para o próximo ciclo */
				continue;

			System.out.println(i);
			
			if (i == 20)
				/* Interrompe o ciclo */
				break;

		}
	}
}
