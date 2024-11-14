package services;

import java.util.Scanner;

import controller.CalcadoController;
import model.Calcado;

public abstract class MenuServices {
    static CalcadoController calcadoController = new CalcadoController();
    static Scanner scanner = new Scanner(System.in);

    static String[] modelos = { "Air Max", "Superstar", "Wave", "Yellow Boot", "CAT", "Fox", "Mercurial", "Predator","Future" };
    static String[] marcas = { "Nike", "Adidas", "Mizuno", "Timberland", "Caterpillar", "Bull Terrier", "Puma" };
    static int[] tamanhos = { 42, 40, 41 };
    
        public static void  mostrarProdutos() {
            System.out.println("Mostrar Todos os Produtos");
            calcadoController.mostrarCalcados();
        }
    
        public static void comprarProdutos() {
            System.out.println("Comprar Produtos");
            System.out.println("Digite o modelo do produto que deseja comprar: ");
            for (var md : modelos) {
                System.out.println("Modelo: " + md);
            }
            String modelo = scanner.next();
            Calcado calcado = calcadoController.buscarCalcadoPorModelo(modelo);
            calcadoController.comprarCalcado(calcado);
        }

        public static void mostrarProdutosPorMarca() {
            System.out.println("Filtra por Marca");
            System.out.println("Digite a marca que deseja filtrar: ");
            for (var mc : marcas) {
                System.out.println("Marca: " + mc);
            }
            String marca = scanner.next();
            calcadoController.mostrarCalcadosPorMarca(marca);
        }

        public static void mostrarProdutosPorModelo() {
            System.out.println("Filtra por Modelo");
            System.out.println("Digite o modelo que deseja filtrar: ");
            for (var md : modelos) {
                System.out.println("Modelo: " + md);
            }
            String modeloFiltro = scanner.next();
            calcadoController.mostrarCalcadosPorModelo(modeloFiltro);
        }

        public static void mostrarProdutosPorTamanho() {
            System.out.println("Filtra por tamanho");
            for (var tm : tamanhos) {
                System.out.println("Tamanho: " + tm);
            }
            System.out.println("Digite o tamanho que deseja filtrar: ");
            int tamanho = scanner.nextInt();
            calcadoController.mostrarCalcadosPorTamanho(tamanho);
        }
}