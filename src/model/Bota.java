package model;

public class Bota extends Calcado{
    private String tipoBota;

    public Bota(String marca, String modelo, String cor, double preco, int quantidade, int tamanho, String tipoBota) {
        super(marca, modelo, cor, preco, quantidade, tamanho);
        this.tipoBota = tipoBota;
    }

    public String getTipoBota() {
        return tipoBota;
    }

    public void setTipoBota(String tipoBota) {
        this.tipoBota = tipoBota;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Tipo de Bota: " + tipoBota);
        System.out.println("");
    }
}
