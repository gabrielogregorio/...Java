package com.labels_em_blocos_de_intrucoes;

public class labels_em_blocos_de_intrucoes {
	public static void main(String[] args) {

		label1:{

			System.out.println("Label 1");			
			label2:{

				System.out.println("Label 2");
				label3:{

					System.out.println("Label 3");
					if (true)
						break label2;
				}
				System.out.println("Label 2 fim");				
			}
		}
	}
}
