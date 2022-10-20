public class Triangulo extends FormaGeometrica {
    private double area;
    private double perimetro;
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.area = calculaArea();
        this.perimetro = calculaPerimetro();
        this.setNome("triangulo");
    }

    public double calculaArea(){
        double s = (this.lado1 + this.lado2 + this.lado3)/2;
        return Math.sqrt(s*(s-this.lado1)*(s-this.lado2)*(s-this.lado3));
    }

    public double calculaPerimetro(){
        return this.lado1 + this.lado2 + this.lado3;
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
