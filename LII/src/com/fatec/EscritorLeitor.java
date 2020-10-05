package com.fatec;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EscritorLeitor {
	
	static String caminho;

	public static void escreverCliente(String texto) throws Exception{
		caminho = "C:\\Users\\israelaugusto\\Desktop\\Clientes.txt";
		FileWriter escritor = new FileWriter(caminho);
		escritor.write(texto);
		escritor.close();
	}
	
	public static void escreverCarro(String texto) throws Exception{
		caminho = "C:\\Users\\israelaugusto\\Desktop\\Carros.txt";
		FileWriter escritor = new FileWriter(caminho);
		escritor.write(texto);
		escritor.close();
	}
	
	public static void escreverVenda(String texto) throws Exception{
		caminho = "C:\\Users\\israelaugusto\\Desktop\\Vendas.txt";
		FileWriter escritor = new FileWriter(caminho);
		escritor.write(texto);
		escritor.close();
	}
	
	public static void escreverServico(String texto) throws Exception{
		caminho = "C:\\Users\\israelaugusto\\Desktop\\Servicos.txt";
		FileWriter escritor = new FileWriter(caminho);
		escritor.write(texto);
		escritor.close();
	}
	
	public static void lerClientes() throws Exception{
		caminho = "C:\\Users\\israelaugusto\\Desktop\\Clientes.txt";
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
	
	public static void lerCarros() throws Exception{
		caminho = "C:\\Users\\israelaugusto\\Desktop\\Carros.txt";
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
	
	public static void lerVendas() throws Exception{
		caminho = "C:\\Users\\israelaugusto\\Desktop\\Vendas.txt";
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
	
	public static void lerServicos() throws Exception{
		caminho = "C:\\Users\\israelaugusto\\Desktop\\Servicos.txt";
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
