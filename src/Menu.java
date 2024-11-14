import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        boolean sair = false;

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
                    break;
                case 2:
                    System.out.println("Comprar Produtos");
                    break;
                case 3:
                    System.out.println("Filtra por Marca");
                    break;
                case 4:
                    System.out.println("Filtra por Modelo");
                    break;
                case 5:
                    System.out.println("Filtra por tamanho");
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