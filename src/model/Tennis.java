package model;

public class Tennis extends Calcado{
    private String tipoTennis;

    public Tennis(String marca, String modelo, String cor, double preco, int quantidade, int tamanho , String tipoTennis) {
        super(marca, modelo, cor, preco, quantidade, tamanho);
        this.tipoTennis = tipoTennis;
    }

    public String getTipoTennis() {
        return tipoTennis;
    }

    public void setTipoTennis(String tipoTennis) {
        this.tipoTennis = tipoTennis;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Tipo de Tennis: " + tipoTennis);
    }

}
