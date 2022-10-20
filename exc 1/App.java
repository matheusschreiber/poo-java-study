import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws InterruptedException{
        
        String escalacaoC[] = {
            "Rafael Cabral",
            "Wesley Gasolina",
            "Wagner Leonardo",
            "Zé Ivaldo",
            "Matheus Bidu",
            "Leonardo",
            "Rômulo",
            "Bruno Rodrigues",
            "Waguininho",
            "Lincoln",
            "Eduardo Brock"
        };

        String escalacaoA[] = {
            "Gabriel Delfim",
            "Guga",
            "Junior Alonso",
            "Réver Capitão",
            "Otávio",
            "Dodô",
            "Hulk",
            "Jair",
            "Eduardo Vargas",
            "Nathan Silva",
            "Matías Zaracho"
        };

        Time c = new Time("Cruzeiro", "Belo Horizonte", escalacaoC);
        Time a = new Time("Atlético", "Belo Horizonte", escalacaoA);
        
        Partida p1 = new Partida(c, a, LocalDate.of(2022, 9, 20));
        p1.imprime(false);
        p1.comecaPartida();


    }
}






