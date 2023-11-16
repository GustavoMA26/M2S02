package list_m02s02.Ex3;

public class Retangulo {
    private double comprimento = 1;

    private double largura = 1;
    public double getComprimento() {
        return comprimento;
    }
    public void setComprimento(double comprimento) {
        if(comprimento >= 0 && comprimento <= 20) {
            this.comprimento = comprimento;
        } else {
            System.out.println("Comprimento deve estar entre 0 e 20");
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if(largura > 0 && largura < 20) {
            this.largura = largura;
        } else {
            System.out.println("Largura deve estar entre 0 e 20");
        }

    }

    public double perimetro() {
        return  2 * (this.comprimento + this.largura);
    }

    public double area() {
        return this.comprimento * this.largura ;
    }
}


