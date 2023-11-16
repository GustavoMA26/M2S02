package list_m02s02.Ex1;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
//inicializa com os valores que recebeu = THIS
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String exibirData() {
        //colocar o this pois estamos falando dos atributos do objeto que invocou este método;
        return String.format("%d/%d/%d",this.dia, this.mes, ano);
    }
}

