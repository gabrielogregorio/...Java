package com.formatacao;

public class formatar {
	public static void main(String[] args) {

		int[] array = new int[10];
		
		for (int x = 0; x < array.length; x++) {
			System.out.printf("| %5d %3s %5s | \n",x," | ",array[x]);
			x++;
		}
	}
}
