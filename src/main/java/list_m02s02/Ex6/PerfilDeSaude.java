package list_m02s02.Ex6;

import java.time.LocalDate;

public class PerfilDeSaude {

    private String nome;
    private String sobrenome;
    private String sexo;
    private String dataNascimento;

    private double altura;

    private double peso;

    public PerfilDeSaude() {

    }
    public PerfilDeSaude(String nome, String sobrenome, String sexo,
                         String dataNascimento, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Integer calculaIdade() {
        LocalDate atual = LocalDate.now();
        int ano = atual.getYear();
        int mes = atual.getMonthValue();
        int dia = atual.getDayOfMonth();

        String[] dataNasc = this.dataNascimento.split("/");

        int anoDataNasc = Integer.parseInt(dataNasc[2]);
        int mesDataNasc = Integer.parseInt(dataNasc[1]);
        int diaDataNasc = Integer.parseInt(dataNasc[0]);

        int idade = ano - anoDataNasc;
        if(mes < mesDataNasc) {
            idade--;
        } else if (mes == mesDataNasc) {
            if(dia < diaDataNasc) {
                idade--;
            }
        }
        return idade;
    }

    public int frequenciaCardiacaMax() {
        return 220 - calculaIdade();
    }

    public double[] frequenciaCardiacaAlvo() {
        double[] intervaloFrequencia = new double[2];
        intervaloFrequencia[0] = frequenciaCardiacaMax() * 0.5;
        intervaloFrequencia[1] = frequenciaCardiacaMax() * 0.85;
        return intervaloFrequencia;
    }

    public double imc () {
        return this.peso / (this.altura * this.altura);
    }

}
