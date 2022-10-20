public class App {
  public static void main(String args[]) {
    Corrente cliente1 = new Corrente();

    int log;

    log = cliente1.Deposita(1000);

    if (log==0) System.out.println("ERRO AO DEPOSITAR");

    log = cliente1.Saque(500);
    
    if (log==0) System.out.println("ERRO AO SACAR");

    System.out.println("Saldo cliente normal: " + cliente1.Saldo());

    CorrenteEspecial cliente2 = new CorrenteEspecial();

    log = cliente2.Deposita(1000);

    if (log==0) System.out.println("ERRO AO DEPOSITAR");

    log = cliente2.Saque(500);
    
    if (log==0) System.out.println("ERRO AO SACAR");

    System.out.println("Saldo cliente especial: " + cliente2.Saldo());
  }  
}
