package Agenda;


import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {

		String[] nome = new String[1000];
		String[] endereco = new String[1000];
		String[] telefone = new String[1000];

		for (int i = 0; i < nome.length; i++) {
			nome[i] = "";
			telefone[i] = "";
			endereco[i] = "";

		}

		int opcao = 0, listarPor = 0, posicao = 0, codigoPesquisa = 0;
		String continuar = "", nomeExcluir = "", nomePesquisa = "";

		Scanner entrada = new Scanner(System.in);

		do {

			System.out
					.println("Escolha a opcao: 1-Incluir  2-Listar  3-Excluir  4-Sair");
			opcao = entrada.nextInt(); 
			entrada.nextLine();

			switch (opcao) {
			case 1:
				// C�digo para Incluir
				
				if (posicao < nome.length) {					
					do {
						
						System.out.print("Digite o nome: ");
						nome[posicao] = entrada.nextLine();

						System.out.print("Digite o endere�o: ");
						endereco[posicao] = entrada.nextLine();

						System.out.print("Digite o telefone: ");
						telefone[posicao] = entrada.nextLine();

						System.out.print("Deseja continuar o cadastrar outra pessoa? 1-Sim  2-N�o ");
						continuar = entrada.nextLine();

						posicao++;

					} while (continuar.equals("1"));
					
				} else {
					
					System.out.println("Sua agenda esta cheia.");

				}


				break;

			case 2:
				System.out.println("Como deseja pesquisar? 1-Telefone  2-Nome  3-Todos");
				listarPor = entrada.nextInt();
				entrada.nextLine();
				
				switch (listarPor) {
				case 1:
					System.out.println("Digite o telefone para pesquisa: ");
					codigoPesquisa = entrada.nextInt();
					entrada.nextLine();
					
					if (codigoPesquisa < nome.length && codigoPesquisa >= 0) {
						
					System.out.println("Nome: " + nome[codigoPesquisa] + 
							" Endere�o: " + endereco[codigoPesquisa]);
						
					} else {
						
						System.out.println("Codigo Invalido!");

					}
					
					break;
					
				case 2:
					System.out.println("Digite o nome para pesquisa: ");
					nomePesquisa = entrada.nextLine();
					
					for (int i = 0; i < telefone.length; i++) {
						
						if (nome[i].equalsIgnoreCase(nomePesquisa)) {
							
							System.out.println("Nome: " + nome[i] + 
									"Endere�o: " + endereco[i] + 
									"Telefone: " + telefone[i]);							
						}
						
					}
					
					break;
					
				case 3:
					// C�digo que lista todos os dados.
					for (int i = 0; i < nome.length; i++) {

						if (!nome[i].equals("")) {

							System.out.println("Nome: " + nome[i] + " Telefone: "
									+ telefone[i] + " Endere�o: " + endereco[i]);

						}

					}

					break;
					
				default:
					System.out.println("Opcao invalida! Escolha numeros de 1 a 3");
					
					break;
				}

				
				


			case 3:
				// C�digo para Excluir
				System.out.println("Quem deseja excluir? ");
				nomeExcluir = entrada.nextLine();

				for (int i = 0; i < nome.length; i++) {
					if (nome[i].equals(nomeExcluir)) {

						nome[i] = "";
						telefone[i] = "";
						endereco[i] = "";
					}

				}

				break;
			case 4:
				// C�digo para Sair
				System.out.println("Programa Finalizado.");
				return;

			default:
				// Op��o Invalida!
				System.out.println("Opcao Invalida! Tente novamente.");
				break;
			}

		} while (opcao != 4);
		entrada.close();

	}
}