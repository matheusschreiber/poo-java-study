
public class Retangulo extends FormaGeometrica {
    private double altura, largura;

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double getPerimetro() {
        return 2*altura+2*largura;
    }

}
