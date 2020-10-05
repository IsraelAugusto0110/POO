package com.fatec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("unused")
public class Principal {

	public static void main(String[] args) throws Exception{
				
		Controle controle = new Controle();
		
		ListaClientes lista = new ListaClientes();
		
		int escolha = 0;
		
		String id;
		
		Menu.mostraMenu();
		
		String cliente;
		
		DataBase db = new DataBase();
		
		while(escolha != 8) {
			escolha = controle.opcao();
			
			switch (escolha) {
			case 1:
				Cliente c = lista.novoCliente();
				lista.insere(c);
				break;
				
			case 2:
				System.out.print("Qual id deseja modificar? ");
				id= controle.id();
				lista.modifica(id);
				break;
				
			case 3:
				System.out.print("Qual id deseja remover? ");
				id= controle.id();
				lista.remove(id);
				break;
				
			case 4:
				lista.ordenarLista();
				break;
				
			case 5:
				lista.salvarLista();
				break;
				
			case 6:
				EscritorLeitor.ler();
				break;
			case 7:
				lista.insereProdutos();
				break;
				
			default:
				break;
			}
			System.out.println();
			if(escolha != 8) {
				Menu.mostraMenu();
			}
		}

		System.out.println("Fim");
	}

}
