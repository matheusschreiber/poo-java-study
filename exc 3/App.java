import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<FormaGeometrica> formas = new LinkedList<>();
        
        formas.add(new Circulo(2));
        formas.add(new Retangulo(3, 2));
        formas.add(new Triangulo(1, 1, 1*Math.sqrt(2)));

        for (FormaGeometrica f : formas){
            System.out.printf("Imprimindo %s (area: %.2f perimetro: %.2f)\n", f.getNome(), f.getArea(), f.getPerimetro());
        }
    }
}
