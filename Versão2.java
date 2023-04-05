package com.vitorcamara.projetos;

import java.util.Scanner;

public class Versão2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[][][] compromissos = new String[12][31][8]; //agora temos uma matriz tridimensional

		boolean sair = false;
		int opcao = 0;
		while (!sair) {

			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para sair.");

			opcao = scan.nextInt();

			if (opcao == 1) { 
				
				boolean mesValido = false;
				int mes = 0;
				while (!mesValido) {
					System.out.println("Entre com o mês [1 a 12]:"); 
					mes = scan.nextInt();

					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("Entre com um mês valido:");
					}
				}
				

				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Entre com o dia do mês:");
					dia = scan.nextInt();

					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Entre com um dia válido:");
					}
				}

				boolean horaValida = false;
				int hora = 0;
				while (!horaValida) {
					System.out.println("Entre com a hora do compromisso:");
					hora = scan.nextInt();

					if (hora >= 0 && hora <= 8) { // agora o programa trabalha apenas com 8 horas
						horaValida = true;
					} else {
						System.out.println("Entre com hora válida:");
					}
				}

				mes--; // mês também é decrementado em 1, por causa da posição de índice que se inicia em 0
				dia--;
				System.out.println("Entre com o compromisso:");
				compromissos[mes][dia][hora] = scan.next(); 

			} else if (opcao == 2) { 

				boolean mesValido = false;
				int mes = 0;
				while (!mesValido) {
					System.out.println("Entre com o mês [1 a 12]:");
					mes = scan.nextInt();

					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("Entre com um dia valido:");
					}
				}
				
				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Entre com o dia do mês:");
					dia = scan.nextInt();

					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Entre com um dia válido:");
					}
				}

				boolean horaValida = false;
				int hora = 0;
				while (!horaValida) {
					System.out.println("Entre com a hora do compromisso:");
					hora = scan.nextInt();

					if (hora >= 0 && hora <= 8) {
						horaValida = true;
					} else {
						System.out.println("Entre com hora válida:");
					}
				}
				--mes;
				--dia;

				System.out.println("Compromisso agendado:");
				System.out.println(compromissos[mes][dia][hora]);

			} else if (opcao == 0) {
				sair = true;
			} else {
				System.out.println("Opcao inválida, digite novamente:");
			}
		}
		
		
	}

}
