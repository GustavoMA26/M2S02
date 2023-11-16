package list_m02s02.Ex1;

import java.util.Scanner;

public class TestaData {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um dia do mês: ");
        int dia = input.nextInt();
        System.out.println("Digite um mês: ");
        int mes = input.nextInt();
        System.out.println("Digite um ano: ");
        int ano = input.nextInt();

        Data data = new Data(dia, mes, ano);

        System.out.println(data.exibirData());





    }
}
