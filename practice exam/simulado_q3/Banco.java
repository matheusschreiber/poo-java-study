package simulado_q3;


public class Banco {
  private String nome;
  private Agencia agencia;  

  public Banco(String nome) {
    this.nome = nome;
  }
  
  //TODO: fazer isso da forma certa
  public Agencia criaAgencia(String nome){
    this.agencia = new Agencia(nome);
    return this.agencia;
  }

  public double getSaldoMedio(){
    return agencia.mediaSaldos();
  }

  @Override
  public String toString(){
    return "Nome do Banco: " + this.nome + "\n" 
      + "Agência: " + this.agencia.getNome()
      + ", saldo médio: " + this.getSaldoMedio();

      //FIXME: a entrada do saldo pela entrada padrão 
      //está configurada para virgula e nao ponto
  }
  
}
