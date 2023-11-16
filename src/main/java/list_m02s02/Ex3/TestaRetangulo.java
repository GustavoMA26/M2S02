package list_m02s02.Ex3;

import java.util.Locale;
import java.util.Scanner;

public class TestaRetangulo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Insira o comprimento do retangulo: ");
        retangulo.setComprimento(input.nextDouble());
        System.out.println("Insira a largura do retangulo: ");
        retangulo.setLargura(input.nextDouble());

        System.out.printf("Area = %.2f %n", retangulo.area());
        System.out.printf("Perimetro = %.2f", retangulo.perimetro());

    }
}
