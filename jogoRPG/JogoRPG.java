package jogoRPG;

import java.util.Scanner;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;

public class JogoRPG {
	// variaveis globais que usaremos em diversas partes do jogo
	static Scanner input = new Scanner(System.in);
	static String nomeJogador = "";
	static boolean correto = false;
	static int vida = 3;
	static int tentativasCadeado = 3;
	static int tentativasEscalada = 3;

	// Método para entradas de números
	static int entradaDadosInt(String text) {
		System.out.println(text);
		return input.nextInt();

	}

	// Método para entrada de String
	static String entradaDadosStr(String text) {
		System.out.println(text);
		return input.next();

	}

	// gerar numero aleatorio de acordo com o limite passado
	static int gerarNumero(int valorMaximo) {
		int numeroAleatorio;
		Random sorteio = new Random();
		numeroAleatorio = sorteio.nextInt(valorMaximo);
		return numeroAleatorio;
	}

	// metodo para trabalhar com as tentativas da questao do cadeado
	static void statusCadeado() {
		tentativasCadeado--;
		if (tentativasCadeado == 2) {
			System.out.println("\nTome cuidado, mais dois erros e a coisa ficará séria!");
		} else if (tentativasCadeado == 1) {
			System.out.println("\nSoldado, seja rápido e preciso, os inimigos estão chegando!!");
		} else if (tentativasCadeado == 0) {
			System.out.println("\nInfelizmente, os inimigos chegaram e te mataram desarmado!");
			System.exit(0);
		}
	}

	// metodo para trabalhar com as tentativas das questões de tiro
	static void statusVida() {
		vida--;
		if (vida == 2) {
			System.out.println("\nCuidado! Mire direito! O inimigo pode te encontrar!");
		} else if (vida == 1) {
			System.out.println("\nSoldado, seja mais preciso, os inimigos escutaram e estão te procurando!!");
		} else if (vida == 0) {
			System.out.println("\nOs inimigos te encontraram, fim da linha!");
			System.exit(0);
		}
	}

	// metodo para trabalhar com as tentativas da questão de escalada
	static void statusEscalada() {
		tentativasEscalada--;
		if (tentativasEscalada == 2) {
			System.out.println("\nCuidado! Veja bem se onde irá se apoiar está seguro!");
		} else if (tentativasEscalada == 1) {
			System.out.println("\nSoldado, desse jeito você vai acabar caindo!!");
		} else if (tentativasEscalada == 0) {
			System.out.println("\nVocê pegou errado numa pedra e acabou caindo!");
			System.exit(0);
		}
	}

	// funcao para definir quantas vidas o jogador terá nas batalhas
	static void escolhaRifle() {
		int escolhaArma = 0;
		do {

			imprimirArsenal();

			escolhaArma = entradaDadosInt("");

			switch (escolhaArma) {
			case 1:
			case 3:
				vida = 1;
				System.out.println("\nQue coragem! Lembre que você não pode falhar nenhuma vez!\n\n ");
				break;
			case 2:
				vida = 2;
				System.out.println("\nBoa escolha! Tem a chance de errar 2 vezes!\n\n ");
				break;
			case 4:
				vida = 3;
				System.out.println("\nJogando de forma tranquila, as 3 vidas estão em jogo!\n\n");
				break;
			default:
				System.out.println("\nPoxa, soldado, aonde você está vendo essa opção? Escolha novamente!");
			}
		} while (escolhaArma != 1 && escolhaArma != 2 && escolhaArma != 3 && escolhaArma != 4);

	}

	// metodo para imprimir o armamento
	static void imprimirArsenal() {
		System.out.println("\nEssas são as armas em nosso arsenal:\r\n" + "\r\n"
				+ "1-Barrett M82 - (1 vida) 12,7×99mm NATO .416 Barrett\r\n"
				+ "2-Dragunov Sniper rifle - ( 2 vidas) 7,62×54mmR\r\n" + "3-AWM - (1 vida) 7,62×67mm \r\n"
				+ "4-VSK-94 - ( 3 vidas) 9×39mm\r\n" + "");

		System.out.println("                              WOkX                                                 \r\n"
				+ "                 W0xxxxkOO0k,.oO00OkxddddokN                                    \r\n"
				+ "                 No,,,,,;'.'....,;'...... 'O                                    \r\n"
				+ "WNXNNWK0KKKKKN    WKxoccl;''..'',:c:;,'''',ldddxxxkxxxkkxkkkxxxxdlccccccclooookN\r\n"
				+ "Kc,;::'......;cclll:'............    .........,oxxxxxkkkkkkkxxxxdlccccccccccccdN\r\n"
				+ "K;............,od:..';c,......;,':cc:::;;'..':OW                           WWWW \r\n"
				+ "K; ....':c:'..:xx:.:kO0k;...'lX0xO00kxkxkl,cxX                                  \r\n"
				+ "0c:ccd0XW WXxc:;'..k    N0KKXN           WNW                                    \r\n"
				+ "WWW           WWX00N                                                            \r\n"
				+ "                       WWWWNXXXXNNK0KW                                          \r\n"
				+ "                   Xdod:;;;;,''';;,c0W                                          \r\n"
				+ "                W0d:.............',xW                                           \r\n"
				+ "                Nx;'..........;kKKOKW       W                   WW  WWWWW       \r\n"
				+ "N0kkxxxxkkkkkkkkkkxd:c;......,dOOOOkddkkOOOOOOOOOxoxKWWWWWWWWWWWWWWWWWWWWNXXXNW \r\n"
				+ "0,..................................................,clllllllllllllllllll:,;;;xN\r\n"
				+ "X;.lkkkkxc:dkkkkxl'..............:odo:cdxxxxxxxxxxxxkKKKKKKKKKKKKKKKKKKKK00000XW\r\n"
				+ "K,.cdddddxX      K:.':l;........,ldddoOW                                        \r\n"
				+ "NkodkO0KXW     Xd,.;k0KO:..... .d0KKKXW                                         \r\n"
				+ "               Kl;lK   Wo',;clldX                                               \r\n"
				+ "                 WWW   WNKXWW\r\n" + "                                                   \r\n"
				+ " \r\n" + "            WNNNNNNW  WN0kKNWWWWW                                               \r\n"
				+ "            Xl,;;,;codl,..';::::cO                                              \r\n"
				+ "WWW   NNNNNXXOkOOkxkkd,.';:,.cxxxkOOkk0KKKKKKKKKKKKKKNNXXXW           WOkW      \r\n"
				+ "0c:lxd;',,,':kKOl;,,,....,'...,,,'.......';,',,',;,..;::;;cxkkkkkkkkkkd;:dxxxdkN\r\n"
				+ "0' .,cc::cc:coo;...............,cc::c:',;:c:;;:::::';dO00OkO0000000000kxOOkOOkON\r\n"
				+ "K; 'O  WW     K:.';clookKo.....x  WW WXXNWWWNXNWWWNXN                           \r\n"
				+ "0, .:dkkkkkkkxc'.lXX00XW X:....oN                                               \r\n"
				+ "0doxkO0KKK0KK0kkx0W       Ollox0W               \r\n" + "NNNNNNW            ");
	}

