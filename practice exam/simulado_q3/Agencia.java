package simulado_q3;

import java.util.LinkedList;

public class Agencia {
  private LinkedList<Conta> contas = new LinkedList<Conta>();
  private String nome;
  private double somaSaldos=0;

  public void adicionaConta(Conta c) {
    this.contas.add(c);
    this.somaSaldos += c.getSaldo();
  }

  public double mediaSaldos() {
    return somaSaldos/contas.size();
  }

  public Agencia(String nome){
    this.nome = nome;
  }
  
  public String getNome() {
    return nome;
  }
  
}
