package com.condicao_ternaria;

public class condicao_ternaria {
	public static void main(String[] args) {
		/* <variavel> = (condicao) ? <valor_condicao_verdade> : <valor_condicao_mentira>; */
		int valor = 10;
		
		String novo = (valor > 2) ? "condicao true" : "condicao else";
		System.out.println(novo);
		
		String velho = (valor < 2) ? "condicao true" : "condicao else";
		System.out.println(velho);
			
	}

}