	// formular logica de pergunta
	static void formularPergunta(String[][] alternativas, int numeroQuestao, String valorResposta, String pergunta,
			String desafio) {
		ArrayList<String> listaResposta = new ArrayList<String>();

		// convertendo array para ArrayList para utilizar o Collections
		for (int j = 0; j < alternativas[0].length; j++) {
			listaResposta.add(alternativas[numeroQuestao][j]);

		}

		// Misturando a ordem dos valores que serão mostrados para o jogador
		Collections.shuffle(listaResposta);

		// caso erre tem que repetir apenas essa parte, para não gerar uma pergunta
		// diferente do que ele respondeu

		do {
			System.out.println(pergunta);

			// código para mostrar as alternativas sorteadas
			for (int i = 0; i < listaResposta.size(); i++) {
				switch (i) {
				case 0:
					System.out.println("\nA) " + listaResposta.get(i));
					break;
				case 1:
					System.out.println("B) " + listaResposta.get(i));
					break;
				case 2:
					System.out.println("C) " + listaResposta.get(i));
					break;
				case 3:
					System.out.println("D) " + listaResposta.get(i));
					break;
				case 4:
					System.out.println("E) " + listaResposta.get(i));
					break;
				}

			}

			String respostaJogador = entradaDadosStr("").toUpperCase();
			int index = 5;
			// código para converter a altenativa passada para numero, para usarmos no array
			switch (respostaJogador) {

			case "A":
				index = 0;
				break;
			case "B":
				index = 1;
				break;
			case "C":
				index = 2;
				break;
			case "D":
				index = 3;
				break;
			case "E":
				index = 4;
				break;
			default:
				System.out.println("Opção inválida!");

			}

			// Código para saber se ele digitou algo válido
			if (index != 5) {
				// código para saber se a alternativa passada é a correta
				if (listaResposta.get(index).equals(valorResposta)) {
					correto = true;

				} else {
					// código que quando ele erra a questão, saber qual questão foi respondida para
					// ter uma resposta coerente
					if (desafio.equals("cadeado")) {
						statusCadeado();
					} else if (desafio.equals("escalada")) {
						statusEscalada();
					} else {
						statusVida();
					}

				}
			}

		} while (vida != 0 && tentativasCadeado != 0 && tentativasEscalada != 0 && !correto);

	}

	// espaço para trabalhar com as perguntas

	static void desafio1(int numeroQuestao) {
		// valores que podem ser utilizados na pergunta
		String[] valoresPergunta = { "10110110", "10111100", "01111111", "10010110", "11011100" };

		// valores que podem ser utilizados na resposta
		String[] valoresResposta = { "182", "188", "127", "150", "220" };

		// passando o mesmo valor para pergunta e resposta para ter o valor correto
		String valorPergunta = valoresPergunta[numeroQuestao];
		String valorResposta = valoresResposta[numeroQuestao];

		// valores que podem aparecer como opcao de alternativas
		String[][] alternativas = new String[][] { { "182", "181", "176", "170", "175" },
				{ "188", "185", "190", "181", "182" }, { "127", "128", "129", "130", "131" },
				{ "150", "145", "148", "152", "153" }, { "221", "230", "220", "231", "227" } };

		String pergunta = "\nPara abrir o cadeado, converta os seguintes dígitos de binário para decimal: \n"
				+ valorPergunta;

		formularPergunta(alternativas, numeroQuestao, valorResposta, pergunta, "cadeado");

	}

	static void desafio2(int numeroQuestao2) {
		// valores que podem ser utilizados na pergunta
		String[] valoresPergunta2 = { "9", "8", "7" };

		// valores que podem ser utilizados na resposta
		String[] valoresResposta2 = { "729", "512", "343" };

		// passando o mesmo valor para pergunta e resposta para ter o valor correto
		String valorPergunta2 = valoresPergunta2[numeroQuestao2];
		String valorResposta2 = valoresResposta2[numeroQuestao2];

		// valores que podem aparecer como opcao de alternativas
		String[][] alternativas2 = new String[][] { { "727", "728", "729", "730", "731" },
				{ "510", "511", "512", "513", "514" }, { "341", "342", "343", "344", "345" } };

		String pergunta2 = "\nVocê precisa escalar... Sabendo que em um exército possui " + valorPergunta2
				+ " batalhões. \n" + "Cada batalhão possui " + valorPergunta2
				+ " soldados e cada soldado tem que fazer uma marcha de " + valorPergunta2
				+ "km. Quantos km são percorridos ao todo?: \n";
		formularPergunta(alternativas2, numeroQuestao2, valorResposta2, pergunta2, "escalada");
	}

	static void desafio3(int numeroQuestao3) {
		// valores que podem ser utilizados na pergunta
		String[] valoresPergunta3 = { "1D7", "CC", "7A" };

		// valores que podem ser utilizados na resposta
		String[] valoresResposta3 = { "727", "314", "172" };

		// passando o mesmo valor para pergunta e resposta para ter o valor correto
		String valorPergunta3 = valoresPergunta3[numeroQuestao3];
		String valorResposta3 = valoresResposta3[numeroQuestao3];

		// valores que podem aparecer como opcao de alternativas
		String[][] alternativas3 = new String[][] { { "701", "727", "729", "731", "735" },
				{ "312", "313", "314", "318", "322" }, { "172", "174", "176", "178", "180" } };

		String pergunta3 = "\nDado o valor " + valorPergunta3 + " em hexadecimal, converta o número para octal: \n";
		formularPergunta(alternativas3, numeroQuestao3, valorResposta3, pergunta3, "tiro");
	}

	static void desafio4(int numeroQuestao4) {
		// valores que podem ser utilizados na pergunta
		String[] valoresPergunta4 = { "1100 1110 1010", "1110 0100 1010", "1011 1111 1111" };

		// valores que podem ser utilizados na resposta
		String[] valoresResposta4 = { "CEA", "E4A", "BFF" };

		// passando o mesmo valor para pergunta e resposta para ter o valor correto
		String valorPergunta4 = valoresPergunta4[numeroQuestao4];
		String valorResposta4 = valoresResposta4[numeroQuestao4];

		// valores que podem aparecer como opcao de alternativas
		String[][] alternativas4 = new String[][] { { "CEB", "CEA", "CED", "CEB", "CEF" },
				{ "E48", "E49", "E4A", "EAB", "E4C" }, { "BFB", "BFC", "BFD", "BFE", "BFF" } };

		String pergunta4 = "\nDado valor " + valorPergunta4 + " em binário, qual valor em hexa: \n";

		formularPergunta(alternativas4, numeroQuestao4, valorResposta4, pergunta4, "tiro");

	}

