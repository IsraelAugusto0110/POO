package com.fatec;

import java.util.ArrayList;

public class Agenda {
	
	public String id, nome, dia, mes, texto, tipoServico;
	public int indice;
	/*usarei apenas dia e mes para simplificar :)*/
	
	ArrayList<String> listaDeAgendamentos = new ArrayList<String>();
	
	Controle controle = new Controle();
	
	public void agendarServiço() {
		System.out.print("Id: ");
		id = controle.texto();
		System.out.print("Nome: ");
		nome = controle.texto();
		System.out.print("Dia: ");
		dia = controle.texto();
		System.out.print("Mes: ");
		mes = controle.texto();
		System.out.print("Tipo de serviço: ");
		tipoServico = controle.texto();
		texto ="Id: "+ id +" Nome: "+ nome.toUpperCase()+" Dia: " + dia+" Mes: " + mes + " Serviço: " + tipoServico.toUpperCase();
		listaDeAgendamentos.add(texto);
		System.out.println("agendamento feito com sucesso." + texto);
	}
	
	public void cancelarAgenda() {
		System.out.print("Qual indice deseja remover: ");
		indice = controle.indice();
		listaDeAgendamentos.remove(indice);
		System.out.println("Sucesso.");
	}
	
	public void imprimeLista() {
		for(String s : listaDeAgendamentos) {
			System.out.println(s + "\n");
		}
	}
}
