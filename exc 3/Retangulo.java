public class Retangulo extends FormaGeometrica {
    private double area;
    private double perimetro;
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.area = calculaArea();
        this.perimetro = calculaPerimetro();
        this.setNome("retangulo");
    }

    public double calculaArea(){
        return this.base*this.altura;
    }

    public double calculaPerimetro(){
        return (this.base+this.altura)*2;
    }

    @Override
    public double getArea(){
        return this.area;
    }

    @Override
    public double getPerimetro(){
        return this.perimetro;
    }
}