	static void desafio5(int numeroQuestao5) {
		// valores que podem ser utilizados na pergunta
		String[] valoresPergunta1 = { "40% ", "50% ", "20% " };
		String[] valoresPergunta2 = { "720", "600", "770" };

		// valores que podem ser utilizados na resposta
		String[] valoresResposta5 = { "300", "240", "350" };

		// passando o mesmo valor para pergunta e resposta para ter o valor correto
		String valorPergunta1 = valoresPergunta1[numeroQuestao5];
		String valorPergunta2 = valoresPergunta2[numeroQuestao5];
		String valorResposta5 = valoresResposta5[numeroQuestao5];

		// valores que podem aparecer como opcao de alternativas
		String[][] alternativas5 = new String[][] { { "298", "299", "300", "301", "302" },
				{ "238", "239", "240", "241", "242" }, { "348", "349", "350", "351", "352" } };

		String pergunta5 = "\n Num exercício de tiro ao alvo, o número de acertos de uma pessoa A foi " + valorPergunta1
				+ " maior do que B. Se A e B acertaram juntas " + valorPergunta2 + " tiros, então o "
				+ "número de acertos de B foi: \n";

		formularPergunta(alternativas5, numeroQuestao5, valorResposta5, pergunta5, "tiro");

	}

	static void desafio6(int numeroQuestao6) {
		// valores que podem ser utilizados na pergunta
		String[] valoresPergunta6 = { "6" };

		// valores que podem ser utilizados na resposta
		String[] valoresResposta6 = { "02" };

		// passando o mesmo valor para pergunta e resposta para ter o valor correto
		String valorPergunta6 = valoresPergunta6[numeroQuestao6];
		String valorResposta6 = valoresResposta6[numeroQuestao6];

		// valores que podem aparecer como opcao de alternativas
		String[][] alternativas6 = new String[][] { { "01", "02", "36", "12", "06" } };

		String pergunta6 = "\nSe A=√(√6-2). √(2+√6), então o valor de A é: ";

		formularPergunta(alternativas6, numeroQuestao6, valorResposta6, pergunta6, "tiro");

	}

	static void caminhoMinado() {
		int contBombs = 0;
		int seletor = 0;
		int pontos = 0;
		int path = 9;
		int numberBombs = 3;
		boolean win = false;

		int[] campo = new int[path];

		do {

			int valorSorteado = new Random().nextInt(path) + 1;
			valorSorteado = valorSorteado - 1;

			if (campo[valorSorteado] != -1) {
				campo[valorSorteado] = -1;
				contBombs++;

			} else if (campo[valorSorteado] == -1) {
				campo[valorSorteado] = -1;

			} else {

				campo[valorSorteado] = 0;
			}

		} while (contBombs < numberBombs);

		System.out.println("Escolha bem o seu próximo passo: ");

		do {

			do {
				for (int campinho : campo) {

					if (campinho == -1 || campinho == 0) {
						System.out.print(" _ ");
					} else {
						System.out.print(" X ");
					}
				}

				System.out.println();

				seletor = entradaDadosInt("");
				seletor = seletor - 1;
				if (seletor < 0 || seletor > (path - 1)) {
					System.out.println("Entrada Inválida");
				}
			} while (seletor < 0 && seletor > (path - 1));

			if ((campo[seletor]) == 0) {
				campo[seletor] = 1;

				if (seletor == campo.length - 1) {
					if (campo[seletor - 1] == -1) {

						System.out.println("Cuidado: bomba próxima!");
					}
				} else if (seletor == 0) {
					if (campo[seletor + 1] == -1) {

						System.out.println("Cuidado: bomba próxima!");
					}
				} else {
					if (campo[seletor - 1] == -1 || campo[seletor + 1] == -1) {

						System.out.println("Cuidado: bomba próxima!");
					}
				}

				pontos++;

				if (pontos == path - numberBombs) {
					win = true;
					System.out.println(
							"\n\nApós passarem pelas bombas, os dois andaram por cerca de uma hora em direção à praia. Ao chegarem lá encontraram o melhor cenário possível, \no caminho que estavam seguindo dava direto na cabana do tenente.\r\n"
									+ "\r\n"
									+ "- Capitão: 06! Nós somos muito sortudos, olha aquilo! Ele está na cabana observando os soldados lutando, \ne aguardando o navio no horizonte vir o buscar. Eu vou dar um fim nessa guerra agora mesmo! Aguarde aqui!\r\n"
									+ "\r\n"
									+ "Se esgueirando por meio dos arbustos, o capitão invadiu a cabana onde ele se encontrava e com uma pistola ele atacou o tenente.\r\n"
									+ "\r\n" + "- Capitão: MORRA SEU DESGRAÇADO!!!\r\n" + "\r\n"
									+ "E depois de descarregar os 9 tiros de sua pistola IMBEL no tenente, o Capitão havia acabado com a guerra. \r\n"
									+ "\r\n"
									+ "Os soldados que sobraram, ou se renderam, ou simplesmente fugiram para o navio que acabara de chegar.\r\n"
									+ "\r\n" + "");

					for (int campinho : campo) {

						if (campinho == 1) {
							System.out.print(" X ");
						} else if (campinho == 0) {
							System.out.print(" _ ");
						} else {
							System.out.print(" B ");
						}

					}
				}

			} else if ((campo[seletor]) == 1) {
				System.out.println("Campo Já Aberto");

			} else {

				for (int campinho : campo) {

					if (campinho == 1) {
						System.out.print(" X ");
					} else if (campinho == 0) {
						System.out.print(" _ ");
					} else {
						System.out.print(" B ");
					}

				}

				System.out.println("Game Over! você pisou na bomba!");
				System.exit(0);
			}

		} while (!win);

	}

	// ----- funcoes usadas no jogar -----

	static void prologo() {
		int resp;
		System.out.println(
				"\nTudo começou pelo amanhecer daquele dia que seria marcado para sempre nos livros de história: "
						+ "\nO DIA QUE O BRASIL FOI INVADIDO!");
		System.out.println(
				"A Coalisão era um grupo de países que se reuniram em busca da cura da praga que afetou a produção mundial de café."
						+ "\nEssa praga foi transmitida por fungos que eram propagados pelo ar por meio de esporos,"
						+ "\nestes que em contato com os grãos, alteravam a genética e impossibilitavam o desenvolvimento do grão de café.");

		System.out.println(
				"Naquela manhã, o Major se encontrava no quartel extremamente enfurecido! E pronto para dar as ordens para o seu fiel subordinado, o Capitão:");

		System.out.println("\n-Major: Capitão! venha até aqui."
				+ "\nPrecisamos alocar o quanto antes o novo soldado da classe Sniper no batalhão.");
		System.out.println("-Capitão: Certo! Irei fazer isso! Inclusive, qual o seu nome, filho?");

		System.out.println("-Personagem: " + nomeJogador);

		System.out.println("-Major: " + nomeJogador + "? Hahahaha!! Isso aqui é uma guerra! "
				+ "\n-Capitão: Aqueles selvagens estão nos atacando e vocês vão ficar trocando figurinhas sobre um ao outro? "
				+ "\nAqui você vai ser o soldado 06!” Gritou.");
		do {
			System.out.println(
					"\nE depois de ser apresentado ao quartel, 06 começou o seu treinamento junto com o capitão. "
							+ "\nUma pena que eles não puderam continuar a conversa, pois ali próximo as tropas da coalisão"
							+ "\nestavam invadindo o terreno. Eram milhares de soldados descendo pelo céu de paraquedas.");

			resp = entradaDadosInt("\n(1) continuar");
			if (resp != 1) {
				System.out.println("\nSoldado, eu não compreendi...");
				System.out.print("\n...");
			}

		} while (resp != 1);

	}

