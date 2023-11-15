package Pratica;

import java.util.Scanner;

public class LacoCondSwitch1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int op, qtd;
		double valor=0;
		
		System.out.println("\n\tBem vindo ao menu da lanchonete, faça abaixo o seu pedido: ");
		System.out.println("\n(1) CACHORRO QUENTE | R$ 10,00");
		System.out.println("\n(2) X-SALADA | R$ 15,00");
		System.out.println("\n(3) X-BACON QUENTE | R$ 18,00");
		System.out.println("\n(4) BAURU | R$ 12,00");
		System.out.println("\n(5) REFRIGERANTE | R$ 8,00");
		System.out.println("\n(6) SUCO DE LARANJA | R$ 13,00");
		System.out.println("\n(0) ENCERRAR");
		op = leia.nextInt();
		
		
		while (op !=0) {
		
			switch (op) {
			case 1:
				System.out.println("\nCACHORRO QUENTE | R$ 10,00");
				valor += 10.00;
				break;
				
			case 2:
				System.out.println("\nX-SALADA | R$ 15,00");
				valor += 15.00;
				break;
				
			case 3:
				System.out.println("\nX-BACON QUENTE | R$ 18,00");
				valor += 18.00;
				break;
				
			case 4:
				System.out.println("\nBAURU | R$ 12,00");
				valor += 12.00;
				break;
				
			case 5:
				System.out.println("\nREFRIGERANTE | R$ 8,00");
				valor += 8.00;
				break;
				
			case 6:
				System.out.println("\nSUCO DE LARANJA | R$ 13,00");
				valor += 13.00;
				break;
				
			case 0:
				System.out.println("\nENCERRAR");
				break;
				default:
					System.out.println("\nOpção Inválida!!! ");
				
			}
			
			System.out.println("\nValor atual do pedido: R$ "+valor);
			System.out.println("\nEscolha outro item o digite 0 para encerrar: ");
			op = leia.nextInt();
			
	}
		
			System.out.println("\nO total do pedido ficou R$: "+valor);	
			System.out.println("\nPedido encerrado, obrigado!!! :)");

}
}
