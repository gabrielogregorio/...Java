package com.decisao;

import java.util.Scanner;

public class decisao {
	public static void main(String[] args) {

		System.out.println("Digite um número: ");
		Scanner in = new Scanner(System.in);

		int num;
		num = in.nextInt();
		
		if (num == 1) {
			System.out.println("O número é igual a 1");
		}else {
			System.out.println("O número digitado não é igual a 1");
		}
		
	}
}
