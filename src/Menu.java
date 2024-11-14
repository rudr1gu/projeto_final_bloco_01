import java.util.Scanner;

import controller.CalcadoController;
import model.Calcado;
import util.KeyPress;
import util.MenuView;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        boolean sair = false;

        String[] modelos = { "Air Max", "Superstar", "Wave", "Yellow Boot", "CAT", "Fox", "Mercurial", "Predator","Future" };
        String[] marcas = { "Nike", "Adidas", "Mizuno", "Timberland", "Caterpillar", "Bull Terrier", "Puma" };
        int[] tamanhos = { 42, 40, 41 };

        CalcadoController calcadoController = new CalcadoController();

        System.out.println("Bem-vindo ao RudShoes!");

        while (!sair) {
            MenuView.menu();
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
                    for(var md : modelos){
                        System.out.println("Modelo: "+ md);
                    }
                    String modelo = scanner.next();
                    Calcado calcado = calcadoController.buscarCalcadoPorModelo(modelo);
                    calcadoController.comprarCalcado(calcado);
                    KeyPress.pressKeyToContinue();
                    break;
                case 3:
                    System.out.println("Filtra por Marca");
                    System.out.println("Digite a marca que deseja filtrar: ");
                    for(var mc : marcas){
                        System.out.println("Marca: "+ mc);
                    }
                    String marca = scanner.next();
                    calcadoController.mostrarCalcadosPorMarca(marca);
                    KeyPress.pressKeyToContinue();
                    break;
                case 4:
                    System.out.println("Filtra por Modelo");
                    for(var md : modelos){
                        System.out.println("Modelo: "+ md);
                    }
                    System.out.println("Digite o modelo que deseja filtrar: ");
                    String modeloFiltro = scanner.next();
                    calcadoController.mostrarCalcadosPorModelo(modeloFiltro);
                    KeyPress.pressKeyToContinue();
                    break;
                case 5:
                    System.out.println("Filtra por tamanho");
                    for(var tm : tamanhos){
                        System.out.println("Tamanho: "+ tm);
                    }
                    System.out.println("Digite o tamanho que deseja filtrar: ");
                   
                    int tamanho = scanner.nextInt();
                    calcadoController.mostrarCalcadosPorTamanho(tamanho);
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