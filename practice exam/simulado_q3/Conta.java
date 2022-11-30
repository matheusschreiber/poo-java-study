package simulado_q3;

public class Conta {
  private String nomeCliente;
  private double saldo;

  public Conta(String n, double s){
    this.nomeCliente = n;
    this.saldo = s;
  }

  public String getNomeCliente() {
    return nomeCliente;
  }

  public double getSaldo() {
    return saldo;
  }

}
