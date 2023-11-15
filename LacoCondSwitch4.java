package Pratica;

import java.util.Scanner;

public class LacoCondSwitch4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float saldo = 1000, novoSaldo;
		int codigo;
		
		System.out.println("\n\t\tBem vindo ao menu do banco!!! ");
		System.out.println("\n\t\t\t(1) Saldo: ");
		System.out.println("\n\t\t\t(2) Saque: ");
		System.out.println("\n\t\t\t(3) Depósito: ");
		System.out.println("\n\t\t\t(0) Encerrar: ");
		codigo = leia.nextInt();
		
		switch (codigo) {
		case 1:
			System.out.println("\nSaldo: ");
			System.out.println("\nSeu saldo é de R$: "+saldo);
			break;
			
		case 2:
			System.out.println("\nSaque: ");
			System.out.println("\nDigite o valor a ser sacado R$: ");
			float saque = leia.nextFloat();
			if (saque < saldo) {
				System.out.println("\nO valor de "+saque+" foi sacado! ");
				novoSaldo = saldo - saque;
				System.out.println("\nO saldo atual é de R$ "+novoSaldo);
			} else {
				System.out.println("\nSaldo insuficiente! seu saldo atual é de R$ "+saldo);
			}
			break;
			
		case 3:
			System.out.println("\nDepósito: ");
			System.out.println("\nDigite o valor a ser depositado R$: ");
			float deposito = leia.nextFloat();
			System.out.println("\nO valor de R$ "+deposito+" foi depositado.");
			novoSaldo = saldo + deposito;
			System.out.println("\nO saldo atual é de R$: "+novoSaldo);
			break;
			
		case 0:
			System.out.println("\nOperação encerrada!!! ");
			break;
			default:
				System.out.println("\nOperação inválida!!! ");
				
				
		}

	}

}
