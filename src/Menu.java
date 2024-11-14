import java.security.Key;
import java.util.Scanner;

import database.CalcadosEstoque;
import util.KeyPress;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        boolean sair = false;

        CalcadosEstoque calcadosEstoque = new CalcadosEstoque();

        System.out.println("Bem-vindo ao Rudr1gu-Shoes!");

        while (!sair) {
            System.out.println("1 - Mostrar Todos os Produtos");
            System.out.println("2 - Comprar Produtos");
            System.out.println("3 - Filtra por Marca ");
            System.out.println("4 - Filtra por Modelo ");
            System.out.println("5 - Filtra por tamanho ");
            System.out.println("6 - Sair");

            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Mostrar Todos os Produtos");
                    calcadosEstoque.mostrarCalcados();
                    KeyPress.pressKeyToContinue();
                    break;
                case 2:
                    System.out.println("Comprar Produtos");
                    KeyPress.pressKeyToContinue();
                    break;
                case 3:
                    System.out.println("Filtra por Marca");
                    KeyPress.pressKeyToContinue();
                    break;
                case 4:
                    System.out.println("Filtra por Modelo");
                    KeyPress.pressKeyToContinue();
                    break;
                case 5:
                    System.out.println("Filtra por tamanho");
                    KeyPress.pressKeyToContinue();
                    break;
                case 6:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}