import java.util.Scanner;

import Controller.CalcadoController;
import model.Calcado;
import util.KeyPress;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        boolean sair = false;

        CalcadoController calcadoController = new CalcadoController();

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
                    calcadoController.mostrarCalcados();
                    KeyPress.pressKeyToContinue();
                    break;
                case 2:
                    System.out.println("Comprar Produtos");
                    System.out.println("Digite o modelo do produto que deseja comprar: ");
                    String modelo = scanner.next();
                    Calcado calcado = calcadoController.buscarCalcadoPorModelo(modelo);
                    calcadoController.comprarCalcado(calcado);
                    KeyPress.pressKeyToContinue();
                    break;
                case 3:
                    System.out.println("Filtra por Marca");
                    System.out.println("Digite a marca que deseja filtrar: ");
                    String marca = scanner.next();
                    calcadoController.mostrarCalcadosPorMarca(marca);
                    KeyPress.pressKeyToContinue();
                    break;
                case 4:
                    System.out.println("Filtra por Modelo");
                    System.out.println("Digite o modelo que deseja filtrar: ");
                    String modeloFiltro = scanner.next();
                    calcadoController.mostrarCalcadosPorModelo(modeloFiltro);
                    KeyPress.pressKeyToContinue();
                    break;
                case 5:
                    System.out.println("Filtra por tamanho");
                    System.out.println("Digite o tamanho que deseja filtrar: ");
                    int tamanho = scanner.nextInt();
                    calcadoController.mostrarCalcadosPorTamanho(tamanho);
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