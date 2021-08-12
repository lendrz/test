package br.com.ap3.u1.ex2.leandro2020010500;

import java.util.Scanner;

public class Multa{
	public static void main(String[] args) {
		Scanner entradaPadrao = new Scanner(System.in);
		
		int velocidadeMaxima, velocidadeMotorista, valorMulta = 0;

		System.out.println("Digite a velocidade máxima permitida nesta avenida:");
		velocidadeMaxima = entradaPadrao.nextInt();
		
		System.out.println("Digite a velocidade em que o motorista passou pela avenida:");
		velocidadeMotorista = entradaPadrao.nextInt();
		
		if (velocidadeMotorista <= velocidadeMaxima) {
			System.out.println("O motorista não ultrapassou a velocidade máxima permitida.");
		}
		
		else if(velocidadeMotorista <= velocidadeMaxima + 10 && velocidadeMotorista >= velocidadeMaxima + 1) {
			valorMulta = 50;
			System.out.println("Multa no valor de: "+ valorMulta + "R$");
		}
		else if(velocidadeMotorista <= velocidadeMaxima + 30 && velocidadeMotorista >= velocidadeMaxima + 11){
			valorMulta = 100;
			System.out.println("Multa no valor de: "+ valorMulta + "R$");
		}
		if (velocidadeMotorista >= velocidadeMaxima + 31) {
			valorMulta = 200;
			System.out.println("Multa no valor de: "+ valorMulta + "R$");
		}
		
		
		
		entradaPadrao.close();
		
	}
}