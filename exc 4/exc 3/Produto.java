public class Produto {
  protected String nome;
  protected double preco;
  protected String tipo;

  public Produto(){}

  @Override
  public String toString() {
    return "Tipo: " + this.tipo + "Nome: " + this.nome + " Preço: R$" + this.preco;
  }
}
