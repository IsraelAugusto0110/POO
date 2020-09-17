package com.fatec;

public class Cliente{

	public String id, nome;
	
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
