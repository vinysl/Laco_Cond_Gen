package Pratica;

import java.util.Scanner;

public class LacoCondIf2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num;
		
		System.out.println("\nDigite um número: ");
		num = leia.nextInt();
		
		if (num % 2 == 0 && num > 0) {
			System.out.println("\nO número é par e positivo. ");
		}
		else if (num % 2 == 0 && num < 0) {
			System.out.println("\nO número é par e negativo. ");
		}
		else if (num % 2 == 1 && num < 0) {
			System.out.println("\nO número é impar e negativo");
		}
		else if (num % 2 == 1 && num > 0) {
			System.out.println("\nO número é impar e positivo. ");
		}

}
}