	static void historiaParte1() {
		// gerar numero aleatorio para a criação da pergunta
		int numeroSorteado = gerarNumero(4);

		System.out.println("\n\n");
		System.out.println("    ___            __                         __     \r\n"
				+ "   /   |     _____/ /_  ___  ____ _____ _____/ /___ _\r\n"
				+ "  / /| |    / ___/ __ \\/ _ \\/ __ `/ __ `/ __  / __ `/\r\n"
				+ " / ___ |   / /__/ / / /  __/ /_/ / /_/ / /_/ / /_/ / \r\n"
				+ "/_/  |_|   \\___/_/ /_/\\___/\\__, /\\__,_/\\__,_/\\__,_/  \r\n"
				+ "                          /____/                     ");
		System.out.println("\n\n");
		System.out.println("\r\n"
				+ "O Major foi informado de que o plano da coalisão era conseguir roubar o antídoto que estava sendo desenvolvido ali em Três corações, "
				+ "\ne posteriormente pousariam no aeroporto de Mogi para pegar a outra parte da pesquisa. Ali os paraquedistas se reuniriam com as tropas de Mogi, "
				+ "\ne viriam em comboios para Paraty, onde sumiriam por meio de navios que os aguardavam na praia.\r\n"
				+ "\r\n"
				+ "O plano da coalisão era trazer tropas por meio da praia para conseguir fazer a retaguarda dos soldados que roubaram a cura. "
				+ "\nEstes soldados tentariam a qualquer custo retardar as tropas brasileiras que os seguiam.\r\n"
				+ "\r\n"
				+ "“Estes desgraçados querem nos roubar para depois bancar os bons moços! Isso não vai ficar assim!!” Gritou Major ao telefone com um de seus subordinados.\r\n"
				+ "\r\n"
				+ "Pouco depois, Capitão e 06 foram ordenados pelo Major e se deslocarem imediatamente para o campo de batalha, "
				+ "\npois foi informado que um Sniper já havia abatido mais de 20 soldados.\r\n" + "\r\n"
				+ "- Major: Capitão, eu te ordeno a eliminar este cretino! O infeliz já matou mais que a peste negra! Estou perdendo muitos homens!!!\r\n"
				+ "\r\n" + "Certo, estamos a caminho! “Disse o Capitão”\r\n" + "\r\n"
				+ "- 06: Capitão! O que faremos?\r\n" + "\r\n"
				+ "- Capitão: Agora iremos para o arsenal, você precisará de escolher um rifle para o combate.\r\n"
				+ "\r\n"
				+ "-E antes que eu me esqueça, implementamos recentemente novas senhas nos cofres, você precisará de responder corretamente a pergunta feita para abrir o seu cofre."
				+ "\n Tome muito cuidado! Pois se você errar 3 vezes seu cofre ficará trancado para sempre!\r\n"
				+ "\r\n" + "-06: Entendido Capitão!\r\n");

		desafio1(numeroSorteado);
		// definir a variavel como false, para não pular a proxima pergunta
		correto = false;
		System.out.println("\n- Capitão: Boa 06!!! Agora escolhe logo um rifle pois não temos muito tempo!");

		escolhaRifle();

	}

	static void historiaParte2() {

		int numeroSorteado = gerarNumero(2);

		System.out.println(
				"\nDiretamente do Arsenal, Capitão e 06 correram para o campo de batalha, havia diversos corpos no chão, e 06 começou a ficar assustado...");
		System.out.println("\n- Capitão... a gente precisa mesmo de fazer isso? perguntou 06 com medo.");
		System.out.println("\n- Capitão: Se você não quiser ser preso pelo resto da sua vida por deserção...");
		System.out.println("\n- Ok... Responde 06 quase chorando");

		System.out.println(
				"\nAinda assustado, 06 continuou seguindo e pensando como que ele iria vencer os seus medos, afinal não tinha mais como voltar atrás... "
						+ "\nele gostava de ser um soldado, e ainda mais da classe Sniper, pois no quartel ele havia "
						+ "\nganho medalhas de honra por ser o melhor atirador.");

		System.out.println(
				"\nDepois de chegarem no local, capitão e 06 se depararam com um morro o qual deveriam escalar para se posicionarem e realizar os abates, porém seria complicado "
						+ "\nsubir, visto que o terreno não ajudava muito.\n");

		desafio2(numeroSorteado);
		correto = false;
	}

	static void historiaParte3() {
		int numeroSorteado = gerarNumero(2);

		System.out.println(
				"\nDepois da escalada, Capitão e 06 se posicionaram atrás de uma rocha que serviria de cobertura. E enquanto se prepararam, 06 viu algo "
						+ "\nque mudaria completamente o seu comportamento.");
		System.out.println("\n- Capitão: Precisamos encontrar esse Sniper o quanto antes! Prepare o seu "
				+ "fuzil enquanto eu o localizo com o binóculo.");
		System.out.println("\n- 06: Certo! Ei espera... aquele ali não é o meu vizinho?");
		System.out.println(
				"\nNaquele momento 06 viu o seu vizinho e amigo de quartel sendo morto pelo Sniper, como se não bastasse ter visto aquela cena, ele também conseguiu localizar o atirador."
						+ "\nEnfurecido, ele tomou agiu imediatamente, se posicionou e se preparou para atirar.\n");

		desafio3(numeroSorteado);
		correto = false;
	}

