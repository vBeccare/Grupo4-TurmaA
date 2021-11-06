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

	}

	static void historia() {

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
