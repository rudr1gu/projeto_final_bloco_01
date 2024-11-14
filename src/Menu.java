import java.util.Scanner;

import services.MenuServices;
import util.KeyPress;
import util.MenuView;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        boolean sair = false;

        System.out.println("Bem-vindo ao RudShoes!");

        while (!sair) {
            MenuView.menu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    MenuServices.mostrarProdutos();
                    KeyPress.pressKeyToContinue();
                    break;
                case 2:
                    MenuServices.comprarProdutos();
                    KeyPress.pressKeyToContinue();
                    break;
                case 3:
                    MenuServices.mostrarProdutosPorMarca();
                    KeyPress.pressKeyToContinue();
                    break;
                case 4:
                    MenuServices.mostrarProdutosPorModelo();
                    KeyPress.pressKeyToContinue();
                    break;
                case 5:
                    MenuServices.mostrarProdutosPorTamanho();
                    KeyPress.pressKeyToContinue();
                    break;
                case 6:
                    sair = true;
                    MenuView.creditos();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}