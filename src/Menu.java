import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        boolean sair = false;

        System.out.println("Bem-vindo ao e-commerce!");


        while (!sair) {
            System.out.println("1 - Mostrar Produtos");
            System.out.println("2 - Comprar Produtos");
            System.out.println("3 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = Integer.parseInt(System.console().readLine());

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrando...");
                    break;
                case 2:
                    System.out.println("Listando...");
                    break;
                case 3:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }

}
