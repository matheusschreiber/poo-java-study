
public class Circulo extends FormaGeometrica {

    private double raio;

    public double getRaio() {
        return raio;
    }


    public Circulo(double raio)
    {
        this.raio=raio;
    }


    @Override
    public double getPerimetro() {
        return 2*Math.PI*raio;
    }

    @Override public String toString()
    {
        return "Círculo de raio: "+raio;
    }


}
