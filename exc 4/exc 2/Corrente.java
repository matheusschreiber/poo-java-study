public class Corrente {
  protected double saldo;
  
  public Corrente(){}

  public int Deposita(double valor){
    this.saldo += valor;
    return 1;
  }

  public int Saque(double valor){
    if (this.saldo>valor) {
      this.saldo-=valor*1.005;
      return 1;
    }

    return 0;
  }

  public double Saldo(){
    return this.saldo;
  }

}