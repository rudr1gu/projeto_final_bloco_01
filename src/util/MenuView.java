package util;

public  abstract class MenuView {
    public static void menu() {
        System.out.println("*****************************************************");
        System.out.println("                                                     ");
        System.out.println( Cores.TEXT_PURPLE_BOLD_BRIGHT + "                RudShoes                     "+ Cores.TEXT_RESET);
        System.out.println("                                                     ");
        System.out.println("*****************************************************");
        System.out.println("                                                     ");
        System.out.println(Cores.TEXT_GREEN_BRIGHT +"            1 - Mostrar Todos os Produtos                          ");
        System.out.println("            2 - Comprar Produtos               ");
        System.out.println("            3 - Filtra por Marca              ");
        System.out.println("            4 - Filtra por Modelo             ");
        System.out.println("            5 - Filtra por tamanho                         "+ Cores.TEXT_RESET);
        System.out.println(Cores.TEXT_RED_BRIGHT + "            6 - Sair                                 "+ Cores.TEXT_RESET);
        System.out.println("                                                     ");
        System.out.println("*****************************************************");
        System.out.println("Entre com a opção desejada:                          ");
        System.out.println("                                                     ");
    }

    public static void creditos() {
        System.out.println("*****************************************************");
        System.out.println("                                                     ");
        System.out.println("            Desenvolvido por:                        ");
        System.out.println(Cores.TEXT_GREEN_BRIGHT + "            - Rodrigo Santos( Rudr1gu )              " + Cores.TEXT_RESET);
        System.out.println("            - github.com/Rudr1gu                     ");
        System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "         - Generation Brasil - Turma Java78             "+ Cores.TEXT_RESET);
        System.out.println("*****************************************************");
    }
}
