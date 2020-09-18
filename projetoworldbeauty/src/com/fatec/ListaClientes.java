package com.fatec;

import java.io.Serializable;
import java.util.ArrayList;
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
	
	public void imprimeLista() {
		System.out.println(separador);
		for(Cliente c: clientes) {
			System.out.println(c);
		}
		System.out.println(" ");
		System.out.println(separador);
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
	
	//gera um numero de id aleatorio para idnetificar cada cliente
	public int geraID(){
		int id = random.nextInt(1000);
		return id;
	}
	
	public void salvarLista() throws Exception {
		for (Cliente c : this.clientes) {
			String cliente = "Id: " + c.id + ", Nome: " + c.nome;
			EscritorLeitor.escrever(cliente);
		}
		System.out.println("Salvo com sucesso");
	}
}
