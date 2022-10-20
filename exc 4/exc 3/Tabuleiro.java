public class Tabuleiro extends Produto{
  private int idade;

  public Tabuleiro(String nome, Double preco, int idade){
    this.nome = nome;
    this.preco = preco;
    this.idade = idade;
    this.tipo = "Tabuleiro ";
  }

  @Override
  public String toString() {    
    return super.toString() + " Idade: " + this.idade + " anos";
  }

  public int getIdade() {
    return this.idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

}
