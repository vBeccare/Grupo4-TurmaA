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
				System.out.println("\nQue coragem! Lembre que você não pode falhar nenhuma vez! ");
				break;
			case 2:
				vida = 2;
				System.out.println("\nBoa escolha! Tem a chance de errar 2 vezes! ");
				break;
			case 4:
				vida = 3;
				System.out.println("\nJogando de forma tranquila, as 3 vidas estão em jogo!");
				break;
			default:
				System.out.println("Poxa, soldado, aonde você está vendo essa opção? Escolha novamente!");
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

	static void desafio2(int numeroQuestao) {

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

		String pergunta3 = "\nDado um valor " + valorPergunta3 + " em hexadecimal, converta o número para octal: \n";
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
				+ " maior do que B. Se A e B acertaram juntas" + valorPergunta2 + "tiros, então o "
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

		String pergunta6 = "\n Se A=√(√6-2). √(2+√6), então o valor de A é: ";

		formularPergunta(alternativas6, numeroQuestao6, valorResposta6, pergunta6, "tiro");

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
				+ "\n Precisamos alocar o quanto antes o novo soldado da classe Sniper no batalhão.");
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
				+ "-Major: Capitão, eu te ordeno a eliminar este cretino! O infeliz já matou mais que a peste negra! Estou perdendo muitos homens!!!\r\n"
				+ "\r\n" + "Certo, estamos a caminho! “Disse o Capitão”\r\n" + "\r\n"
				+ "-06: Capitão! O que faremos?\r\n" + "\r\n"
				+ "-Capitão: Agora iremos para o arsenal, você precisará de escolher um rifle para o combate.\r\n"
				+ "\r\n"
				+ "-E antes que eu me esqueça, implementamos recentemente novas senhas nos cofres, você precisará de responder corretamente a pergunta feita para abrir o seu cofre."
				+ "\n Tome muito cuidado! Pois se você errar 3 vezes seu cofre ficará trancado para sempre!\r\n"
				+ "\r\n" + "-06: Entendido Capitão!\r\n");

		desafio1(numeroSorteado);
		// definir a variavel como false, para não pular a proxima pergunta
		correto = false;

		System.out.println("\n-Capitão: Boa 06!!! Agora escolhe logo um rifle pois não temos muito tempo!");

		escolhaRifle();

	}

	static void historiaParte2() {

	}

	static void historiaParte3() {
		// teste verificar se essa é a parte 3 da historia
		
		/*System.out.println( " Depois da escalada, Capitão e 06 se posicionaram atrás de uma rocha que serviria de cobertura. E enquanto se prepararam, 06 viu algo que mudaria completamente o seu comportamento.
		 
	 	- Capitão: Precisamos encontrar esse Sniper o quanto antes! Prepare o seu fuzil enquanto eu o localizo com o binóculo.

		- 06: Certo! Ei espera... aquele ali não é o meu vizinho?

		/*Naquele momento 06 viu o seu vizinho e amigo de quartel sendo morto pelo Sniper, como se não bastasse ter visto aquela cena, ele também conseguiu localizar o atirador. Enfurecido, ele tomou agiu imediatamente, se posicionou e se preparou para atirar.*/
		
	}

	static void historiaParte4() {
		// teste verificar se essa é a parte 4 da historia
		
		/* System.out.println( " Surpreso pelo tiro certeiro, Capitão chamou a atenção de 06 pela atitude inesperada, e o repreendeu.

- “Seu imprudente! Já pensou se você erra e ele nos fuzila? O que seria da missão e do resto do batalhão? Seu maluco!!!” Exclamou o capitão com uma certa admiração pela boa pontaria.

- 06: Ele matou o meu amigo! Você não faria o mesmo?

- Capitão: Cara eu só não vou te reportar para o Major por você ter sido eficiente, mas saiba que aqui a gente não faz o que dá na telha! A gente segue ordens! Entendido?

- “Sim senhor capitão!” Exclamou 06 prestando continência.

Depois deste combate, os dois seguiram para a região de Mogi para deter o desembarque das tropas que aterrissariam em aviões, era preciso ser rápido pois a segunda parte da cura ainda corria risco.



•	Eu não preciso dominar o mundo, só preciso ajudar o meu país


06 e Capitão partiram em disparada, eles precisavam de chegar em Mogi o quanto antes, pois como o ataque da coalisão foi muito mal coordenado, o Major acreditava que era possível encurralar as tropas e expulsá-las para as praias de Paraty, ou até mesmo capturá-las. Mas independente do método, era de suma importância que os Franco-Atiradores inimigos fossem eliminados.

Enquanto Capitão dirigia o caminhão militar com os demais soltados na caçamba, 06 estava no banco do carona pensando em como seria a batalha, ele parecia um pouco ansioso

- Capitão: 06! O que você tanto pensa aí? Não acha que está um pouco quieto demais?

- “Não Capitão, eu só estou me preparando para o combate” disse 06 com um pouco de medo.

- Capitão: Cara, eu sei que você está com medo, mas pensa bem. Se a gente sair daqui a gente pode montar uma empresa, abrir um negócio, ficar ricos e dominar o mundo! São infinitas as possibilidades! 

Mas isso só vai acontecer se a gente se sair bem e conseguir vencer essa batalha!!! Ânimo 06!

- “Tudo bem Capitão!” disse 06 mais confiante.


Ao chegar em Mogi a guerra já estava ocorrendo no aeroporto, porém dessa vez a coalisão estava totalmente perdida, pois já havia tropas advindas de Campinas e São Paulo combatendo no local.
Ao ver o cenário favorável 06 mudou, e com as ordens do Capitão ele se transformou em uma máquina! Uma besta enjaulada com ódio! Não deixando uma alma viva sequer no seu caminho!

(Imagem do 06 putasso!!)

- Capitão: 06! Inimigo às 2 horas!!

- 06: Inimigo abatido!

- Capitão: Boa 06! Agora tenha cuidado! Inimigo avistado às 12 horas!!

- 06: Inimigo abatido!

- Capitão: Também atirando com o meu fuzil fica fácil! Agora elimina aquele ali que está às 10 horas lá na guarita.

*/

	}

	static void historiaParte5() {

	}

	static void historiaParte6() {

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
					+ "   do solo brasileiro, a tensões aumentaram.A \"Organização Mundial de Programadores\" (OMP) falava que era impossível trabalhar \r\n"
					+ "───────────────▓▓▓▓▓▓▓▓"
					+ " em tais condições, e que seus programadores regrediram ao ponto de não conseguirem executar um simples: \"Hello World\". \r\n"
					+ "Também foram professores, advogados, traders, caminhoneiros e diversas outras profissões do mundo todo.\""
					+ "\r\n" + "O inevitável aconteceu... GUERRA!!!\r\n" + "\r\n"
					+ "Diversos países do mundo todo em uma ofensiva direta para três corações está prestes a acontecer!! Precisamos nos preparar!!");

			value = entradaDadosInt("\n(1) Voltar");

			if (value != 1) {
				System.out.println("\nOpção inválida!");
			} else {
				menu();
			}
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

			value = entradaDadosInt("\n(1) Voltar");

			if (value != 1) {
				System.out.println("\nOpção inválida!");
			} else {
				menu();
			}
		}

	}

	static void criadores() {
		int value = 0;
		while (value != 1) {
			System.out.println("Projeto Integrador (P.I)");
			System.out.println("Turma 1ºA TADS - Noturno, 2º Semestre, 2021");
			System.out.println("Desenvolvido por Bruna Vieira, Reidiney Silva, William Berg e Victor Beccare ");

			value = entradaDadosInt("\n(1) Voltar");

			if (value != 1) {
				System.out.println("\nOpção inválida!");
			} else {
				menu();
			}
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
		menu();
	}
}
