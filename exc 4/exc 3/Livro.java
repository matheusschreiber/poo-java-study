public class Livro extends Produto{
  private String autor;

  public Livro(String nome, Double preco, String autor){
    this.nome = nome;
    this.preco = preco;
    this.autor = autor;
    this.tipo = "Livro ";
  }

  @Override
  public String toString() {    
    return super.toString() + " Autor:" + this.autor;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

}
