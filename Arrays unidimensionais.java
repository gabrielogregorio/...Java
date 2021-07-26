package com.arrays;

public class arrays {
	public static void main(String[] args) {
		int[] arrint = new int[10];

        /* Os itens foram inicializados com zero */
		for (int x = 0; x < arrint.length; x++) {
			System.out.printf("%5d %7d\n",x,arrint[x]);			
		}

	    /* Também podemos declarar assim. quantidade e valores */
		int[] valores = {1, 3, 5, 6, 7, 8};

        /* Inserindo valores */
		valores[0] = 2;
		System.out.println(valores[0]);

        /* Fazendo uma soma e vendo o tamanho do vetor */
		int soma  = 0;
		for (int s = 0; s < valores.length; s++) {
			soma += valores[s];
		}

		/* Força o valor a ser lido como float */
		System.out.println((float)soma);
	}
}
