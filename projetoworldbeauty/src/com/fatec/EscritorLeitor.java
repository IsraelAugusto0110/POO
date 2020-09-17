package com.fatec;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EscritorLeitor{
	
	static String caminho = "C:\\Users\\israelaugusto\\Desktop\\Clientes.txt";
	
	ListaClientes lista = new ListaClientes();
	
	public static void escrever(String texto) throws Exception{
		FileWriter escritor = new FileWriter(caminho);
		escritor.write(texto);
		escritor.close();
	}
	
	public static void ler(){
		System.out.println("Cadastros lidos");
	}
}
