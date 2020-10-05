package com.fatec;

import java.util.ArrayList;
import java.util.Scanner;

public class Carro {
	
	public String numeroPlaca, modeloVersao;
	public int anoFabricacao;
	public double valorCompra;
	EscritorLeitor el = new EscritorLeitor();
	
	Controle controle = new Controle();
	
	static ArrayList<String> listaCarros = new ArrayList<String>();
	
	public static ArrayList<String> getListaCarros() {
		return listaCarros;
	}
	public static void setListaCarros(ArrayList<String> listaCarros) {
		Carro.listaCarros = listaCarros;
	}
	public String getNumeroPlaca() {
		return numeroPlaca;
	}
	public void setNumeroPlaca(String numeroPlaca) {
		this.numeroPlaca = numeroPlaca;
	}
	public String getModeloVersao() {
		return modeloVersao;
	}
	public void setModeloVersao(String modeloVersao) {
		this.modeloVersao = modeloVersao;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public double getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	
	public void novoCarro() {
		System.out.print("Numero da placa: ");
		String numeroPlaca = controle.texto();
		System.out.print("Modelo/Versao: ");
		String modeloVersao = controle.texto();
		System.out.print("ano de fabricaçao: ");
		int anoFabricacao = controle.ano();
		System.out.print("Valor: ");
		double valor = controle.valor();

		
		Carro carro = new Carro();
		carro.setNumeroPlaca(numeroPlaca);
		carro.setModeloVersao(modeloVersao);
		carro.setAnoFabricacao(anoFabricacao);
		carro.setValorCompra(valor);
		listaCarros.add(carro.carroStr());
	}
	
	public String carroStr() {
		return "Numero da placa: " + this.numeroPlaca.toUpperCase() + " Modelo/Versao: " + 
				this.modeloVersao.toUpperCase() + " ano de fabricaçao: " + this.anoFabricacao +
				" Valor: R$" + this.valorCompra;
	}
	
	public static void imprimelista() {
		for(String s : listaCarros) {
			System.out.println(s);
		}
	}
	
	public void escreverCarro() throws Exception {
		String texto = "" + this.getListaCarros();
		EscritorLeitor.escreverCarro(texto);
	}
}
