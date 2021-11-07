package jogoRPG;

import java.util.Scanner;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;

public class JogoRPG {
	// variaveis globais que usaremos em diversas partes do jogo
	static Scanner input = new Scanner(System.in);
	static String nomeJogador = "";

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

	//gerar numero aleatorio
	static int gerarNumero(int valorMaximo) {
		int numeroAleatorio;
		Random sorteio = new Random();
		numeroAleatorio = sorteio.nextInt(valorMaximo);
		return numeroAleatorio;
	}

	
	//formular logica de pergunta
	static void formularPergunta(int[][] alternativas, int numeroQuestao, int valorPergunta, int valorResposta) {
		ArrayList<Integer> listaResposta = new ArrayList<Integer>();

		for (int j = 0; j < alternativas[0].length; j++) {
			listaResposta.add(alternativas[numeroQuestao][j]);

		}

		Collections.shuffle(listaResposta);

		System.out.println(
				"Para abrir o cadeado, converta os seguintes dígitos de binário para decimal: \n" + valorPergunta);

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
		int index = 0;

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
		}

		if (listaResposta.get(index) == valorResposta) {
			System.out.println("Resposta Correta");

		} else {
			System.out.println("Resposta incorreta");
		}

	}

	// espaço para trabalhar com as perguntas
	static void desafio1(int numeroQuestao) {

		int[] valoresPergunta = { 10110110, 10111100, 01111111, 10010110, 11011100 };
		int[] valoresResposta = { 182, 188, 127, 150, 220 };
		int valorPergunta = valoresPergunta[numeroQuestao];
		int valorResposta = valoresResposta[numeroQuestao];
		int[][] alternativas = new int[][] { { 182, 181, 176, 170, 175 }, { 188, 185, 190, 181, 182 },
				{ 127, 128, 129, 130, 131 }, { 150, 145, 148, 152, 153 }, { 221, 230, 220, 231, 227 } };

		formularPergunta(alternativas, numeroQuestao, valorPergunta, valorResposta);

	}

	// o jogar será divididos em partes, abaixo está cada parte que será encaixada
	// ao jogo

	static void prologo() {
		System.out.println(
				"Tudo começou pelo amanhecer daquele dia que seria marcado para sempre nos livros de história: "
						+ "\nO DIA QUE O BRASIL FOI INVADIDO!");
		System.out.println(
				"A Coalisão era um grupo de países que se reuniram em busca da cura da praga que afetou a produção mundial de café."
						+ "\n Essa praga foi transmitida por fungos que eram propagados pelo ar por meio de esporos,"
						+ "estes que em contato com os grãos, alteravam a genética e impossibilitavam o desenvolvimento do grão de café.");

		System.out.println(
				"Naquela manhã, o Major se encontrava no quartel extremamente enfurecido! E pronto para dar as ordens para o seu fiel subordinado, o Capitão:");

		System.out.println("\n-Major:- Capitão! venha até aqui. "
				+ "\n Precisamos alocar o quanto antes o novo soldado da classe Sniper no batalhão.");
		System.out.println("-Capitão: Certo! Irei fazer isso! Inclusive, qual o seu nome, filho?");

		System.out.println("-Personagem: " + nomeJogador);

		System.out.println("-Major: " + nomeJogador + "? Hahahaha!! Isso aqui é uma guerra! "
				+ "\nAqueles selvagens estão nos atacando e vocês vão ficar trocando figurinhas sobre um ao outro? "
				+ "\nAqui você vai ser o soldado 06!” Gritou.");

		System.out.println("E depois de ser apresentado ao quartel, 06 começou o seu treinamento junto com o capitão. "
				+ "\n Uma pena que eles não puderam continuar a conversa, pois ali próximo as tropas da coalisão"
				+ "\n estavam invadindo o terreno. Eram milhares de soldados descendo pelo céu de paraquedas.");

	}

	static void historiaParte1() {
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

	}

	// ------- aqui termina os metodos usados no jogar -------

	// metodo para rodar o jogo
	static void jogar() {
		prologo();
		historiaParte1();
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
			System.out.println("Essas são as armas em nosso arsenal:\r\n" + "\r\n"
					+ "Barrett M82 - (1 vida) 12,7×99mm NATO .416 Barrett\r\n"

					+ "Dragunov Sniper rifle - ( 2 vidas) 7,62×54mmR\r\n" + "AWM - (1 vida) 7,62×67mm \r\n"
					+ "VSK-94 - ( 3 vidas) 9×39mm\r\n" + "");

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