	static void historiaParte4() {
		int numeroSorteado = gerarNumero(2);

		System.out.println(
				"\nSurpreso pelo tiro certeiro, Capitão chamou a atenção de 06 pela atitude inesperada, e o repreendeu.");
		System.out.println(
				"\n- “Seu imprudente! Já pensou se você erra e ele nos fuzila? O que seria da missão e do resto do batalhão? "
						+ "Seu maluco!!!” Exclamou o capitão com uma certa admiração pela boa pontaria.");
		System.out.println("\n- 06: Ele matou o meu amigo! Você não faria o mesmo?");
		System.out.println(
				"\n- Capitão: Cara eu só não vou te reportar para o Major por você ter sido eficiente, mas saiba que aqui a "
						+ "gente não faz o que dá na telha! A gente segue ordens! Entendido?");
		System.out.println("\n- “Sim senhor capitão!” Exclamou 06 prestando continência.");
		System.out.println(
				"\nDepois deste combate, os dois seguiram para a região de Mogi para deter o desembarque das tropas que aterrissariam em aviões, era preciso "
						+ "ser rápido pois a segunda parte da cura ainda corria risco.");
		System.out.println("\n\n");
		System.out.println(
				"\n   / ____/_  __   ____  ____ _____     ____  ________  _____(_)________     ____/ /___  ____ ___  (_)___  ____ ______   ____     ____ ___  __  ______  ____/ /___      \r\n"
						+ "  / __/ / / / /  / __ \\/ __ `/ __ \\   / __ \\/ ___/ _ \\/ ___/ / ___/ __ \\   / __  / __ \\/ __ `__ \\/ / __ \\/ __ `/ ___/  / __ \\   / __ `__ \\/ / / / __ \\/ __  / __ \\     \r\n"
						+ " / /___/ /_/ /  / / / / /_/ / /_/ /  / /_/ / /  /  __/ /__/ (__  ) /_/ /  / /_/ / /_/ / / / / / / / / / / /_/ / /     / /_/ /  / / / / / / /_/ / / / / /_/ / /_/ /   _ \r\n"
						+ "/_____/\\__,_/  /_/ /_/\\__,_/\\____/  / .___/_/   \\___/\\___/_/____/\\____/   \\__,_/\\____/_/ /_/ /_/_/_/ /_/\\__,_/_/      \\____/  /_/ /_/ /_/\\__,_/_/ /_/\\__,_/\\____/   ( )\r\n"
						+ "                                   /_/                                                                                                                              |/ \r\n"
						+ "                                       _                       _           __                                                           _     \r\n"
						+ "   _________     ____  ________  _____(_)________     ____ _  (_)_  ______/ /___ ______   ____     ____ ___  ___  __  __   ____  ____ _/_/____\r\n"
						+ "  / ___/ __ \\   / __ \\/ ___/ _ \\/ ___/ / ___/ __ \\   / __ `/ / / / / / __  / __ `/ ___/  / __ \\   / __ `__ \\/ _ \\/ / / /  / __ \\/ __ `/ / ___/\r\n"
						+ " (__  ) /_/ /  / /_/ / /  /  __/ /__/ (__  ) /_/ /  / /_/ / / / /_/ / /_/ / /_/ / /     / /_/ /  / / / / / /  __/ /_/ /  / /_/ / /_/ / (__  ) \r\n"
						+ "/____/\\____/  / .___/_/   \\___/\\___/_/____/\\____/   \\__,_/_/ /\\__,_/\\__,_/\\__,_/_/      \\____/  /_/ /_/ /_/\\___/\\__,_/  / .___/\\__,_/_/____/  \r\n"
						+ "             /_/                                        /___/                                                          /_/                    ");
		System.out.println("\n\n");
		System.out.print(
				"\n\n06 e Capitão partiram em disparada, eles precisavam de chegar em Mogi o quanto antes, pois como o ataque da coalisão foi muito mal "
						+ "coordenado, o Major acreditava que era possível encurralar as tropas e expulsá-las para as praias de Paraty, ou até mesmo capturá-las. "
						+ "Mas independente do método, era de suma importância que os Franco-Atiradores inimigos fossem eliminados.");
		System.out.println(
				"\nEnquanto Capitão dirigia o caminhão militar com os demais soltados na caçamba, 06 estava no banco do carona pensando em como seria a "
						+ "batalha, ele parecia um pouco ansioso.");
		System.out.println("\n- Capitão: 06! O que você tanto pensa aí? Não acha que está um pouco quieto demais?");
		System.out
				.println("\n- “Não Capitão, eu só estou me preparando para o combate” disse 06 com um pouco de medo.");
		System.out.println(
				"\n- Capitão: Cara, eu sei que você está com medo, mas pensa bem. Se a gente sair daqui a gente pode montar uma empresa, abrir um negócio, ficar ricos e dominar o mundo! "
						+ "\nSão infinitas as possibilidades! ");
		System.out.print(
				"\n\nMas isso só vai acontecer se a gente se sair bem e conseguir vencer essa batalha!!! Ânimo 06!");
		System.out.print("\n- “Tudo bem Capitão!” disse 06 mais confiante.");
		System.out.print(
				"\nAo chegar em Mogi a guerra já estava ocorrendo no aeroporto, porém dessa vez a coalisão estava totalmente perdida, pois já havia tropas advindas de Campinas e São Paulo "
						+ "combatendo no local. Ao ver o cenário favorável 06 mudou, e com as ordens do Capitão ele se transformou em uma máquina! Uma besta enjaulada com ódio! Não deixando "
						+ "uma alma viva sequer no seu caminho!");

		System.out.println("\n- Capitão: 06! Inimigo às 2 horas!!");
		System.out.print("\n- 06: Inimigo abatido!");
		System.out.println("\n- Capitão: Boa 06! Agora tenha cuidado! Inimigo avistado às 12 horas!!");
		System.out.println("\n- 06: Inimigo abatido!");

		System.out.println("                                                                                \r\n"
				+ "                                             W0dc;;:lkX                         \r\n"
				+ "                                            Nd.       ;0                        \r\n"
				+ "                                           Wk.         cN                       \r\n"
				+ "                                          WK;          ;X                       \r\n"
				+ "                                         WWKo'         .clcclxXW                \r\n"
				+ "                        NXW  WWNNNK00KNNNXXXO,                'xW               \r\n"
				+ "                 X0KXXX0c,ldl;''''....''.....                  .dW              \r\n"
				+ "                Wkldxkkdlodxdl;.         .,..                   '0              \r\n"
				+ "                             WW0l;'      :XKl.                  .dW             \r\n"
				+ "                                WW0'    .lXk,                    ;K             \r\n"
				+ "                                  Nk'    .,.                     .k             \r\n"
				+ "                                 WW K;         .l,                cN            \r\n"
				+ "                                 WWWW0c.     ,oKW0;.              .O            \r\n"
				+ "                                  Nklc:'.  .:kXNWWO,...           .dW           \r\n"
				+ "                                  k'....''..'..,;cxd;..            ;K           \r\n"
				+ "                                  d.'. ..'..'.....,,,.  ..         .k           \r\n"
				+ "                                W x.......  ..... .  .. ..          d           \r\n"
				+ "                                WWO. ....  .  ..    ...             d           \r\n"
				+ "                                WWX:        ,c,.                   .x           \r\n"
				+ "                                   x.       ;KXkl:'.               .k           \r\n"
				+ "                                   X;       .k   WXx.              .dW          \r\n"
				+ "                                   Wd.       oW  WNl                .O          \r\n"
				+ "                                    Nd'      lN   k.                .kW         \r\n"
				+ "                                    WWX:     .O  Wl                  :K         \r\n"
				+ "                                WW W Nk'      dW K,                   d         \r\n"
				+ "                                WXKKO:.       :N k.            .l;   .xW        \r\n"
				+ "                               No...     .    '0 d         ..:dKWK; .oN         \r\n"
				+ "                               Xl.     .,,.   .O 0;      'oOXW  WO'  cX         \r\n"
				+ "                               K;             ,0  0,    .;oOXW  Nc   .k         \r\n" + "");

		System.out.println("\n- Capitão: Também atirando com o meu fuzil fica fácil! Agora elimina aquele ali que "
				+ "\nestá às 10 horas lá na guarita.\n");

		desafio4(numeroSorteado);
		correto = false;
	}

