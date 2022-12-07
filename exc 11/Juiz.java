public class Juiz extends Pessoa {

  private String nome;
  private String emprego;
  private int anos;
  private double salario = 1230.324;

  public Juiz(String nome, String emprego, int anos) {
    this.nome = nome;
    this.emprego = emprego;
    this.anos = anos;
  }

  @Override
  public void comer() {
    System.out.println("Comendo");    
  }

  @Override
  public void trabalhar() {
    System.out.println(this.nome + " está trabalhando como " + this.emprego);
  }

  public int getAnos() {
    return anos;
  }

  public void setAnos(int anos) {
    this.anos = anos;
  }  

  public double getSalario(){
    return this.salario;
  }
  
}
