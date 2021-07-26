package com.tiposprimitivosI;

public class tiposprimitivos {
	public static void main(String[] args) {
		/*  ________________________________________________________________
		 * | tipo    | tamanho (byte) | Faixa                               |
		 * | char    |    2           | Unicode                             |
		 * | boolen  |    1           | True/False                          |
		 * | byte    |    1           | +- 128 = 2^8 => 256                 |
		 * | short   |    2           | +- 32768 = 2^16 = 65536             |
		 * | int     |    4           | +- 2147483648 = 2^32 = 4294967296   |
		 * | long    |    8           | +- 9223372036854775808              |
		 * | float   |    4           | p.flutuante: +- 3.4E - 38           |
		 * | double  |    8           | p.flutuante: +- 1.7E - 308          |
		 * |_________|________________|_____________________________________|
		 * */
		
		/* por padrão é false */
		boolean b = true; 
		
		/* caracteres é aspas simples. */
		/* o char por padrão é vazio. */
		char c = 'a';		
		char c2 = '1';
		
		/* por padrão é zero */
		/* byte oculpa 1 Byte de memória -128 a + 127 */
		Byte by = 100;
		Byte bb = 127;
		
		/* o java atribui zero */
		short camisa = 2000;
		
		int i = 1;
		
		long l;
		
		float f = 4; // ou float f = 4.0f 
		double d = 2;	
	}
}
