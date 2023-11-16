package list_m02s02.Ex5;

import java.util.Scanner;

public class TestaFrequenciaCardiaca {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Qual a sua data de nascimento? dd/MM/YYYY");
        String dataNascimento = input.nextLine();

        FrequenciaCardiaca frequenciaCardiaca =
                new FrequenciaCardiaca("Gustavo", "Almeida", dataNascimento);

        System.out.printf("Idade: %d %nFrequencia Cardíaca Máxima: %d %nIntervalo Ideal: %.1f - %.1f",
                frequenciaCardiaca.calculaIdade(), frequenciaCardiaca.frequenciaCardiacaMax(), frequenciaCardiaca.frequenciaCardiacaAlvo()[0],
                frequenciaCardiaca.frequenciaCardiacaAlvo()[1]);
    }
}
