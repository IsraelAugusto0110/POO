package com.fatec;

import java.util.Scanner;

public class Controle {
	public Scanner scan;

	public Controle() {
		scan = new Scanner(System.in);
	}
	
	public int opcao() {
		int op = scan.nextInt();
		scan.reset();
		return op;
	}
	
	public String texto() {
		String t = scan.nextLine();
		scan.reset();
		return t;
	}
	
	public int ano() {
		int ano = scan.nextInt();
		scan.reset();
		return ano;
	}
	
	public int indice() {
		int indice = scan.nextInt();
		scan.reset();
		return indice;
	}
	
	public double valor() {
		double valor = scan.nextDouble();
		scan.reset();
		return valor;
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		scan.close();
	}
}