	static void historiaParte5() {
		int numeroSorteado = gerarNumero(4);

		System.out.println("\n- Capitão: 06 você está fazendo o meu dia muito mais feliz! ");
		System.out.println("\n- Parece que o amiguinho dele tomou o lugar no posto dele, acaba com ele!");

		desafio5(numeroSorteado);
		correto = false;

		System.out.println(
				"Depois de toda aquela troca de tiros, a coalisão iniciou a sua partida em retirada, conforme o Major havia previsto. \nCapitão estava exultante!\r\n"
						+ "\r\n"
						+ "- Capitão: Meu Jovem! Você conseguiu!! A gente conseguiu expulsar eles e agora só precisamos de garantir que isso seja concluído para que possamos sair daqui! Montar nossa empresa! DOMINAR O MUNDO!\r\n"
						+ "\r\n" + "- 06: Eu não preciso dominar o mundo, só preciso ajudar o meu país.\r\n" + "");

	}

	static void historiaParte6() {
		int numeroSorteado = gerarNumero(1);
		int decisao;

		System.out.println("Enquanto partiam para Paraty no caminhão, Capitão recebeu uma ligação do Major:\r\n"
				+ "\r\n"
				+ "- Capitão! Se você e o 06 conseguirem eliminar o tenente especial da coalisão, vocês serão condecorados, podem ter certeza de que farei vocês dois se sentirem muito especiais!\r\n"
				+ "\r\n" + "Capitão e 06 entusiasmaram muito, pois afinal, tudo aquilo estava perto do fim. \r\n"
				+ "Ao chegar próximo de Paraty, os dois se depararam com um problema, a Coalisão tinha colocado bombas em uma ponte na seguinte localização: -23.2255999,-44.7662465 \r\n"
				+ "\r\n"
				+ "E por mais tosco que parecia colocar bombas em uma ponte tão pequena, o plano deles era apenas atrasar a retaguarda, \nvisto que sabiam que tropas vindas de Santos e de Angra já estariam na praia lutando com a marinha da Coalisão.\r\n"
				+ "\r\n"
				+ "06 ao avistar a ponte logo desceu do caminhão, mas pressentiu algo estranho e comentou com o capitão:\r\n"
				+ "\r\n"
				+ "“- Capitão! Você não acha que eles colocaram bombas? Essa ponte está estranha demais... “disse 06 já procurando o detector de metais.\r\n"
				+ "\r\n" + "- Capitão: Eu sinceramente também acho o mesmo, deixe me ver...\r\n" + "\r\n"
				+ "Após quase ter pisado em uma bomba, e ter sido salvo por 06 que o puxou pela roupa. O capitão sugeriu duas opções. \nSeguir pela ponte economizando tempo e desarmando as bombas, ou dar a volta pelas rodovias: SP-459, SP-153, SP-125 e SP-101.\r\n"
				+ "\r\n"
				+ "- Capitão: Obrigado 06 por ter salvado a minha vida! Confesso que fui imprudente! Mas enfim... precisamos de nos decidir, \nse desviamos das bombas chegamos mais rápido e talvez possamos eliminar o Tenente da coalisão. \nAgora, se darmos a volta provavelmente iremos nos atrasar e o Major vai dar o mérito para outra pessoa, e então... o que você prefere?\r\n"
				+ "");

		do {
			decisao = entradaDadosInt("Decisão: \n(1) - Dar a volta \n(2) - Seguir em frente");

		} while (decisao != 1 && decisao != 2);

		if (decisao == 1) {

			System.out.println(
					"Após uma viagem de mais de 5 horas, os dois sequer esperavam que encontrariam alguma resistência, mas muito pelo contrário, por incrível que pareça haviam chegado mais reforços para fazer a extração do tenente especial. \nEra muito estranho, tudo aquilo estar acontecendo, mas tudo ficou claro ao receberem uma ligação do Major:\r\n"
							+ "\r\n"
							+ "- “Ele está se escondendo, nossas forças de inteligência descobriram que ele conseguiu alguns grãos modificados geneticamente, "
							+ "\nse eles saírem do país com isso podemos ter uma crise diplomática maior do que já teremos!” disse o Major pelo rádio.\r\n"
							+ "\r\n"
							+ "Ao chegarem na praia, 06 e Capitão viram a sua chance de ouro! O tenente estava correndo para dentro de um Navio com uma maleta em mãos. \nEra a oportunidade perfeita para acabar com a guerra!\r\n"
							+ "\r\n" + "- Capitão: 06! Ele está correndo, é agora ou nunca! Atire!!\r\n");

			desafio6(numeroSorteado);
			correto = false;

			System.out.println(
					"Em um tiro certeiro! 06 pôs o inimigo ao chão, e aquilo decretava o fim da guerra, pois os soldados que sobraram, ou se renderam, ou simplesmente fugiram para o navio.\r\n"
							+ "\r\n" + "- Capitão: 06, eu acho que você acabou com a guerra...\r\n" + "\r\n"
							+ "- 06: Esperamos que sim... \r\n" + "");

		} else if (decisao == 2) {
			caminhoMinado();
		}

		System.out.println(
				"Após o fim dessa invasão, a cura foi finalmente terminada e a coalisão entrou em contato com a embaixada brasileira para pôr um fim nos conflitos, eles alagavam que tinham sido persuadidos por um certo Tenente especial.\r\n"
						+ "\r\n"
						+ "Depois que tudo acabou, Capitão e 06 foram condecorados com diversos prêmios e medalhas dentro do exército brasileiro. \r\n"
						+ "\r\n"
						+ "06 estava feliz não só por ter ganho seus prêmios, mas também pois um professor dos tempos de faculdade havia ganhado um prêmio por ter desenvolvido o software que ajudou na conclusão da pesquisa. \n06 só não se recordava muito bem o seu nome... \r\n"
						+ "\r\n" + "\r\n"
						+ "- “Capitão, eu lembro dele ele me deu aula na faculdade! Eu só não lembro do seu nome... era Tadeu? Ou será que era Takeo? \nSinceramente não me lembro” disse 06 enquanto o via na televisão.\r\n"
						+ "\r\n"
						+ "O tal professor conseguiu um prêmio Nobel por seus feitos, e foi convidado pela comunidade científica para apresentar o seu projeto em Kiev, na Ucrânia. \nDizem os boatos que ele até se casou com uma moça e ficou por lá mesmo.\r\n"
						+ "\r\n"
						+ "- 06: Fico feliz que tudo deu certo! E pensar que essa guerra toda foi por causa de café...\r\n"
						+ "\r\n" + "- Capitão: pois é...\r\n" + "\r\n"
						+ "- 06: Caramba, até me lembrei de um jogo que eu gostava de jogar na faculdade, era bem legal! Lembro que tinha magos de Java, e se utilizava café como Mana...\r\n"
						+ "\r\n" + "\r\n" + "- Capitão: Rapaz, mas do que você está falando?\r\n" + "\r\n"
						+ "- 06: Nada, foi só uma lembrança que eu tive\r\n" + "\r\n" + "\r\n" + "Fim.\r\n" + "");

		System.exit(0);

	}

