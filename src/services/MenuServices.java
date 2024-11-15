package services;

import java.util.Scanner;

import controller.CalcadoController;
import model.Calcado;
import model.Tennis;
import model.Bota;
import model.Chuteira;


public abstract class MenuServices {
    static CalcadoController calcadoController = new CalcadoController();
    static Scanner scanner = new Scanner(System.in);

    static String[] modelos = { "Air-Max", "Superstar", "Wave", "Yellow Boot", "CAT", "Fox", "Mercurial", "Predator","Future" };
    static String[] marcas = { "Nike", "Adidas", "Mizuno", "Timberland", "Caterpillar", "Bull-Terrier", "Puma" };
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

        public static void entrarComoAdm(){
            System.out.println("Digite a senha de administrador: ");
            String senha = scanner.next();
            if(senha.equals("123")){
                System.out.println("Bem vindo administrador");
                System.out.println("1 - Adicionar Produto");
                System.out.println("2 - Remover Produto");
                System.out.println("3 - Atualizar Produto");
                System.out.println("4 - Mostrar Produtos");
                System.out.println("5 - Sair");
                int opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        adicionarProduto();
                        break;
                    case 2:
                        removerProduto();
                        break;
                    case 3:
                        atualizarProduto();
                        break;
                    case 4:
                        mostrarProdutos();
                        break;
                    case 5:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            }else{
                System.out.println("Senha incorreta");
            }
        }

        public static void adicionarProduto(){
            System.out.println("Adicionar Produto");
            System.out.println("Digite o modelo do produto: ");
            String modelo = scanner.next();
            
            System.out.println("Digite a marca do produto: ");
            String marca = scanner.next();

            System.out.println("Digite a cor do produto: ");
            String cor = scanner.next();
            
            System.out.println("Digite o tamanho do produto: ");
            int tamanho = scanner.nextInt();

            System.out.println("Digite a quantidade do produto: ");
            int quantidade = scanner.nextInt();

            System.out.println("Digite o preço do produto: ");
            double preco = scanner.nextDouble();

            System.out.println("Qual o tipo do produto: ");
            System.out.println("1 - Tenis");
            System.out.println("2 - Bota");
            System.out.println("3 - Chuteira");
            int tipo = scanner.nextInt();
            switch (tipo) {
                case 1:
                    System.out.println("Digite o tipo de tenis: ");
                    String tipoTennis = scanner.next();
                    Tennis tennis = new Tennis(marca, modelo, cor, preco, quantidade, tamanho, tipoTennis);
                    calcadoController.adicionarCalcado(tennis);
                    break;
                case 2:
                    System.out.println("Digite o tipo de bota: ");
                    String tipoBota = scanner.next();
                    Bota bota = new Bota(marca, modelo, cor, preco, quantidade, tamanho, tipoBota);
                    calcadoController.adicionarCalcado(bota);
                    break;
                case 3:
                    System.out.println("Digite o tipo de chuteira: ");
                    String tipoChuteira = scanner.next();
                    Chuteira chuteira = new Chuteira(marca, modelo, cor, preco, quantidade, tamanho, tipoChuteira);
                    calcadoController.adicionarCalcado(chuteira);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }    
        }

        public static void removerProduto(){
            System.out.println("Remover Produto");
            System.out.println("Digite o modelo do produto que deseja remover: ");
            for (var md : modelos) {
                System.out.println("Modelo: " + md);
            }
            String modelo = scanner.next();
            Calcado calcado = calcadoController.buscarCalcadoPorModelo(modelo);
            calcadoController.removerCalcado(calcado);
        }

        public static void atualizarProduto(){
            System.out.println("Atualizar Produto");
            System.out.println("Digite o modelo do produto que deseja atualizar: ");
            for (var md : modelos) {
                System.out.println("Modelo: " + md);
            }
            String modelo = scanner.next();
            Calcado calcado = calcadoController.buscarCalcadoPorModelo(modelo);
            calcadoController.AtualizarEstoque(calcado);
        }
}