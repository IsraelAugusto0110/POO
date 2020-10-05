package com.fatec;

import java.util.ArrayList;

public class Compra {
	Cliente cliente = new Cliente();
	Carro carro = new Carro();
	Controle controle = new Controle();
	EscritorLeitor el = new EscritorLeitor();
	
	public String client, car;
	
	static ArrayList<String> compras = new ArrayList<String>();
	
	
	
	public static ArrayList<String> getCompras() {
		return compras;
	}

	public static void setCompras(ArrayList<String> compras) {
		Compra.compras = compras;
	}

	public String novaCompra() {
		System.out.println("Insira os dados do Cliente: ");
		System.out.print("Nome: ");
		String nome = controle.texto();
		System.out.print("Cpf: ");
		String cpf = controle.texto();
		client = "Nome: " + nome.toUpperCase() + " Cpf: " + cpf;
		System.out.println("Insira os dados do veiculo: ");
		System.out.print("Modelo: ");
		String modelo = controle.texto();
		System.out.print("Valor: ");
		double valor = controle.valor();
		car = "Modelo: " + modelo.toUpperCase() + " Valor R$" + valor;
		String compra = client + "\n" + car;
		compras.add(compra);
		return compra;
	}
	
	public static void imprimeLista() {
		for(String s : compras) {
			System.out.println(s + "\n");
		}
	}
	
	public void escreverCompra() throws Exception{
		String lista = "" + this.getCompras();
		EscritorLeitor.escreverVenda(lista);
	}
	
}
