package database;

import java.util.ArrayList;

import model.Bota;
import model.Calcado;
import model.Chuteira;
import model.Tennis;


public class CalcadosEstoque {
    private ArrayList<Calcado> calcados = new ArrayList<Calcado>();

    Tennis tennis1 = new Tennis("Nike", "Air Max", "Preto", 500.00, 10, 42, "Corrida");
    Tennis tennis2 = new Tennis("Adidas", "Superstar", "Branco", 300.00, 5, 40, "Casual");
    Tennis tennis3 = new Tennis("Mizuno", "Wave", "Azul", 400.00, 7, 41, "Corrida");

    Bota bota1 = new Bota("Timberland", "Yellow Boot", "Amarelo", 600.00, 3, 42, "Trilha");
    Bota bota2 = new Bota("Caterpillar", "CAT", "Marrom", 400.00, 2, 41, "Trabalho");
    Bota bota3 = new Bota("Bull Terrier", "Fox", "Preto", 350.00, 4, 40, "Trilha");

    Chuteira chuteira1 = new Chuteira("Nike", "Mercurial", "Verde", 800.00, 6, 42, "Campo");
    Chuteira chuteira2 = new Chuteira("Adidas", "Predator", "Preto", 700.00, 8, 41, "Society");
    Chuteira chuteira3 = new Chuteira("Puma", "Future", "Azul", 600.00, 5, 40, "Campo");

    public CalcadosEstoque() {
        calcados.add(tennis1);
        calcados.add(tennis2);
        calcados.add(tennis3);
        calcados.add(bota1);
        calcados.add(bota2);
        calcados.add(bota3);
        calcados.add(chuteira1);
        calcados.add(chuteira2);
        calcados.add(chuteira3);
    }

    public ArrayList<Calcado> getCalcados() {
        return calcados;
    }

    public void mostrarCalcados() {
        for (Calcado calcado : calcados) {
            calcado.mostrarInformacoes();
        }
    }

}