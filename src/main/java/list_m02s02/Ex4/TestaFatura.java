package list_m02s02.Ex4;

import java.util.Locale;
import java.util.Scanner;

public class TestaFatura {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);
        Fatura fatura = new Fatura();

        System.out.println("Insira o número da fatura: ");
        fatura.setNumero(input.nextLine());
        System.out.println("Insira a descrição da fatura: ");
        fatura.setDescricao(input.nextLine());
        System.out.println("Insira a quantidade de itens da fatura: ");
        fatura.setQuantidadeComprada(input.nextInt());
        System.out.println("Insira o preço dos itens da fatura: ");
        fatura.setPrecoPorItem(input.nextDouble());


        System.out.printf("O valor total da fatura é: %.2f", fatura.getValorFatura());

    }
}
