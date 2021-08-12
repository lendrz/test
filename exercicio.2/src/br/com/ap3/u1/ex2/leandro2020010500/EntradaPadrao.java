package br.com.ap3.u1.ex2.leandro2020010500;

import java.util.Scanner;

public class EntradaPadrao {

	public static void main(String[] args) {
		Scanner entradaPadrao = new Scanner(System.in);
		int i = 0, maioresDeIdade = 0;
		int[] idade = new int[4096];

		for (i = 0; i < 4096; i++) {
			System.out.println("Digite a idade da pessoa " + (i + 1) + ":");
			idade[i] = entradaPadrao.nextInt();

			if (idade[i] >= 18) {
				maioresDeIdade = maioresDeIdade + 1;
			}
		}
		
		System.out.println("Há " +maioresDeIdade+ " maiores de idade");
		entradaPadrao.close();
	}
}
