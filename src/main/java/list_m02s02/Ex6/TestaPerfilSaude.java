package list_m02s02.Ex6;

import java.util.Scanner;

public class TestaPerfilSaude {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        PerfilDeSaude perfil = new PerfilDeSaude();

        System.out.println("Digite seu peso: ");
        double peso = Double.parseDouble(input.nextLine());
        System.out.println("Digite sua altura: ");
        double altura = Double.parseDouble(input.nextLine());
        System.out.println("Digite sua data de nascimento: ");
        String dataNasc = input.nextLine();

        perfil.setPeso(peso);
        perfil.setAltura(altura);
        perfil.setAltura(altura);
        perfil.setDataNascimento(dataNasc);

        System.out.printf("Idade: %d %n IMC: %.2f %n Frequencia Cardiaca Max: %d %n Frequecia Cardiaca Alvo: %.2f - %.2f",
                perfil.calculaIdade(), perfil.imc(), perfil.frequenciaCardiacaMax(), perfil.frequenciaCardiacaAlvo()[0],perfil.frequenciaCardiacaAlvo()[1] );

    }
}
