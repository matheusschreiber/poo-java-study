public class Funcionario {
    private String nome;
    private int id;
    private float salario;

    // CONSTRUTOR
    public Funcionario(String nome, int id, float salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }

    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
