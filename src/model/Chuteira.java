package model;

public class Chuteira extends Calcado{
    private String tipoChuteira;

    public Chuteira(String marca, String modelo, String cor, double preco, int quantidade, int tamanho, String tipoChuteira) {
        super(marca, modelo, cor, preco, quantidade, tamanho);
        this.tipoChuteira = tipoChuteira;
    }

    public String getTipoChuteira() {
        return tipoChuteira;
    }

    public void setTipoChuteira(String tipoChuteira) {
        this.tipoChuteira = tipoChuteira;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Tipo de Chuteira: " + tipoChuteira);
        System.out.println();
    }

}
