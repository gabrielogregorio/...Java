package com.recursividade;

public class recursividade {
	public static int somaAlgoritimosB(int num, int somaMomentanea) {
		if (num < 1)
			return somaMomentanea;
		
		somaMomentanea += (num%100);
		return somaAlgoritimosB(num/100,somaMomentanea);	
	}
	
	public static void main(String[] args) {
		int soma = somaAlgoritimosB(100000,0);
		System.out.println(soma);
	}
}
