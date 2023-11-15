package Pratica;

import java.util.Scanner;

public class LacoCondSwitch2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome, cargo;
		int codigo;
		float salario, novoSalario=0;
		
		System.out.println("\nDigite o nome do colaborador: ");
		nome = leia.nextLine();
		
		System.out.println("\nDigite o código do cargo do colaborador: ");
		System.out.println("\n(1) Gerente: ");
		System.out.println("\n(2) Vendedor: ");
		System.out.println("\n(3) Supervisor: ");
		System.out.println("\n(4) Motorista: ");
		System.out.println("\n(5) Estoquista: ");
		System.out.println("\n(6) Técnico de TI: ");
		codigo = leia.nextInt();
		
		System.out.println("\nDigite o salário do colaborador: ");
		salario = leia.nextFloat();
		
		switch (codigo) {
		case 1:
			cargo = "Gerente"; // cargo = "" serve para sair na impressão o cargo escrito e não o código.
			novoSalario = 1.1f * salario;
			break;
			
		case 2:
			cargo = "Vendedor";
			novoSalario = 1.07f * salario;
			break;
			
		case 3:
			cargo = "Supervisor";
			novoSalario = 1.09f * salario;
			break;
			
		case 4:
			cargo = "Motorista";
			novoSalario = 1.06f * salario;
			break;
			
		case 5:
			cargo = "Estoquista";
			novoSalario = 1.05f * salario;
			break;
			
		case 6:
			cargo = "Técnico de TI";
			novoSalario = 1.08f * salario;
			break;
			default:
				System.out.println("\nOpção inválida!!! ");
				return;
			
		}
		
		System.out.printf("\nO calaborador "+nome+" tem o cargo de "+cargo+" e seu salário reajustado é de R$ %.2f",novoSalario); // %.2f = limitar casas decimais a duas depois da virgula.

	}

}
