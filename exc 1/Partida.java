import java.time.LocalDate;

public class Partida {
    private Time timeA;
    private Time timeB;
    private int saldoA;
    private int saldoB;
    private LocalDate date;
    private String local;

    public Partida(Time timeA, Time timeB, LocalDate date) {
        this.timeA = timeA;
        this.timeB = timeB;
        this.date = date;
        this.saldoA = 0;
        this.saldoB = 0;

        if (Math.random()>.5) this.local = this.timeA.getCidadeSede();
        else this.local = this.timeB.getCidadeSede();

    }
    
    public Time getTimeA() {
        return timeA;
    }
    public void setTimeA(Time timeA) {
        this.timeA = timeA;
    }
    public Time getTimeB() {
        return timeB;
    }
    public void setTimeB(Time timeB) {
        this.timeB = timeB;
    }
    public int getSaldoA() {
        return saldoA;
    }
    public void setSaldoA(int saldoA) {
        this.saldoA = saldoA;
    }
    public int getSaldoB() {
        return saldoB;
    }
    public void setSaldoB(int saldoB) {
        this.saldoB = saldoB;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void imprime(Boolean rapido){
        if (rapido) {
            // FIXME: Remover prints da classe
            System.out.printf("RESULTADO FINAL: %s %d x %d %s\n", this.timeA.getNome(), this.saldoA, this.saldoB, this.timeB.getNome());
        } else {
            // FIXME: Remover prints da classe
            System.out.printf("%s (%s) %d x %d %s (%s)", this.timeA.getNome(), 
                this.timeA.getCidadeSede(), this.saldoA, this.saldoB,
                this.timeB.getNome(), this.timeB.getCidadeSede());
            
            // FIXME: Remover prints da classe
                System.out.printf("\nLOCAL DA PARTIDA: %s\nDATA DA PARTIDA: %s\n", this.local, this.date);
        }
        
    }

    public void fazGol(Time time, String jogador){
        // FIXME: Remover prints da classe
        System.out.printf("\n\n=====================================================\n\n");

        if (time == this.timeA) {
            this.saldoA++;
            // FIXME: Remover prints da classe
            System.out.printf("GOL DE %s PARA %s (%s %d x %d %s)", jogador, this.timeA.getNome(), 
                this.timeA.getNome(), this.saldoA, this.saldoB, this.timeB.getNome());
        } else if (time == this.timeB) {
            this.saldoB++;
            // FIXME: Remover prints da classe
            System.out.printf("GOL DE %s PARA %s (%s %d x %d %s)", jogador, this.timeB.getNome(), 
                this.timeA.getNome(), this.saldoA, this.saldoB, this.timeB.getNome());
        }

        // FIXME: Remover prints da classe
        System.out.printf("\n\n=====================================================\n\n");
    }

    public void acontecimento(double aleatorio){
        // FIXME: Remover prints da classe
        if (aleatorio>.13 && aleatorio<.14) System.out.printf("CARTÃO AMARELO PARA %s\n", this.timeA.getNome());
        // FIXME: Remover prints da classe
        else if (aleatorio>.14 && aleatorio<.15) System.out.printf("CARTÃO AMARELO PARA %s\n", this.timeB.getNome());
        // FIXME: Remover prints da classe
        else if (aleatorio>.15 && aleatorio<.155) System.out.printf("CARTÃO VERMELHO PARA %s\n", this.timeA.getNome());
        // FIXME: Remover prints da classe
        else if (aleatorio>.155 && aleatorio<.16) System.out.printf("CARTÃO VERMELHO PARA %s\n", this.timeB.getNome());
    }

    public void comecaPartida() throws InterruptedException {
        int minutos = 0;
        while (minutos <= 90) {
            
            double aleatorio = Math.random();
            
            Thread.sleep(10);
            int jogador = (int)(Math.random()*11);

            if (aleatorio>.1 && aleatorio<.12) fazGol(this.timeA, this.timeA.getEscalacao()[jogador]);
            else if (aleatorio>.12 && aleatorio<.14) fazGol(this.timeB, this.timeB.getEscalacao()[jogador]);
            
            if (minutos == 46) {
                // FIXME: Remover prints da classe
                System.out.printf("INTERVALO!\n");
                Thread.sleep(3000);
            }
            
            this.acontecimento(aleatorio);

            Thread.sleep(300);
            // FIXME: Remover prints da classe
            System.out.printf("%02d'\n", minutos);
            minutos ++;
        }

        this.imprime(true);
    }

}
