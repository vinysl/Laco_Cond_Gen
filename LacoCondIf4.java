package Pratica;

import java.util.Scanner;

public class LacoCondIf4 {

	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome, classe = null, aliment = null;
		
		System.out.println("Escolha o tipo de animal (Vertebrado/Invertebrado): ");
		nome = leia.nextLine();
		
		System.out.println("\nEscolha a classe: Ave | Mamifero| Inseto | Anelideo ");
		classe = leia.nextLine();
		
		System.out.println("\nDefina o tipo de alimentação do animal: Cárnivoro | Onivoro | Herbivoro | Hematofago");
		aliment = leia.nextLine();
		
		if (nome.equalsIgnoreCase("vertebrado")) {
			if (classe.equalsIgnoreCase("ave")) {
				if (aliment.equalsIgnoreCase("carnivoro")) {
					System.out.println("\nO animal é a Águia! ");
				}
				else if (aliment.equalsIgnoreCase("onivoro")) {
					System.out.println("\nO animal é a Pomba! ");
			} else {
				System.out.println("\nAnimal não encontrado no banco de dados... ");
			}}
			
			else if (classe.equalsIgnoreCase("mamifero")) {
			if (aliment.equalsIgnoreCase("onivoro")) {
				System.out.println("\nO animal é o Homem! ");
			}
			else if (aliment.equalsIgnoreCase("herbivoro")) {
				System.out.println("\nO animal é a Vaca! ");
		} else {
			System.out.println("\nAnimal não encontrado no banco de dados... ");
		}
		}
		
		else if (nome.equalsIgnoreCase("invertebrado")) {
			if (classe.equalsIgnoreCase("inseto")) {
				if (aliment.equalsIgnoreCase("hematofago")) {
					System.out.println("\nO animal é a Pulga! ");
				}
				
				else if (aliment.equalsIgnoreCase("herbivoro")) {
					System.out.println("\nO animal é a Lagarta! ");
			} else {
				System.out.println("\nAnimal não encontrado no banco de dados... ");
			}}
			
			else if (classe.equalsIgnoreCase("anelideo")) {
				if (aliment.equalsIgnoreCase("hematofago")) {
					System.out.println("\nO animal é o Sanguessuga ");
				}
				else if (aliment.equalsIgnoreCase("onivoro")) {
					System.out.println("\nO animal é a Minhoca! ");
			} else {
				System.out.println("\nAnimal não encontrado no banco de dados... ");
			}
		}

	}

}}}

