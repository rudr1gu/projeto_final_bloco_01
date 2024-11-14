package util;

public  abstract class MenuView {
    public static void menu() {
        System.out.println("1 - Mostrar Todos os Produtos");
        System.out.println("2 - Comprar Produtos");
        System.out.println("3 - Filtra por Marca ");
        System.out.println("4 - Filtra por Modelo ");
        System.out.println("5 - Filtra por tamanho ");
        System.out.println("6 - Sair");
        System.out.print("Digite a opção desejada: ");
    }

    public static void creditos() {
        System.out.println("Desenvolvido por: ");
        System.out.println("Rodrigo Santos Silva - 2024");
        System.out.println("github.com/rudr1gu");
        System.out.println("Generation Brasil - Java78"); 
    }
}
