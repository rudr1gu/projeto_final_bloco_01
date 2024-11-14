package Controller;

import database.CalcadosEstoque;
import model.Calcado;
import repository.CalcadoRepository;

public class CalcadoController implements CalcadoRepository {

    CalcadosEstoque calcadosEstoque = new CalcadosEstoque();
    

    @Override
    public void AtualizarEstoque(Calcado calcado) {
        if (calcadosEstoque.getCalcados().contains(calcado)) {
            calcadosEstoque.getCalcados().add(calcado);
        } else {
            System.out.println("Calcado não encontrado");
        }
    }

    @Override
    public void removerCalcado(Calcado calcado) {
        if (calcadosEstoque.getCalcados().contains(calcado)) {
            calcadosEstoque.getCalcados().remove(calcado);
            
        } else {
            System.out.println("Calcado não encontrado");
        }
    }

    @Override
    public void mostrarCalcados() {
        calcadosEstoque.mostrarCalcados();
    }

    @Override
    public void mostrarCalcadosPorMarca(String marca) {
        for (Calcado calcado : calcadosEstoque.getCalcados()) {
            if (calcado.getMarca().equalsIgnoreCase(marca)) {
                calcado.mostrarInformacoes();
            } 
        }
    }

    @Override
    public void mostrarCalcadosPorModelo(String modelo) {
        for (Calcado calcado : calcadosEstoque.getCalcados()) {
            if (calcado.getModelo().equalsIgnoreCase(modelo)) {
                calcado.mostrarInformacoes();
            }
        }
    }

    @Override
    public void mostrarCalcadosPorTamanho(int tamanho) {
        for (Calcado calcado : calcadosEstoque.getCalcados()) {
            if (calcado.getTamanho() == tamanho) {
                calcado.mostrarInformacoes();
            }
        }
    }

    public void comprarCalcado(Calcado calcado) {
        if(calcadosEstoque.getCalcados().contains(calcado) && calcado.getQuantidade() > 0) {
            calcado.setQuantidade(calcado.getQuantidade() - 1);
            System.out.println("Compra realizada com sucesso!");
        } else {
            System.out.println("Produto não encontrado ou sem estoque");
        }   
    }

    public Calcado buscarCalcadoPorModelo(String modelo) {
        for (Calcado calcado : calcadosEstoque.getCalcados()) {
            if (calcado.getModelo().equalsIgnoreCase(modelo)) {
                return calcado;
            }
        }
        return null;
    }
}