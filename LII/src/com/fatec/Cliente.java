package com.fatec;

import java.util.ArrayList;

public class Cliente {
	public String nome, telefone, endereco, cpf;
	Carro carro = new Carro();
	EscritorLeitor el = new EscritorLeitor();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String clienteStr() {
		return "Nome: " + this.nome.toUpperCase() + " Telefone: " + this.telefone + 
				" Endereço: " + this.endereco.toUpperCase() + " CPF: " + this.cpf;
	}
	
	static ArrayList<String> listaClientes = new ArrayList<String>();
	
	
	
	public static ArrayList<String> getListaClientes() {
		return listaClientes;
	}

	public static void setListaClientes(ArrayList<String> listaClientes) {
		Cliente.listaClientes = listaClientes;
	}

	Controle controle = new Controle();
	
	public void insereNovoCliente() {
		System.out.print("Insira o nome: ");
		String nome = controle.texto();
		System.out.print("Telefone: ");
		String telefone = controle.texto();
		System.out.print("Endereço: ");
		String endereco = controle.texto();
		System.out.print("Cpf: ");
		String cpf = controle.texto();
		
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setTelefone(telefone);
		cliente.setEndereco(endereco);
		cliente.setCpf(cpf);
		
		listaClientes.add(cliente.clienteStr());
	}
	
	public static void imprimeLista() {
		for(String s : listaClientes) {
			System.out.println(s);
		}
	}
	
	public void escreverCliente() throws Exception {
		String lista = "" + this.getListaClientes();
		EscritorLeitor.escreverCliente(lista);
	}
	
}
