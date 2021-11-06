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
		System.out.println("Tudo começou pelo amanhecer daquele dia que seria marcado para sempre nos livros de história: "
				+ "\nO DIA QUE O BRASIL FOI INVADIDO!");
		System.out.println("A Coalisão era um grupo de países que se reuniram em busca da cura da praga que afetou a produção mundial de café."
				+ "\n Essa praga foi transmitida por fungos que eram propagados pelo ar por meio de esporos,"
				+ "estes que em contato com os grãos, alteravam a genética e impossibilitavam o desenvolvimento do grão de café.");
		
		System.out.println("Naquela manhã, o Major se encontrava no quartel extremamente enfurecido! E pronto para dar as ordens para o seu fiel subordinado, o Capitão:");
		
		System.out.println ("\n-Major:- Capitão! venha até aqui. "
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
		System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
				+ "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
				+ "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
				+ "MMMMMMWWNNNNNNNNNNXXXXXXXXXXKKKKKKKKKKKKKKKKKKKK0KKKK000000000000KKKKKKKKK0000000000KKKKKKXXNNWWMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
				+ "MMMMMKoc:;;,,,,,,,,,''''''''................''',,,,,,,,,'.....',',,,,,,,,,'',;;,,;;;;;;,'',,;;::clloodxkO0KXXNNWWMMMMMMM\r\n"
				+ "MMMMWOolc;,'........''',,,,;;;;;;;;:::::::::ccllllllllllllccclooooooooooooloodddddddxxddooooooooooooooooddxxkkO00KWMMMMM\r\n"
				+ "MMMMWOooolccccdxxkkkkOOOO0000000000000000000000000000000000000OOOOOOOOOOOOOOkkkOOkkOOOkkkkkkkkkkkkkkkkxxkkkkkkkkkONMMMMM\r\n"
				+ "MMMMWk:cc:;;;ckOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOkkOOkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkxoccokxdxkkkxONMMMMM\r\n"
				+ "MMMMWO:;;;clclkOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOkkkOOkOkkkkkkkkkkkkkkkkkkxxxxxxxxxxxddddddoc;:okddxkkkxONMMMMM\r\n"
				+ "MMMMWKxdoloxxdkOOOOOOxddddddddddoodddddddddddddddddddddddddddddddooooodddddddddddddddddddddddddddddol:,:oxddxkkkxONMMMMM\r\n"
				+ "MMMMWKxxxoodddkOOOOOkolddddddxxxxxxxxxxxxxxxkkkkkkkkkkkkkkkkkkkkkkkkkkOOOOOOOOOOOOOOOOOOOOOkOOOkkkkkxl:cdkddkkkkk0NMMMMM\r\n"
				+ "MMMMMKxxdoodddkOOOOOkodOOOOOOOOOOOOOOOOOOOOOOOOOOkOOOOkOkkOkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkdc:cdkddxkkkk0WMMMMM\r\n"
				+ "MMMMMKxddooddokOOOOOOodOOOOOOOOOOOOOOOOOOOOOOOOOkOOOkkkOOkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkdl:coxooxkkkk0WMMMMM\r\n"
				+ "MMMMMKxddoloookOOOOOkooOOkkOOOOOOOOOOOOOOOkkOOOkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkxdooddcokkkkk0WMMMMM\r\n"
				+ "MMMMMKddooloooxOOOOOkookOOkkkkkkkkOOkkOOkkkOkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkxlokkkkk0WMMMMM\r\n"
				+ "MMMMMKdoolllllxOOOOOkookkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkxkdldkkkkk0WMMMMM\r\n"
				+ "MMMMMKdoolllllxOOkkkkookkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkxdddxkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkxxkdldkkkkkKWMMMMM\r\n"
				+ "MMMMMKolllccclxOkkkkkookkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkxddxkxolllodxkkkkkkkkkkkkkkkkkkkkkkkkkkxxxxxxkdldkkkkkKWMMMMM\r\n"
				+ "MMMMM0:,,;:::cxOkOkkkookkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkxdkOkxxddoolooclxkkkkkkkkkkkkkkkkkkkkkkxxxxxxxxkdldkkkkkKWMMMMM\r\n"
				+ "MMMMMO,...,;;:xOkkkkkookkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkOO00OdoxkxxxdddocoxkkkkkkkkkkkkkxxxkkxkkxxxxxxxxkdldkkkkkKWMMMMM\r\n"
				+ "MMMMMO,...',,:dOkkkkkookkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkxdodxkkkkkxdoddxkkkkkkkkkkkkxxxxxxxxxxxxxxxxxxdldkkkkkKWMMMMM\r\n"
				+ "MMMMM0,...',,;dOkkkkkolkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkxlc:,;:coxxxxxxxdlodxkkkkkkkkxxxxxxxxxxxxxxxxxxxxxoldkkkkkKMMMMMM\r\n"
				+ "MMMMM0;.'',,,;dOkOkkOolkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkxl:;;;;;;ldxxxxdlccdkkkkkkkkkxkkxxxxxxxxxxxxxxxxxxoldkkkkkKMMMMMM\r\n"
				+ "MMMMM0:......,dOkkkkkolxkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkdc;::;,,;codoooxdoxkxkxxxkxxxxxxxxxxxxxxxxxxxxxxxoldkkkkkKMMMMMM\r\n"
				+ "MMMMM0;......,okkkkkkolxkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkdcloddoooodxkkkxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxolxkkkkkKMMMMMM\r\n"
				+ "MMMMMK;......'okkkkkkooxkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkxdooxkkkkOOxdxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxolxkkkkkKMMMMMM\r\n"
				+ "MMMMMK;......'okkkkkkdlxkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkxkkxkkxxddxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxlcxkkkkkXMMMMMM\r\n"
				+ "MMMMMK;......'okkkkkkdlxkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxllxkxkkkXMMMMMM\r\n"
				+ "MMMMMK;......'okkkkkkdlxkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxllxkxkxkXMMMMMM\r\n"
				+ "MMMMMX:......'lkkkkkkdlxkkkkkkkkkkkkkxxxxxxxddxxxxkkkkkkkkkkkkxxxxxxxxxxxxxxxxxxxxxddxxxxxxxxxxxxxxxxxxxxccxxxkxkXMMMMMM\r\n"
				+ "MMMMMXc......'lkkkkkkdlxkkkkkkkkkkxxxdddol:::::codxxxkkkkkkkkxxxxxxxxxxxxxxxxxxxxkxdlccoxxxxxxxxxxxxxxxxdclxxxxxkXMMMMMM\r\n"
				+ "MMMMMXc......'lkkkkkkdlxkkkkkkkxxxxdoolc:cccooc::codxxxxxxxxxxxxxxxxxxxxxxxxxxxddooo;..;oxxxxxxxxxxxxxxxdclxxxxxkXMMMMMM\r\n"
				+ "MMMMMNc......'lkkkkkkdlxkkkkkkkxxxdoll:,;looddlcc:coxxxxxxxxxxxxxxxxxxxxxxxxxxddo:,,...,lddxxxxxxxxxxxxxdclxxxxxkXMMMMMM\r\n"
				+ "MMMMMNl......'lkkkkkkdlxkxkxxxxxxxdolc::clddoooooddddxxxxxxxxxxxxxxxxxxxxxxxxddddollc;.,oddxxxxxxxxxxxxxdclxxxxxkNMMMMMM\r\n"
				+ "MMMMMNl......'ckkkkkkdlxkxkkxxxxxxdolcldxdlc:cox0XOddxxxxxxxxxxxxxxxxxxxxxxxxxddddddddlodddxxxxxxxxxxxxxdclxxxxxkNMMMMMM\r\n"
				+ "MMMMMNl.......cxkkkkkdldkxxxxxxxxxddoclxKOdoookXNKxdxxxxxxxxxxxxxxxxxxxxxxxxxxxddddddocldxxxxxxxxxxxxxxxdclxxxxxONMMMMMM\r\n"
				+ "MMMMMWo.......cxkkkkkdldkxxxxxxxxxxddolldO000KK0kdxxxxxxxxxxxxxxxxxxxxxxxxxxxdddddddd:..cdddxxxxxxxxxxxxdclxxxxxONMMMMMM\r\n"
				+ "MMMMMWo.......:xkkkkkdldkxxxxxxxxxxxxxxddoddddddxxxxxxxxxxxxxxxxxxxxxxxxxxxdddddddddo;..cdddddddxxxxxxxxdcoxxxxxONMMMMMM\r\n"
				+ "MMMMMKc.......:xkkkxkdldkxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxddddddddddc..cxdddxxxxxxolllllcoxxxxxONMMMMMM\r\n"
				+ "MMMMM0;.......:xkkkxkdldkxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxdddddddddddo:cdxxxxxxxxxdlcclooloxxxxxONMMMMMM\r\n"
				+ "MMMMMWx'......:xkxxxkdldkxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxdddddddxoldxxxxxxxxxxdlcclxxodxxxxxONMMMMMM\r\n"
				+ "MMMMMMNo......;dkxxxkdldkxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxdodxdddddddoooc:clxxooxxxxxONMMMMMM\r\n"
				+ "MMMMMMMK:.....;dkxxxkdldxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxdddddddooooooooooooooooooodddddddool:;:lxxooxxxxdONMMMMMM\r\n"
				+ "MMMMMMMMO;....;dxxxxxdldxxxxxxxxxxxxxxxddddddddoooooooooooooooooodddddddddddddddxxxxxxkkkkkkkkkkkkxoccoxxloxddddkNMMMMMM\r\n"
				+ "MMMMMMMMWx'...;dxxxxxdlodoodoooooddddddddddddddddddddxxxxxxxxkkkkkkkkkkkkkkxxxxxxxxxxxxxxxxxxxxxxxxolclddodddddddKMMMMMM\r\n"
				+ "MMMMMMMMMNd...,oxxxxxxddddddddxxxxxxxxkkkkkkxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxddxxxkkkOOOOOXMMMMMM\r\n"
				+ "MMMMMMMMMMXl..,oxxxxdxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxkkkkOOO00000KKKXXXXNNNNWWWWWMMMMMMMMMM\r\n"
				+ "MMMMMMMMMMMK:.,lxddxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxkkkkkOOO00000KKKKXXXNNNNWWWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
				+ "MMMMMMMMMMMWO;;oxxxxxxxxxxxxxxxxxxxxxxkkkkOOO00000KKKXXXXNNNNNWWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
				+ "MMMMMMMMMMMMWOdkkkkkOOOOO0000KKKXXXNNNNNWWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
				+ "MMMMMMMMMMMMMWWWWWWWWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
				+ "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
				+ "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
				+ "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
		
		System.out.println("\n\n\n\nInstruções\n\n \n- Capitão: " + name +  ", PRESTE MUITA ATENÇÃO! \nA dificuldade da nossa missão depende da arma que você escolher, uma arma mais forte te permitirá um abate preciso! "
				+ "Porém, um erro na mira e você já era!");
		System.out.println("\nUma arma mais fraca lhe permite mais estabilidade e torna mais difícil para o inimigo te detectar, isso lhe permite mais tentativas... ");
		System.out.println("Essas são as armas em nosso arsenal:\r\n"
				+ "\r\n"
				+ "Barrett M82 - (1 vida) 12,7×99mm NATO .416 Barrett\r\n"
				+ "Dragunov Sniper rifle - ( 2 vidas) 7,62×54mmR\r\n"
				+ "AWM - (1 vida) 7,62×67mm \r\n"
				+ "VSK-94 - ( 3 vidas) 9×39mm\r\n"
				+ "");
		
	}

	static void criadores() {

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
