package list_m02s02.Ex4;

public class Fatura {
    private String numero;
    private String descricao;
    private int quantidadeComprada;
    private double precoPorItem;

public Fatura () {

}
public Fatura (String numero, String descricao, int quantidadeComprada, double precoPorItem) {
    this.numero = numero;
    this.descricao = descricao;
    setQuantidadeComprada(quantidadeComprada);
    setPrecoPorItem(precoPorItem);
}

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = Math.max(quantidadeComprada, 0);
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
        this.precoPorItem = Math.max(precoPorItem, 0);
    }

    public double getValorFatura () {
        return this.quantidadeComprada * this.precoPorItem;
    }
}