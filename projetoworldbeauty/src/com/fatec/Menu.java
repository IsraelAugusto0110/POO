package com.fatec;

public class Menu {
	
	public static void mostraMenu() {
		System.out.println("1. Incluir");
		System.out.println("2. Editar");
		System.out.println("3. Excluir");
		System.out.println("4. Listar");
		System.out.println("5. Salvar");
		System.out.println("6. Carregar");
		System.out.println("7. Sair");
		System.out.print("Escolha a opçao desejada: ");
	}
	
	public static void subMenu() {
		System.out.println("1. Todos os clientes");
		System.out.println("2. Em ordem alfabetica");
		System.out.println("3. Em ordem por genero");
		System.out.print("Escolha a opçao desejada: ");
	}
}
