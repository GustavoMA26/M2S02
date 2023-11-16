package list_m02s02.Ex5;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FrequenciaCardiaca {
    private String nome;
    private String sobrenome;
    private String dataNascimento;

    public FrequenciaCardiaca(String nome, String sobrenome, String dataNascimento){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
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

}



