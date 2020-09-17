package com.fatec;

import java.util.Scanner;

public class Controle{
	public Scanner scan;

	public Controle() {
		scan = new Scanner(System.in);
	}
	
	public int opcao() {
		int op = scan.nextInt();
		return op;
	}
	
	public String texto() {
		String t = scan.nextLine();
		scan.reset();
		return t;
	}
	
	public int indice() {
		int indice = scan.nextInt();
		return indice;
	}
	
	public String id() {
		String id = scan.next();
		return id;
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		scan.close();
	}
}
