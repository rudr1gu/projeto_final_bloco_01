package repository;

import model.Calcado;

public interface CalcadoRepository {

    public void adicionarCalcado(Calcado calcado);
    public void AtualizarEstoque(Calcado calcado);
    public void removerCalcado(Calcado calcado);
    public void mostrarCalcados();
    public void mostrarCalcadosPorMarca(String marca);
    public void mostrarCalcadosPorModelo(String modelo);
    public void mostrarCalcadosPorTamanho(int tamanho);
}