	// ------- aqui termina os metodos usados no jogar -------

	// metodo para rodar o jogo
	static void jogar() {
		prologo();
		historiaParte1();
		historiaParte2();
		historiaParte3();
		historiaParte4();
		historiaParte5();
		historiaParte6();
	}

	static void voltarMenu() {
		int value;
		value = entradaDadosInt("\n(1) Voltar");

		if (value != 1) {
			System.out.println("\nSoldado, eu não compreendi...!");
		} else {
			menu();
		}
	}

	// metodo para mostrar como será a história do jogo
	static void historia() {
		int value = 0;
		while (value != 1) {
			System.out.println("\n" + "───────────▒▒▒▒▒▒▒▒\r\n" + "─────────▒▒▒──────▒▒▒\r\n"
					+ "────────▒▒───▒▒▒▒──▒░▒\r\n" + "───────▒▒───▒▒──▒▒──▒░▒\r\n" + "──────▒▒░▒──────▒▒──▒░▒\r\n"
					+ "───────▒▒░▒────▒▒──▒░▒\r\n" + "─────────▒▒▒▒▒▒▒───▒▒\r\n" + "─────────────────▒▒▒\r\n"
					+ "─────▒▒▒▒────────▒▒\r\n" + "───▒▒▒░░▒▒▒─────▒▒──▓▓▓▓▓▓▓▓\r\n"
					+ "──▒▒─────▒▒▒────▒▒▓▓▓▓▓░░░░░▓▓──▓▓▓▓\r\n" + "─▒───▒▒────▒▒─▓▓▒░░░░░░░░░█▓▒▓▓▓▓░░▓▓▓\r\n"
					+ "▒▒──▒─▒▒───▓▒▒░░▒░░░░░████▓▓▒▒▓░░░░░░▓▓\r\n" + "░▒▒───▒──▓▓▓░▒░░░░░░█████▓▓▒▒▒▒▓▓▓▓▓░░▓▓\r\n"
					+ "──▒▒▒▒──▓▓░░░░░░███████▓▓▓▒▒▒▒▒▓───▓▓░▓▓\r\n" + "──────▓▓░░░░░░███████▓▓▓▒▒▒▒▒▒▒▓───▓░░▓▓\r\n"
					+ "─────▓▓░░░░░███████▓▓▓▒▒▒▒▒▒▒▒▒▓▓▓▓░░▓▓\r\n" + "────▓▓░░░░██████▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▓░░░░▓▓\r\n"
					+ "────▓▓▓░████▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓" + "   O ano é 2023...\r\n"
					+ "─────▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓"
					+ "   Depois de uma pandemia mundial, a humanidade se viu cercada de um novo problema, \r\n"
					+ "─────▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓"
					+ "   muito maior que o anterior! ACABOU O CAFÉ!!! Um vírus afetou toda a produção mundial de café, \r\n"
					+ "──────▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓"
					+ "   crescendo nos solos e secando todas as sementes, porém, o único país que parece que não foi afetado foi o Brasil,\r\n"
					+ "───────▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓"
					+ "   mais especificamente a região de Três Corações. Cientistas de todo o mundo vieram ao Brasil tentar entender tal fenômeno,\r\n"
					+ "─────────▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓"
					+ "     mas sem sucesso. Depois de conversas que envolviam o aumento da exportação de café, e posteriormente, a tentativa de exploração \r\n"
					+ "───────────▓▓▓▓▓▓▒▒▒▒▒▓▓▓▓"
					+ "   do solo brasileiro, a tensões aumentaram. A \"Organização Mundial de Programadores\" (OMP) falava que era impossível trabalhar \r\n"
					+ "───────────────▓▓▓▓▓▓▓▓"
					+ " em tais condições, e que seus programadores regrediram ao ponto de não conseguirem executar um simples: \"Hello World\". \r\n"
					+ "Também foram professores, advogados, traders, caminhoneiros e diversas outras profissões do mundo todo.\""
					+ "\r\n" + "O inevitável aconteceu... GUERRA!!!\r\n" + "\r\n"
					+ "Diversos países do mundo todo em uma ofensiva direta para três corações está prestes a acontecer!! Precisamos nos preparar!!");

			voltarMenu();
		}
	}

	static void instruções() {
		int value = 0;
		while (value != 1) {
			System.out.println("\n\n\n\nInstruções\n\n \n- Capitão: " + nomeJogador
					+ ", PRESTE MUITA ATENÇÃO! \nA dificuldade da nossa missão depende da arma que você escolher, uma arma mais forte te permitirá um abate preciso! "

					+ "Porém, um erro na mira e você já era!");
			System.out.println(
					"\nUma arma mais fraca lhe permite mais estabilidade e torna mais difícil para o inimigo te detectar, isso lhe permite mais tentativas... ");

			imprimirArsenal();
			voltarMenu();

		}

	}

	static void criadores() {
		int value = 0;
		while (value != 1) {
			System.out.println("Projeto Integrador (P.I)");
			System.out.println("Turma 1ºA TADS - Noturno, 2º Semestre, 2021");
			System.out.println("Desenvolvido por Bruna Vieira, Reidiney Silva, William Berg e Victor Beccare ");

			voltarMenu();

		}
	}

