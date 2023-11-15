package Pratica;

import java.util.Scanner;

public class LacoCondIf1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num1,num2,num3,soma;
		
		System.out.println("\nDigite o primeiro valor: ");
		num1 = leia.nextInt();
		System.out.println("\nDigite o segundo valor: ");
		num2 = leia.nextInt();
		System.out.println("\nDigite o terceiro valor: ");
		num3 = leia.nextInt();
		
		soma = num1 + num2;
		
		if (soma > num3) {
			System.out.println("\nA soma de "+(num1+num2)+" é maior do que "+num3);
		}
		else if (soma < num3) {
			System.out.println("\nA soma de "+(num1+num2)+" é menor do que "+num3);
		}
		else if (soma == num3) {
			System.out.println("\nA soma de "+(num1+num2)+" é igual a "+num3);
		}

	}

}
