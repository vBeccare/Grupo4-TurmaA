package jogoRPG;

import java.util.Scanner;

public class JogoRPG {
	static Scanner input = new Scanner(System.in);

	static int entradaDadosInt(String text) {
		System.out.println(text);
		int numberInput = input.nextInt();
		return numberInput;

	}

	static void jogar() {

	}

	static void historia() {

	}

	static void instru��es() {

	}

	static void criadores() {

	}

	static void menu() {
		int valueMenu;
		do {

			valueMenu = entradaDadosInt("\n(1) Jogar \n(2) Hist�ria \n(3) Instru��es \n(4) Cr�ditos \n(0) Sair");

			switch (valueMenu) {
			case 1:
				jogar();
				break;
			case 2:
				historia();
				break;
			case 3:
				instru��es();
				break;
			case 4:
				criadores();
				break;
			case 0:
				System.out.println("A guerra ainda lhe espera!");
				break;
			default:
				System.out.println("\nEssa bala n�o encaixa no pente, escolha outra!");
			}
		} while (valueMenu != 0);
	}

	public static void main(String[] args) {
		menu();
	}
}
