public class Circulo extends FormaGeometrica{
    private double area;
    private double perimetro;
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
        this.area = calculaArea();
        this.perimetro = calculaPerimetro();
        this.setNome("circulo");
    }

    public double calculaArea(){
        return Math.PI*Math.pow(this.raio, 2);
    }

    public double calculaPerimetro(){
        return Math.PI*2*this.raio;
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
