package com.fatec;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		Controle controle = new Controle();
		Cliente cliente = new Cliente();
		Carro carro = new Carro();
		Compra compra = new Compra();
		Agenda agenda = new Agenda();
		
		
		int escolha = 0;
		
		Menu.mostraMenu();
		
		while(escolha != 7) {
			escolha = controle.opcao();
			
			switch (escolha) {
			case 1:
				/*apenas o cliente, por exemplo, no momento da visita a loja nao
				 * tem o modelo de carro que o cliente deseja, porem este gostou do atendimento
				 * e entao deixou seus dados de contato para que a empresa possa agendar uma nova visita
				 * assim que estiver disponivel*/
				cliente.insereNovoCliente();
				break;
				
			case 2:
				/*somente o carro, por exemplo, novos carros que vem da fabrica
				 * precisam ser cadastrados no inventario*/
				carro.novoCarro();
				break;
			case 3:
				compra.novaCompra(); //cliente + veiculo
				break;
			case 4:
				agenda.agendarServiço();
				break;
			case 5:
				agenda.cancelarAgenda();
				break;
			case 6:
				cliente.escreverCliente();
				carro.escreverCarro();
				compra.escreverCompra();
				agenda.escreverServicos();
				System.out.println("Salvo com sucesso.");
				break;

			default:
				break;
			}
			System.out.println();
			if(escolha != 7) {
				Menu.mostraMenu();
			}
		}
		
		System.out.println("Imprimindo relatorios...\n");
		System.out.println("Novos clientes:");
		EscritorLeitor.lerClientes();
		System.out.println("\nCarros no estoque:");
		EscritorLeitor.lerCarros();
		System.out.println("\nNovas compras:");
		EscritorLeitor.lerVendas();
		System.out.println("\nServiços:");
		EscritorLeitor.lerServicos();
		System.out.println("Obrigado.");
		
	}

}