	// metodo que mostra o menu
	static void menu() {
		int valueMenu;

		do {
			// somente pedir o nome do jogador caso ainda ele não tenha digitado
			if (nomeJogador.equals("")) {
				System.out.println("Informe o seu nome: ");
				nomeJogador = input.nextLine();
			}

			System.out.println("\n" + "               			 .....   ...                                    \r\n"
					+ "                               ,:lc;,'.';:c;;;.                                 \r\n"
					+ "                             .dOo;,.';:;;;c::dd:.                               \r\n"
					+ "                            .dKKl'..,l;...cl:x00o.                              \r\n"
					+ "                         ...,l0O,.. 'lc,.'lkokXNk;.                             \r\n"
					+ "                         ...'.lo,...';,'':lldOKXkl'                             \r\n"
					+ "                           ,o:,'....,,';:::coodxll;                             \r\n"
					+ "                           .o,         ... ....:c:'                             \r\n"
					+ "                           .c,        ..'.  .  'l:.                             \r\n"
					+ "                            ,;.'......''',;'',:ll'                              \r\n"
					+ "                            ...okc... .;oddlkOo;.                               \r\n"
					+ "                            ...c0k,   ..,ldcxkc.                                \r\n"
					+ "                        .'.;llookkdl'....'clodl'.,::;'                          \r\n"
					+ "                    ..':clxOo;;;:llc,. ..,::lko,,:lc;l;                         \r\n"
					+ "                  ':;,clcodkl....,;'..''''.,cc,.';cc,cdc:,.                     \r\n"
					+ "               .,ll,. .,;:loxl.  .'....,,.',';;..col,,looxx:.                   \r\n"
					+ "            .;dOko' .. .;;,;ldo,.      .,;;'.....';. .cll;o0d'                  \r\n"
					+ "           .cKX0d;.......,;coooxl;'.....'',.   .....,,,dd;oXNO;.                \r\n"
					+ "         .'oKN0o,..,'.. ..'codddddl;;::,,,:c:,.'cdd::c,:,;k0k0Kx,.              \r\n"
					+ "       .;clOX0o,...''.   ...,::',lc;,'';clooxko;;dk;,o,.;lddoxKNK:              \r\n"
					+ "      'codOKxc;';:,;.....'..   ..,::,;ccloxdx00x:cxc,l'.colodx0KOd'             \r\n"
					+ "     .ooloc,'.. .',;,,oxdkkdl;........;odl;..l00occ::,..,;okdxKW0xo'            \r\n"
					+ "     .,.....';coxo::,';okOOxocc:.   ..........,;:co:,. ';.,lodONWKxc.           \r\n"
					+ "    .;odl:,:kNNKx,.'. .ldc,...':'. ....  ....':,'co:.  ,:.cxccxkXW0d:.          \r\n"
					+ "   .;oOk:'.c0Kko, ..  .;,....,,.,,....    ....lkooo,.. ,';Ox,:xooKNKk,          \r\n"
					+ "   .xXKo'..;oc;:'      ....',..  ;;.        ...cOklco; ..ll;oxlc::d0o.          \r\n"
					+ "   .dXOl;...''';.        ...   ..';.        . .'cdkOkc. .,,ldlcc::ox:.          \r\n"
					+ "    :0xl:'.....,'.   ..         ;c.....    .''.,coxkxl. .',:c:;;;cokx'          \r\n"
					+ "    .,::::;'......    .  ... .. .......   .'.,,.,dkddc...':lc:coooooo:.         \r\n"
					+ "        ...   .'';. ..    .. ........ ..';lo,.':;,ll:oolcldxxdooodO0dc.         \r\n"
					+ "              ..,c. ..    .......... .;c:coxxc..,....;ok00KWWNKl,oXNKl.         \r\n"
					+ "              ...:c,.'.   .. ......  .:c,:lodd, .....'''coo0NNNx:oKNk'          \r\n"
					+ "              .''cOd;'.....  .......  .''',,'..  .   ....,':ONNN0OKk.           \r\n"
					+ "               ':dOo,.    .. ... .,'     ..    ...',;. .,c,.:0XXXKd.            \r\n"
					+ "               'ldoc..            ..          ':'',':o:. .;,'oK0x;.             \r\n"
					+ "              ';:,',..                       .',..''';do. .ccld:.               \r\n"
					+ "              .'..  .                      ..'..   .:;,cc,,;'.                  \r\n"
					+ "              ...                .....     .. .     ...',.,lc.                  \r\n"
					+ "               ..           ..  ........   .   ....;lldo'...:l;                 \r\n"
					+ "               ...':l:.      .  .........'','...':o0K0XXl;:..;l:.               \r\n"
					+ "               ...cxko.....  .. ...'.',;:;,'',;;,;:kKk0NOoc...':c.              \r\n"
					+ "                .,do::... .,.... ..';oc'..',,,;::,.l0OkOOo.  ...;l,             \r\n"
					+ "                 ;d:........,,... .:dd:....,;;,,;',:d0Odoc.   .'.,c:.           \r\n"
					+ "                .okl' ...''...'.  .,,,............'',lxkOo.    .'.'cc.          \r\n"
					+ "                :O0x, ....'..... .......'.....'',,,,,,ckXK:      ...'.          \r\n"
					+ "               .kNk:. ...............',,,'...',,,,;:::ccd0d.                    \r\n"
					+ "               :0kc............................'''',;:oxkkO:                    \r\n"
					+ "              .dOd;. .......  .....   ......'..''',,;;:xKOko.                   \r\n"
					+ "              :0x:'. .......          ...',,........',,ck0KK:                   \r\n"
					+ "              ck:. ..........        .....',,.......'',cdOKNk.                  \r\n"
					+ "              cl.   .......,,.....   ..',,,,,'.'''',,';okxkXK; ");

			System.out.println("\n" + "  	  _____       _     _           _          ___    __  \r\n"
					+ " 	 / ____|     | |   | |         | |        / _ \\  / /  \r\n"
					+ "	| (___   ___ | | __| | __ _  __| | ___   | | | |/ /_  \r\n"
					+ "	 \\___ \\ / _ \\| |/ _` |/ _` |/ _` |/ _ \\  | | | | '_ \\ \r\n"
					+ "	 ____) | (_) | | (_| | (_| | (_| | (_) | | |_| | (_) |\r\n"
					+ "	|_____/ \\___/|_|\\__,_|\\__,_|\\__,_|\\___/   \\___/ \\___/ ");

			valueMenu = entradaDadosInt("\n(1) Jogar \n(2) História \n(3) Instruções \n(4) Créditos \n(0) Sair");

			switch (valueMenu) {
			case 1:
				jogar();
				break;
			case 2:
				historia();
				break;
			case 3:
				instruções();
				break;
			case 4:
				criadores();
				break;
			case 0:
				System.out.print("A guerra ainda lhe espera!");
				System.exit(0);
				break;
			default:
				System.out.println("\nEssa bala não encaixa no pente, escolha outra!");
			}
		} while (valueMenu != 0);
	}

	public static void main(String[] args) {
		// Para rodar os testes
		// testeGerarNumero();

		menu();
	}

	// TESTES

	// Victor
	static void testeGerarNumero() {
		int numero = 4;
		int numeroSorteado = gerarNumero(numero);
		if (numeroSorteado < numero) {
			System.out.println("Ok, passou no teste");
			System.out.println("Numero sorteado: " + numeroSorteado);
		} else {
			System.out.println("Essa não, temos um erro!");
		}

	}

}
