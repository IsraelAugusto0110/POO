package com.fatec;

import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Cliente implements Serializable{
	//define as informações basicas de cada cliente
	public String id, nome;
	
	public static ArrayList<String> produtos = new ArrayList<String>();
	
	@Override
	public String toString() {
		String info = "\nID: " + id + "\nNome: " + nome;
		return info;
	}

	public String getId() {
		return id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setId(String id) {
		this.id = id;
	}
}
