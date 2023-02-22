package conta;

import java.util.Scanner;

import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Conta c1 = new Conta(1, 123, 1, "Carol", 100.0f);
		//c1.visualizar();
		//c1.setSaldo(1100.0f);
		//System.out.println(c1.getSaldo());
		int opcao;

		ContaCorrente c2 = new ContaCorrente(2, 123, 1, "Carol", 100.0f, 500.0f);
		c2.sacar(300);
		c2.visualizar();
		
		ContaPoupanca c3 = new ContaPoupanca(2, 123, 2, "Carol", 100.0f, 15);
		c3.visualizar();
		
		while (true) {
			System.out.println(Cores.ANSI_BLACK_BACKGROUND_BRIGHT + Cores.TEXT_WHITE_BOLD + "_____________________________________________________");
			System.out.println("                                                     ");
			System.out.println("      " + Cores.TEXT_GREEN_BOLD + "▌│█║▌║▌║" + Cores.TEXT_RESET + Cores.ANSI_BLACK_BACKGROUND_BRIGHT + " BANCO DO BRAZIL COM Z " + Cores.TEXT_GREEN_BOLD + "║▌║▌║█│▌" + Cores.TEXT_RESET + Cores.ANSI_BLACK_BACKGROUND_BRIGHT + "        ");
			System.out.println("_____________________________________________________");
			System.out.println("                                                     ");
			System.out.println("        >-< 1 - Criar Conta                          ");
			System.out.println("        >-< 2 - Listar todas as Contas               ");
			System.out.println("        >-< 3 - Buscar Conta por Numero              ");
			System.out.println("        >-< 4 - Atualizar Dados da Conta             ");
			System.out.println("        >-< 5 - Apagar Conta                         ");
			System.out.println("        >-< 6 - Sacar                                ");
			System.out.println("        >-< 7 - Depositar                            ");
			System.out.println("        >-< 8 - Transferir valores entre Contas      ");
			System.out.println("        >-< 9 - Sair                                 ");
			System.out.println("_____________________________________________________");
			System.out.println("                                                     ");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu futuro começa aqui!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Criar Conta\n\n");
				break;
			case 2:
				System.out.println("Listar todas as Contas\n\n");
				break;
			case 3:
				System.out.println("Consultar dados da Conta - por número\n\n");
				break;
			case 4:
				System.out.println("Atualizar dados da Conta\n\n");
				break;
			case 5:
				System.out.println("Apagar a Conta\n\n");
				break;
			case 6:
				System.out.println("Saque\n\n");
				break;
			case 7:
				System.out.println("Depósito\n\n");
				break;
			case 8:
				System.out.println("Transferência entre Contas\n\n");
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}

		}

	}

}
