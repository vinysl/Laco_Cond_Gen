package Pratica;

import java.util.Scanner;

public class LacoCondSwitch3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float num1, num2,result=0;
		int op;
		
		System.out.println("\nDigite o primeiro número: ");
		num1 = leia.nextFloat();
		System.out.println("\nDigite o segundo número: ");
		num2 = leia.nextFloat();
		
		System.out.println("\n\tEscolha a operação matemática a ser realizada: ");
		System.out.println("\n\t(1) SOMA: ");
		System.out.println("\n\t(2) SUBTRAÇÃO: ");
		System.out.println("\n\t(3) MULTIPLICAÇÃO: ");
		System.out.println("\n\t(4) DIVISÃO ");
		op = leia.nextInt();
		
		switch (op) {
		case 1:
			result = num1 + num2;
			System.out.println("\n "+num1+" + "+num2+" = "+result);
			break;
			
		case 2:
			result = num1 - num2;
			System.out.println("\n "+num1+" - "+num2+" = "+result);
			break;
			
		case 3:
			result = num1 * num2;
			System.out.println("\n "+num1+" X "+num2+" = "+result);
			break;
			
		case 4:
			result = num1 / num2;
			System.out.println("\n "+num1+" / "+num2+" = "+result);
			break;
			default:
				System.out.println("\nOperação inválida!!! ");
			
		}
		

	}

}
