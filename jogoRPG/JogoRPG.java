package jogoRPG;

import java.util.Scanner;

public class JogoRPG {
	static Scanner input = new Scanner(System.in);
	static String nomeJogador;

	// Método para entradas de números
	static int entradaDadosInt(String text) {
		System.out.println(text);
		int numberInput = input.nextInt();
		return numberInput;

	}

	static void jogar() {
		prologo();
	}

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

	static void instruções(String name) {

		System.out.println("\n\n\n\nInstruções\n\n \n- Capitão: " + name
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

	static void menu() {
		int valueMenu;
		System.out.println("Informe o seu nome: ");
		nomeJogador = input.nextLine();
		do {

			valueMenu = entradaDadosInt("\n(1) Jogar \n(2) História \n(3) Instruções \n(4) Créditos \n(0) Sair");

			switch (valueMenu) {
			case 1:
				jogar();
				break;
			case 2:
				historia();
				break;
			case 3:
				instruções(nomeJogador);
				break;
			case 4:
				criadores();
				break;
			case 0:
				System.out.print("A guerra ainda lhe espera!");
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
