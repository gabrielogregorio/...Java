package com.array_multidimensional;

public class array_multidimensional {
	public static void main(String[] args) {
		
		/* Define um array com se fosse linha e coluna */
		int[][] tabela = new int[5][5];

        /* Atribui um valor a posição */		
		tabela[0][0] = 25;
		tabela[3][2] = 4;

		System.out.println(tabela[0][0]);

        /* Outra forma de criar array multidimensional */		
		int[][] tabela2 = {
				{1,2,3},
				{2,3,4},
				{5,6,7}};
		
		System.out.println(tabela2[2][2]);
	}
}
