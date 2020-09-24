package com.fatec;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.io.Writer;

@SuppressWarnings("unused")
public class EscritorLeitor{
	
	static String caminho = "C:\\Users\\israelaugusto\\Desktop\\Clientes.txt";
	
	ListaClientes lista = new ListaClientes();
	
	public static void escrever(String texto) throws Exception{
		FileWriter escritor = new FileWriter(caminho);
		escritor.write(texto);
		escritor.close();
	}
	
	public static void ler() throws Exception{
		System.out.println("Conteudo do arquivo texto:\n");
		try {
			FileReader arq = new FileReader(caminho);
			BufferedReader lerarq = new BufferedReader(arq);
			
			String linha = lerarq.readLine();
			
			while(linha != null){
				System.out.printf("%s\n", linha);
				linha = lerarq.readLine();
			}
			
			arq.close();
			
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo %s.\n", e.getMessage());
		}
		
		System.out.println();
	}
}
