public class CorrenteEspecial extends Corrente {
  
  @Override
  public int Saque(double valor){
    if (this.saldo>valor) {
      this.saldo-=valor*1.001;
      return 1;
    }

    return 0;
  }
}
