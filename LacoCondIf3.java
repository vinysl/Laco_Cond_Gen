package Pratica;

import java.util.Scanner;

public class LacoCondIf3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome;
		int idade;
		boolean x;
		
		System.out.println("\nDigite o nome do doador: ");
		nome = leia.nextLine();
		
		System.out.println("\nDigite a idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("\nÉ a primeira doação de sangue? true/false");
		x = leia.nextBoolean();
		
		if (idade >=18 && idade <=59) {
			System.out.println("\n "+nome+" está apto para doar sangue!!! ");
		}
		
		if (idade < 18) {
			System.out.println("\n "+nome+" não está apto para doar sangue!!! ");
		}
		
		if (idade >= 60 && idade < 69) {
			if (x == true) {
				System.out.println("\n "+nome+" não está apto para doar sangue!!! ");
			}
			
			if (x == false) {
				System.out.println("\n "+nome+" está apto para doar sangue!!! ");
			}
		}
		
		if (idade >= 70) {
			System.out.println("\n "+nome+" não está apto para doar sangue!!!");
		}

	}

}
