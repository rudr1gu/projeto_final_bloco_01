package repository;

import model.Calcado;

public interface CalcadoRepository {
    void adicionarCalcado(Calcado calcado);
    void removerCalcado(Calcado calcado);
    void mostrarCalcados();
    void mostrarCalcadosPorMarca(String marca);
    void mostrarCalcadosPorModelo(String modelo);
    void mostrarCalcadosPorTamanho(int tamanho);
}