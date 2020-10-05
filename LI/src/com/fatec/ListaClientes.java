package com.fatec;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
//import java.util.Collections;

@SuppressWarnings("serial")
public class ListaClientes implements Serializable{
	// cria uma lista com os clientes para que possamos fazer a busca, modificar e deletar
	
	Controle controle = new Controle();
	
	public ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	Random random = new Random();
	
	String separador = "###############";
	
	/*insere o cliente na lista*/
	public void insere(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public int getSize() {
		return clientes.size();
	}
	
	public void remove(String id) {
		for(Cliente c: this.clientes) {
			if(c.getId().equals(id)) {
				System.out.println("Cliente " + c.getNome() + " removido com sucesso.");
				clientes.remove(c);
				break;
			}
		}
		System.out.println("Nao encontrado.");
	}
	/*cria um novo cliente*/
	public Cliente novoCliente() {
		Cliente c = new Cliente();
		int ID = geraID();
		c.id = Integer.toString(ID);
		System.out.print("Por favor insira o nome: ");
		c.nome = controle.texto();
		controle = new Controle();
		return c;
	}
	
	public ArrayList<String> insereProdutos(){
		ArrayList<String> lst = new ArrayList<String>();
		int resp = 1;
		while(resp != 0) {
			Menu.subMenu();
			System.out.print("Escolha um dos items: ");
			int item = controle.opcao();
			switch (item) {
				case 1:
					lst.add("Manicure");
					break;
				case 2:
					lst.add("Pedicure");
					break;
				case 3:
					lst.add("Design de sobrancelhas");
					break;
				case 4:
					lst.add("Cabelo Femenino");
					break;
				case 5:
					lst.add("Cabelo Masculino");
					break;
				case 6:
					lst.add("Outros");
					break;
				default:
					break;
				}
			System.out.print("Deseja continuar? 1. Sim 0. Nao: ");
			resp = controle.opcao();
		}
		return lst;	
	}

	public void modifica(String id) {
		for(Cliente c: this.clientes) {
			if(c.getId().equals(id)) {
				System.out.println(c);
				System.out.print("Insira novo nome: ");
				String novoNome = controle.texto();
				c.setNome(novoNome);
				break;
			}
		}
	}
	
	//gera um numero de id aleatorio para identificar cada cliente
	// isso serve para facilitar a busca, edicao e remoçao de clientes
	// pois pelo nome pode ocorrer o usuario errar na digitaçao
	public int geraID(){
		int id = random.nextInt(1000);
		return id;
	}
	
	/*Converte cada cliente da lista 'clientes' em uma string e entao
	 *adiciona em clientesString. No fim do loop, converte a lista em 
	 *uma unica string e usa o metodo escrever para salvar os dados.
	 *Nao é muito eficiente ou bonito, mas funciona :)*/
	public void salvarLista() throws Exception {
		ArrayList<String> clientesString = new ArrayList<String>();
		for (Cliente c : this.clientes) {
			String cliente = "Id: " + c.id + ", Nome: " + c.nome + 
					", produtos/serviços: " + c.produtos;
			clientesString.add(cliente);
		}
		String clienteslista = clientesString.toString();
		EscritorLeitor.escrever(clienteslista);
		System.out.println("Salvo com sucesso");
	}
	
	/*Cria lista alfabeticamente ordenada dos clientes*/
	public void ordenarLista() {
		ArrayList<String> clientesString = new ArrayList<String>();
		for(Cliente c : this.clientes) {
			String cliente = c.nome + c.produtos;
			clientesString.add(cliente);
		}
		Collections.sort(clientesString);
		System.out.println("Imprimindo todos em ordem");
		for(String s : clientesString) {
			System.out.println(s);
		}
	}
}
