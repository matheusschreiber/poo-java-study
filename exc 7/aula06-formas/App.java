import java.util.List;
import java.util.LinkedList;

public class App
{
    public static void main(String[] args)
    {
        List<FormaGeometrica> formas = new LinkedList<>();

        // Math.PI
        // Math.pow(a, b)

        formas.add(new Circulo(2.0));
        formas.add(new Retangulo(3.0,2.0));
        formas.add(new Triangulo(1.0, 1.5, 2.0));

        for (FormaGeometrica f : formas)
        {
            System.out.println(f);
            System.out.println("O perímetro é = "+f.getPerimetro());
        }

    }
}