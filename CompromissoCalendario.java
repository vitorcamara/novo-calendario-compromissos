package com.vitorcamara.projetos;

import java.util.Scanner;

public class CompromissoCalendario {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[][] compromissos = new String[31][24]; // 31 dias com cada dia tendo 24 horas

		boolean sair = false;
		int opcao = 0;
		while (!sair) {

			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para sair.");

			opcao = scan.nextInt();

			if (opcao == 1) { // adicionar compromisso

				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Entre com o dia do mês:");
					dia = scan.nextInt();

					if (dia > 0 && dia <= 31) { // dia precisa estar ser de 1 a 31
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

					if (hora >= 0 && hora <= 23) { // hora precisa ser de 0 a 23
						horaValida = true;
					} else {
						System.out.println("Entre com hora valida:");
					}
				}

				dia--; // A variável "dia" representa o número do dia do mês, e os índices de um array
						// começam em 0, não em 1.
						// Então, quando o usuário digita um dia válido (de 1 a 31), o programa
						// decrementa o valor em 1 para obter o índice correto no array "compromissos".
				System.out.println("Entre com o compromisso:");
				compromissos[dia][hora] = scan.next(); // "compromissos" coleta a String (o compromisso) nos índices
														// para "dia" e "hora" escolhidos pelo usuário

			} else if (opcao == 2) { // verificar o compromisso

				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Entre com o dia do mes:");
					dia = scan.nextInt();

					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Entre com um dia valido:");
					}
				}

				boolean horaValida = false;
				int hora = 0;
				while (!horaValida) {
					System.out.println("Entre com a hora do compromisso:");
					hora = scan.nextInt();

					if (hora >= 0 && hora <= 23) {
						horaValida = true;
					} else {
						System.out.println("Entre com hora valida:");
					}
				}
				--dia;

				System.out.println("Compromisso agendado:");
				System.out.println(compromissos[dia][hora]); // apresentando compromisso armazenado nos índices da
																// matriz

			} else if (opcao == 0) {
				sair = true;
			} else {
				System.out.println("Opcao inválida, digite novamente:");
			}
		}
	}
}
