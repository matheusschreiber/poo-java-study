public class Triangulo {
  private Ponto p1;
  private Ponto p2;
  private Ponto p3;

  public Triangulo(Ponto p1, Ponto p2, Ponto p3) {
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;
  }

  public double Perimetro(){
    double dist1 = Math.sqrt(Math.pow(p1.getX()-p2.getX(), 2)  +  Math.pow(p1.getY()-p2.getY(), 2));
    double dist2 = Math.sqrt(Math.pow(p2.getX()-p3.getX(), 2)  +  Math.pow(p2.getY()-p3.getY(), 2));
    double dist3 = Math.sqrt(Math.pow(p3.getX()-p1.getX(), 2)  +  Math.pow(p3.getY()-p1.getY(), 2));

    return dist1 + dist2 + dist3;
  }  

}
