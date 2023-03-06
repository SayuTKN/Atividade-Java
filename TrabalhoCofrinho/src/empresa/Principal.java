package empresa; //RU:6972295

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	public static int getOption() { //função para verificar input no menu
        int option = 0;
        try {
            System.out.printf(">>");
            option = new Scanner(System.in).nextInt();
        } catch (InputMismatchException e) { //verificação de input
            System.out.println("Tente novamente");
            getOption();
        }
        return option;
    }
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 
		int opcao;
		Cofrinho cofrinho = new Cofrinho(); //instanciar classe cofrinho

		System.out.println("-------------------");
		System.out.println("Menu: ");
		System.out.println("1 - Adicionar: ");
		System.out.println("2 - Remover: ");
		System.out.println("3 - Listar: ");
		System.out.println("4 - Total: ");
		System.out.println("5 - Encerrar: ");
		System.out.println("-------------------");
		opcao = getOption();
		
		float tipoMoeda, valorMoeda;
		while(opcao != 0) { //opção deve ser diferente de 0 para funcionar
			switch(opcao) { 
			
			case 1:
				tipoMoeda=0;
				while(tipoMoeda>3 || tipoMoeda<=0) {
					System.out.println("1 - Euro ");
					System.out.println("2 - Dolar ");
					System.out.println("3 - Real ");
					System.out.printf(">>");
					tipoMoeda = teclado.nextFloat();
				}
				System.out.println("Qual será o valor da moeda escolhida?");
				System.out.printf(">>");
				valorMoeda = teclado.nextFloat();
				
				Moeda moed=null;
				if (tipoMoeda== 1) {
					moed = new Euro(valorMoeda, "Euro - ");	
				}
				if (tipoMoeda== 2) {
					moed = new Dolar(valorMoeda, "Dolar - ");
				}
				if (tipoMoeda== 3) {
					moed = new Real(valorMoeda, "Real - ");
				}
				cofrinho.adicionar(moed);
				break;
			case 2:
				tipoMoeda=0;
				while(tipoMoeda>3 || tipoMoeda<=0) {
					System.out.println("1 - Euro ");
					System.out.println("2 - Dolar ");
					System.out.println("3 - Real ");
					System.out.println("-------------------");
					System.out.printf(">>");
					tipoMoeda = teclado.nextInt();
				}
				System.out.println("Qual será o valor da moeda escolhida?");
				System.out.printf(">>");
				valorMoeda = teclado.nextFloat();
				
				moed=null; //inicializando variável
				if (tipoMoeda== 1) {
					moed = new Euro(valorMoeda, "Euro - ");	
				}
				if (tipoMoeda== 2) {
					moed = new Dolar(valorMoeda, "Dolar - ");
				}
				if (tipoMoeda== 3) {
					moed = new Real(valorMoeda, "Real - ");
				}
				cofrinho.remover(moed);
				break;
			case 3:
				cofrinho.listar();
				break;
			case 4:
				cofrinho.totalConvertido();
				break;
			case 5:
				System.out.printf("Encerrando...");
				return;
			default:
				System.out.println("Opção invalida.");
				break;
			}
			System.out.println("-------------------");
			System.out.println("Menu: ");
			System.out.println("1 - Adicionar: ");
			System.out.println("2 - Remover: ");
			System.out.println("3 - Listar: ");
			System.out.println("4 - Total: ");
			System.out.println("5 - Encerrar: ");
			System.out.println("-------------------");
			System.out.printf(">>");
			opcao = teclado.nextInt();	
			}
		}
	}